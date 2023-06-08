import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GUI extends JFrame implements ActionListener {
    private static final int FRAME_WIDTH = 1500;
    private static final int FRAME_HEIGHT = 500;

    private JTextArea inTxtArea;
    private JTextArea outTxtArea;
    private JTextArea inLineNumbersTextArea;
    private JTextArea outLineNumbersTextArea;
    private JPanel start;

    public GUI() {
        super("Java to Python converter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        start = startPanel();
        add(start, BorderLayout.CENTER);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Start")) {
            remove(start);
            add(mainPanel(), BorderLayout.CENTER);
            revalidate();
            repaint();
        } else if (e.getActionCommand().equals("Parse")) {
            String input = inTxtArea.getText();
            String[] inputLines = input.split("\n");

            StringBuilder numberedInput = new StringBuilder();
            for (int i = 0; i < inputLines.length; i++) {
                numberedInput.append(inputLines[i]).append("\n");
            }

            CharStream inputCharStream = CharStreams.fromString(input);
            SimpleJavaLexer lexer = new SimpleJavaLexer(inputCharStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            SimpleJavaParser parser = new SimpleJavaParser(tokens);

            SimpleJavaErrorListener errorListener = new SimpleJavaErrorListener(inTxtArea);
            parser.addErrorListener(errorListener);

            ParseTree tree = parser.compilationUnit();
            ParseTreeWalker walker = new ParseTreeWalker();
            JavaToPythonConverter converter;
            try {
                converter = new JavaToPythonConverter("PythonCode.py");
                walker.walk(converter, tree);
                converter.close();

                String pythonCode = converter.getPythonCode();
                String[] pythonLines = pythonCode.split("\n");
                StringBuilder numberedPythonCode = new StringBuilder();
                for (int i = 0; i < pythonLines.length; i++) {
                    numberedPythonCode.append(pythonLines[i]).append("\n");
                }

                outTxtArea.setText(numberedPythonCode.toString());
                inTxtArea.setText(numberedInput.toString());
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Conversion Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private JPanel startPanel() {
        JPanel startPanel = new JPanel();
        JButton startButton = new JButton("Start");
        startButton.addActionListener(this);
        startPanel.add(startButton, BorderLayout.CENTER);

        return startPanel;
    }

    private JPanel mainPanel() {
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

        inTxtArea = new JTextArea();
        outTxtArea = new JTextArea();
        inTxtArea.setBorder(BorderFactory.createEmptyBorder());
        outTxtArea.setBorder(BorderFactory.createEmptyBorder());

        JPanel panel = new JPanel(new GridLayout(1, 2));
        JScrollPane inScrollPane = new JScrollPane(inTxtArea);
        JScrollPane outScrollPane = new JScrollPane(outTxtArea);

        JPanel inLineNumbersPanel = new JPanel(new BorderLayout());
        inLineNumbersTextArea = new JTextArea();
        inLineNumbersTextArea.setEditable(false);
        inLineNumbersTextArea.setBackground(new Color(240, 240, 240));
        inLineNumbersTextArea.setBorder(BorderFactory.createEmptyBorder());

        inScrollPane.setRowHeaderView(inLineNumbersPanel);
        inLineNumbersPanel.add(inLineNumbersTextArea, BorderLayout.CENTER);

        JPanel outLineNumbersPanel = new JPanel(new BorderLayout());
        outLineNumbersTextArea = new JTextArea();
        outLineNumbersTextArea.setEditable(false);
        outLineNumbersTextArea.setBackground(new Color(240, 240, 240));
        outLineNumbersTextArea.setBorder(BorderFactory.createEmptyBorder());

        outScrollPane.setRowHeaderView(outLineNumbersPanel);
        outLineNumbersPanel.add(outLineNumbersTextArea, BorderLayout.CENTER);

        JPanel inPanel = new JPanel(new BorderLayout());
        JPanel outPanel = new JPanel(new BorderLayout());

        inPanel.setBorder(BorderFactory.createTitledBorder("Input"));
        outPanel.setBorder(BorderFactory.createTitledBorder("Output"));

        inPanel.add(inScrollPane, BorderLayout.CENTER);
        outPanel.add(outScrollPane, BorderLayout.CENTER);

        JButton parseButton = new JButton("Parse");
        parseButton.addActionListener(this);

        panel.add(inPanel, BorderLayout.WEST);
        panel.add(outPanel, BorderLayout.EAST);

        mainPanel.add(panel, BorderLayout.CENTER);
        mainPanel.add(parseButton, BorderLayout.SOUTH);

        inTxtArea.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateLineNumbers(inLineNumbersTextArea, inTxtArea);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateLineNumbers(inLineNumbersTextArea, inTxtArea);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateLineNumbers(inLineNumbersTextArea, inTxtArea);
            }
        });

        outTxtArea.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateLineNumbers(outLineNumbersTextArea, outTxtArea);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateLineNumbers(outLineNumbersTextArea, outTxtArea);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateLineNumbers(outLineNumbersTextArea, outTxtArea);
            }
        });

        return mainPanel;
    }

    private void updateLineNumbers(JTextArea lineNumbersTextArea, JTextArea textArea) {
        try {
            int caretPosition = textArea.getDocument().getLength();
            Rectangle caretRectangle = textArea.modelToView(caretPosition);

            int lineHeight = caretRectangle.height;
            FontMetrics fontMetrics = textArea.getFontMetrics(textArea.getFont());
            int fontAscent = fontMetrics.getAscent();

            String[] lines = textArea.getText().split("\n");
            int lineCount = lines.length;

            List<String> lineNumbers = new ArrayList<>();
            for (int i = 1; i <= lineCount; i++) {
                lineNumbers.add(String.valueOf(i));
            }

            lineNumbersTextArea.setFont(textArea.getFont());
            lineNumbersTextArea.setText(String.join("\n", lineNumbers));
            lineNumbersTextArea.setSize(lineNumbersTextArea.getPreferredSize());
            lineNumbersTextArea.setPreferredSize(new Dimension(lineNumbersTextArea.getPreferredSize().width, caretRectangle.y + lineHeight));

            int lineNumbersWidth = lineNumbersTextArea.getPreferredSize().width + 10;
            textArea.setBorder(BorderFactory.createEmptyBorder(0, lineNumbersWidth, 0, 0));
        } catch (BadLocationException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new GUI();
        });
    }
}


