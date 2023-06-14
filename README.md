======Konwerter Java -> Python======
  *   Dane studentów: Jakub Truszkowski, Jan Stryszewski, Milena Smołka
  *   Dane kontaktowe: truszkowski@student.agh.edu.pl, yanco@student.agh.edu.pl, smolka@student.agh.edu.pl

======Założenia programu======

**Konwerter języka Java (części funkcjonalności) do języka Python napisany w Javie.** 

Oferuje on różne możliwości przekształcania kodu napisanego w języku Java na równoważny kod w języku Python. Oto opis tych możliwości:

  - Konwersja składniowa: Konwerter przekształca składnię kodu Java na składnię Pythona. To obejmuje zamianę nawiasów, klamr, nawiasów kwadratowych oraz znaków przypisania, porównania i logicznych na odpowiednie wcięcia w Pythonie.
  - Obsługa typów danych: Konwerter rozpoznaje typy danych Java, takie jak int, boolean, char, double, long, float i String, i przekształca je na zmienne w Pythonie.
  - Konwersja instrukcji warunkowych: Instrukcje warunkowe, takie jak if-else, są konwertowane na ich równoważne struktury w Pythonie. Konwerter dba o zachowanie odpowiednich wcięć i bloków kodu.
  - Konwersja pętli: Pętle while są konwertowane na równoważne pętle w Pythonie, zapewniając poprawne działanie i składnię.
  - Obsługa funkcji: Funkcje w języku Java są przekształcane na odpowiednie funkcje w Pythonie. Parametry, typy zwracane i instrukcje return są poprawnie konwertowane.
  - Obsługa klas i obiektów: Konwerter jest w stanie rozpoznać definicje klas Java i przekształcić je na odpowiednie klasy w Pythonie.  
  - Zachowanie formatowania: Konwerter stara się zachować odpowiednie wcięcia, formatowanie i porządek instrukcji, aby wygenerowany kod Python był czytelny i zgodny z konwencjami Pythona.
Ważne jest zauważenie, że konwerter Java do Pythona może być ograniczony przez skomplikowane struktury kodu lub różnice pomiędzy językami. Konieczna może być ręczna interwencja w celu dostosowania kodu po konwersji.

  *   Repozytorium: https://github.com/jakubtru/Java-to-Python-converter
======Spis tokenów======
<code>
| LPAREN        	| '('         	|
| RPAREN        	| ')'         	|
| LBRACE        	| '{'         	|
| RBRACE        	| '}'         	|
| LBRACK        	| '['         	|
| RBRACK        	| ']'         	|
| SEMICOLON          	| ';'         	|
| COMMA         	| ','         	|
| DOT           	| '.'         	|
| ASSIGN        	| '='         	|
| MORE          	| '>'         	|
| LESS          	| '<'         	|
| EQUAL         	| '=='        	|
| LESSOREQUAL   	| '<='        	|
| MOREOREQUAL   	| '>='        	|
| NOTEQUAL      	| '!='        	|
| AND           	| '&&'        	|
| OR            	|       	|
| INC           	| '++'        	|
| DEC           	| '- -'        	|
| ADD           	| '+'         	|
| SUB           	| '-'         	|
| MUL           	| '*'         	|
| DIV           	| '/'         	|
| ADD_ASSIGN    	| '+='        	|
| SUB_ASSIGN    	| '-='        	|
| INT           	| 'int'       	|
| BOOLEAN       	| 'boolean'   	|
| CHAR          	| 'char'      	|
| DOUBLE        	| 'double'    	|
| LONG          	| 'long'      	|
| FLOAT         	| 'float'     	|
| STRING        	| 'String'    	|
| CLASS         	| 'class'     	|
| ELSE          	| 'else'      	|
| IF            	| 'if'        	|
| PUBLIC        	| 'public'    	|
| RETURN        	| 'return'    	|
| STATIC        	| 'static'    	|
| VOID          	| 'void'      	|
| WHILE         	| 'while'     	|
</code>
======Gramatyka przetwarzanego formatu:====== 

https://github.com/jakubtru/Java-to-Python-converter/blob/main/src/main/antlr/SimpleJava.g4

Obejmuje ona deklaracje klas, deklaracje pól i metod, instrukcje warunkowe, pętle, instrukcje przypisania, instrukcje return oraz wyrażenia matematyczne i logiczne.

**compilationUnit** określa strukturę całego programu, który może składać się z wielu **classDeclaration**. Każda classDeclaration składa się z modyfikatorów dostępu (np. //Public//), słowa kluczowego //Class//, nazwy klasy (**Identifier**) i **classBody**.
**classBody** zawiera deklaracje pól i metod wewnątrz klasy. **classBodyDeclaration** może być deklaracją metody (**methodDeclaration**) lub pola (**fieldDeclaration**).
**fieldDeclaration** definiuje deklarację pola, która może zawierać typ (//type//), identyfikator (**Identifier**) i średnik (//Semicolon//). Może również zawierać kolejne deklaracje pól lub metod.
**methodDeclaration** odnosi się do deklaracji metody, która może być zwykłą metodą (**normalMethodDeclaration**) lub metodą main (**mainMethodDeclaration**).
W podobny sposób gramatyka definiuje inne konstrukcje, takie jak instrukcje warunkowe (**ifStatement**), pętle (**whileStatement**), instrukcje przypisania (**assignmentStatement**), instrukcje return (**returnStatement**) oraz wyrażenia matematyczne i logiczne.


======Informacja o stosowanych generatorach skanerów/parserów, pakietach zewnętrznych======


Konwerter wykorzystuje narzędzie o nazwie ANTLR 4.13.0

ANTLR (ANother Tool for Language Recognition) to narzędzie do generowania analizatorów składniowych (parserów) i analizatorów leksykalnych (lexerów) dla różnych języków programowania. W przypadku konwertera Javy do Pythona, ANTLR jest wykorzystywany do analizy składniowej kodu źródłowego napisanego w języku Java i generowania odpowiadającego mu kodu źródłowego w języku Python.
  *   Krótka instrukcja obsługi
  - Po uruchomieniu aplikacji zostanie wyświetlony ekran powitalny z opcjami "Manual Input" i "File Input".
  - Wybierz "Manual Input", aby przejść do głównego okna aplikacji, gdzie możesz wprowadzić kod Java do konwersji. Wprowadzony kod Java pojawi się po lewej stronie, a wynikowy kod Python będzie wyświetlany po prawej stronie. Po kliknięciu przycisku "Parse" nastąpi konwersja, a wynikowy kod Python zostanie wyświetlony.
  - Wybierz "File Input", aby otworzyć okno wyboru pliku, w którym możesz wybrać plik z kodem Java do konwersji. Wybrany kod zostanie wczytany i wyświetlony po lewej stronie, a wynikowy kod Python będzie wyświetlany po prawej stronie.
  - Możesz zapisać wynikowy kod Python do pliku, klikając przycisk "Save" i wybierając lokalizację docelową.
  - Aby wyjść z programu, kliknij przycisk "Exit".
