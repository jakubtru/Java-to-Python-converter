import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class GUI extends JFrame implements ActionListener {
    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 500;

    private JTextArea inTxtArea;
    private JTextArea outTxtArea;
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
            CharStream inputCharStream = CharStreams.fromString(input);
            SimpleJavaLexer lexer = new SimpleJavaLexer(inputCharStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            SimpleJavaParser parser = new SimpleJavaParser(tokens);
            ParseTree tree = parser.compilationUnit();
            ParseTreeWalker walker = new ParseTreeWalker();
            JavaToPythonConverter converter;
            try {
                converter = new JavaToPythonConverter("PythonCode.py");
                walker.walk(converter, tree);
                converter.close();
                outTxtArea.setText(CharStreams.fromString(converter.getPythonCode()).toString());
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
        JPanel mainPanel = new JPanel();
        inTxtArea = new JTextArea();
        outTxtArea = new JTextArea();
        JPanel panel = new JPanel(new GridLayout(1, 2));
        JPanel inPanel = new JPanel(new BorderLayout());
        JPanel outPanel = new JPanel(new BorderLayout());
        inPanel.setBorder(BorderFactory.createTitledBorder("Input"));
        outPanel.setBorder(BorderFactory.createTitledBorder("Output"));
        panel.add(inPanel, BorderLayout.WEST);
        panel.add(outPanel, BorderLayout.EAST);
        inPanel.add(inTxtArea, BorderLayout.CENTER);
        outPanel.add(outTxtArea, BorderLayout.CENTER);
        JButton parseButton = new JButton("Parse");
        parseButton.addActionListener(this);
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(panel, BorderLayout.CENTER);
        mainPanel.add(parseButton, BorderLayout.SOUTH);
        return mainPanel;


//        JButton parseButton = new JButton("Parse");
//        JLabel inLabel = new JLabel("Input");
//        parseButton.addActionListener(this);
//        mainPanel.setLayout(new BorderLayout());
//        mainPanel.add(inLabel, BorderLayout.NORTH);
//        mainPanel.add(inTxtArea, BorderLayout.CENTER);
//        mainPanel.add(parseButton, BorderLayout.SOUTH);
//        mainPanel.add(new JLabel("Output"), BorderLayout.WEST);
//        mainPanel.add(outTxtArea, BorderLayout.EAST);
//        return mainPanel;
    }
}
