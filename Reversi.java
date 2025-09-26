Clerk.markdown(
    Text.fillOut(
"""
# Othello (Reversi) in Java

Othello, auch bekannt als _Reversi_, 
ist ein strategisches Brettspiel für zwei Spieler, 
bei dem das Ziel darin besteht, 
die meisten Spielsteine auf 
dem Spielbrett zu haben, wenn das Spiel zu Ende ist. 
Das Spiel wird auf einem 8x8-Brett gespielt, 
wobei die Spieler abwechselnd Spielsteine auf 
das Brett legen. 
Ein Spieler kann nur einen Stein auf ein leeres 
Feld legen, wenn dieser Stein eine oder mehrere 
gegnerische Steine einschließt.
Die eingeschlossenen Steine werden dann in die eigene 
Farbe umgewandelt. Das Spiel endet, 
wenn kein Spieler mehr einen gültigen Zug machen kann. 
Der Spieler mit den meisten Steinen auf dem Brett gewinnt das Spiel.
In diesem Beispiel wird eine einfache Version 
von Othello (Reversi) in Java implementiert. 
Die Implementierung umfasst die Spiellogik, die
Interaktion mit dem Benutzer und die grafische
Darstellung des Spiels. 
Die Implementierung verwendet eine erweiterung 
von _LiveView_ für die grafische 
Darstellung des Spiels und die _Clerk Library_ 
für die Interaktion mit dem Benutzer.

## Spiellogik 
**1. Spielbrett:**

Das Spielbrett wird als 1D-Array mit 
64 Elementen dargestellt, 
wobei jedes Element den Zustand eines 
Feldes auf dem Brett repräsentiert. 
Die Werte 1, -1 und 0 stehen für weiße, 
schwarze und leere Felder.
Das Spielbrett wird durch den Konstruktor 
von der KlasseReversi initialisiert.Als Klassenattribut wird :

**- ein 1D-Array board[]:** verwendet, 
um den Zustand des Spielbretts zu speichern.

**- ein Integer currentPlayer:** verwendet, 
um den aktuellen Spieler zu speichern. 
In diesem Fall beginnt der Spieler mit den 
schwarzen Steinen, 
der durch den Wert -1 repräsentiert wird. 
Der andere Spieler 
(Weiß) wird durch den Wert 1 repräsentiert.

**- ein Simulate logic:** verwendet, 
um die Spiellogik zu simulieren.

**- ein ReversiController controller:** verwendet, 
um die grafische Darstellung des Spiels zu steuern.

**- ein Difficulty difficulty:** verwendet, 
um den Schwierigkeitsgrad des Spiels zu speichern.

Der Konstruktor bereitet das Spiel vor, indem er: 
Den Schwierigkeitsgrad setzt,Den Controller und die 
Spiellogik initialisiert,
Das Spielbrett in den Anfangszustand versetzt,
Den Startspieler festlegt,Die gültigen Züge für 
den Startspieler anzeigt.

**Dieser Konstruktor stellt 
sicher, dass das Spiel sofort nach 
der Erstellung eines 
Reversi-Objekts spielbereit ist. 😊**
```java
${0}
```


""", Text.cutOut("./Reversi.java", "// myFirstTurtle")));

Clerk.markdown(
    Text.fillOut(
"""
**2. Umdrehen der Spielsteine:**

Das Umdrehen der gegnerischen 
Spielsteine ist ein 
zentraler Mechanismus in Reversi. 
Die Methode flipDiscs(position) 
übernimmt diese Aufgabe. 
Sie ruft die Methode getDiscs(position) auf, 
um eine Liste aller Steine zu erhalten, 
die durch den aktuellen Zug umgedreht werden müssen. 
Anschließend werden diese Steine in 
der Farbe des aktuellen Spielers geändert. 
Die Methode getDiscs(position) überprüft 
dabei alle acht möglichen Richtungen 
(horizontal, vertikal und diagonal) 
und sammelt die gegnerischen Steine, 
die zwischen dem neuen Stein und einem 
bereits vorhandenen Stein des Spielers liegen. 
Dieser Prozess stellt sicher, dass nach einer 
gültigen Move die Spielregeln korrekt umgesetzt werden.
```java
${0}
```
""", Text.cutOut("./Reversi.java", "// triangles")))

Clerk.markdown(
    Text.fillOut(
"""
**3. Hilfe bei gültigen Zügen**

In der Reversi-Klasse gibt es die Methode help(), 
die dem Spieler anzeigt, 
wo er gültige Züge machen kann. 
Diese Methode durchläuft 
das gesamte Spielbrett und 
überprüft mit der Methode 
isLegalMove(position), 
ob ein Zug an einer 
bestimmten Position erlaubt ist. 
Wenn ein Zug gültig ist, 
wird das entsprechende 
Feld auf dem Spielbrett markiert, 
sodass der Spieler leicht erkennen kann, wo er 
seinen Stein platzieren darf. 
Dies ist besonders hilfreich für Anfänger, 
da es die Spielregeln 
visuell unterstützt und 
die Spielstrategie vereinfacht.
```java
${0}
```
""", Text.cutOut("./Reversi.java", "//help")));

Clerk.markdown(
    Text.fillOut(
"""
**4. KI-Implementierung**
    
Die KI  ist in der Lage, 
je nach Schwierigkeitsgrad 
unterschiedliche Strategien 
zu verfolgen. 
Die Methode chooseAIMove() 
wählt den besten Zug 
basierend auf dem 
aktuellen Schwierigkeitsgrad aus. 
Für die einfachste 
Stufe (EASY) verwendet die KI 
eine einfache 
Bewertungsfunktion 
(evaluateMove()), 
die nur die Anzahl 
der eroberten Steine berücksichtigt. 
Auf höheren Stufen (MEDIUM und HARD) 
kommen komplexere Heuristiken (evaluateBoard()) 
und der Minimax-Algorithmus (minimax()) zum Einsatz, 
die auch die Kontrolle über 
Eckfelder, Randfelder 
und die Mobilität der Spieler bewerten. 
Dadurch wird die KI mit 
steigendem Schwierigkeitsgrad immer herausfordernder.
Auf der anderen Seite ,um den besten  Zug zu wählen, 
mache ich eine Simulation 
des Spiels nach jedem Zug 
und  es ist möglich dank 
der Methode simulate() in der Klasse Simulate.
```java
${0}
```
""", Text.cutOut("./Reversi.java", "//KI")));


Clerk.markdown(
    Text.fillOut(
"""
**5. Spielende und Gewinnerermittlung**
    
Das Spiel endet, wenn kein Spieler mehr einen 
gültigen Zug machen kann. 
Dies wird in der Methode isGameOver() überprüft, 
die das Spielbrett durchläuft und prüft, 
ob noch gültige Züge für beide 
Spieler möglich sind. 
Sobald das Spiel beendet ist, 
wird die Methode winner() 
aufgerufen, um den Gewinner 
zu ermitteln. 
Diese Methode zählt die Anzahl 
der Steine jedes 
Spielers auf dem Brett und 
vergleicht sie. 
Der Spieler mit den meisten 
Steinen gewinnt das Spiel. 
Bei einem Unentschieden 
wird der Wert 0 zurückgegeben. 
Der Gewinner wird dann 
über den ReversiController angezeigt,
sodass das Spielergebnis 
klar und übersichtlich präsentiert wird.
    
```java
${0}
```
""", Text.cutOut("./Reversi.java", "//Ende")));


Clerk.markdown(
    Text.fillOut(
"""
## Spielprinzip

Das erste, was zu tun ist, um zu beginnen ist, 
das Spiel zu initialisieren, indem sie 
ein Reversi-Objekt erstellen 
und den Schwierigkeitsgrad 
festlegen(Reversi r  = new Reversi(Difficulty.difficulty)). 
Es gibt 4 Schwierigkeitsgrade: 
FRIEND(das Spiel ist zwischen zwei Spielern), EASY, MEDIUM und HARD. 
Der Spieler mit den schwarzen Steinen 
beginnt das Spiel mit der Methode play()  
( ein beispiel ,um einen Zug zu machen, 
 sieht so r.play(4,3) aus). 
Die gültigen Züge für den Startspieler 
werden angezeigt, um den Einstieg zu erleichtern.
    
`
    
```java
${0}
```
""", Text.cutOut("./Reversi.java", "//play")));





import java.util.ArrayList;
import java.util.HashSet;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.IntStream;

enum Difficulty {
    FRIEND,EASY, MEDIUM, HARD
}








// myFirstTurtle
class Reversi  {
    

    int[] board ;
    int currentPlayer  ;
    Simulate logic;
    ReversiController controller;
    Difficulty difficulty;
  


    
    Reversi(Difficulty difficulty) {
        this.difficulty = difficulty;// Setzt den Schwierigkeitsgrad des Spiels
        this.controller = new ReversiController(); // Initialisiert den Controller für die grafische Darstellung
        this.logic = new Simulate();// Setzt den Startspieler (Schwarz beginnt, repräsentiert durch -1)
        this.currentPlayer = -1;//der schwarze Token beginnt
        this.board = new int[64];
        this.initializeBoard();// Setzt das Spielbrett in den Anfangszustand
        this.help();// Zeigt die gültigen Züge für den Startspieler an

        
    }

    void initializeBoard() {
        Arrays.fill(board, 0);
        this.board[27] = 1; // weiß (3, 3)
        this.board[36] = 1; //  weiß (4, 4)
        this.board[28] = -1;  // schwarz (3, 4)
        this.board[35] = -1;  // schwarz (4,3)
    }
    
// myFirstTurtle




// triangles
    Reversi move(int position) {
        if (board[position] == 0) {// Überprüft, ob das Feld leer ist
            board[position] = currentPlayer;// Setzt den Stein des aktuellen Spielers auf das Feld
            controller.drawToken(currentPlayer == 1, position);// Aktualisiert die grafische Darstellung des Spielbretts
            this.flipDiscs(position);// Dreht die gegnerischen Steine um, die durch diesen Zug eingeschlossen werden
            currentPlayer = -currentPlayer;// Wechselt den Spieler
            if(!this.canPlay()){// Überprüft, ob der nächste Spieler einen gültigen Zug machen kann .Wenn nicht, wird der Spieler zurückgesetzt
                currentPlayer = -currentPlayer;
                this.message(currentPlayer);// Gibt eine Nachricht aus, dass der andere Spieler an der Reihe ist
            }           
        }
        return this;
    }
// triangles

    void message(int currentPlayer){
        if(currentPlayer == 1){
            System.out.println("Schwarz ist diesen Zug raus");
        }else{
            System.out.println("Weiß ist diesen Zug raus");
        }
    }

    


    boolean canPlay(){
        return IntStream.range(0, board.length)
                    .anyMatch(this::isLegalMove); //noch möglich zu spielen
    }

// triangles
    Reversi flipDiscs(int position) { // Methode ,um den Token umzudrehen

        for(int flipPosition:this.getDiscs(position)){// Durchläuft alle Steine, die umgedreht werden müssen
            controller.drawToken(currentPlayer == 1, flipPosition); // Aktualisiert die grafische Darstellung des Spielbretts
            board[flipPosition] = currentPlayer; // Dreht den gegnerischen Stein in die Farbe des aktuellen Spielers
        }
        return this;


    }
// triangles

    public boolean isLegalMove(int position) {
        if (board[position] != 0) {
            return false; // Das Feld ist nicht leer
        }

        // Richtungen: oben, unten, links, rechts und die 4 Diagonalen
        int[] directions = {-8, 8, -1, 1, -9, -7, 7, 9};

        // Überprüft alle Richtungen
        return Arrays.stream(directions)
                     .anyMatch(dir -> hasValidCapture(position, dir));
    }

    /*
      Überprüft, ob in einer bestimmten Richtung eine gültige Capture möglich ist.
      position : Die Startposition
      direction: Die Richtung, in der überprüft wird
      return true, wenn eine gültige Capture möglich ist, sonst false
     */
    private boolean hasValidCapture(int position, int direction) {
        int current = position + direction;
        boolean hasCaptured = false;

        // Überprüft, ob die Position innerhalb des Bretts liegt
        while (isValidPosition(current, position, direction)) {
            if (board[current] == -currentPlayer) {
                hasCaptured = true; // Gegnerischer Stein gefunden
                current += direction;
            } else if (board[current] == currentPlayer && hasCaptured) {
                return true; // Gültige Capture
            } else {
                break; // Leeres Feld oder eigener Stein ohne Capture
            }
        }

        return false; // Keine gültige Capture
    }


    public ArrayList<Integer> getDiscs(int position) {
        // Liste für die Token, die umgedreht werden müssen
        ArrayList<Integer> tokensToFlip = new ArrayList<>();
        
        // Richtungen (vertikal, horizontal, diagonal)
        int[] directions = {-1, 1, -8, 8, -9, -7, 7, 9};
    
        for (int direction : directions) {
            // Temporäre Liste für die Token, die vorübergehend umgedreht werden sollen
            ArrayList<Integer> tempFlipped = new ArrayList<>();
            
            // Berechne die aktuelle Position, die überprüft werden muss
            int currentPosition = position + direction;
    
            // Durchlaufe in der aktuellen Richtung, solange wir auf gegnerische Token stoßen
            while (isValidPosition(currentPosition, position, direction) && isOpponentDisc(currentPosition)) {
                tempFlipped.add(currentPosition); // Füge die gegnerischen Pioniere zur temporären Liste hinzu
                currentPosition += direction; // Bewege dich weiter in der gleichen Richtung
            }
    
            // Überprüft, ob die Linie mit einem eigenen Token endet
            if (isValidPosition(currentPosition, position, direction) && isOwnDisc(currentPosition)) {
                tokensToFlip.addAll(tempFlipped); // Füge die gegnerischen Token zur endgültigen Liste hinzu
            }
        }
        return tokensToFlip;
    }
    


    

    
   




    boolean isValidPosition(int position, int start, int direction) {
        // Überprüft ,ob die Position im Spielfeld ist
        if (position < 0 || position >= 64) {
            return false;
        }

        // Überprüft ,ob die horizontalen Bewegungen auf derselben Linie sind  (-1 oder +1)
        if (direction == -1 || direction == 1) {
            return (start / 8) == (position / 8);
        }

        // Überprüft für die Diagonalen Bewegungen(immer angrenzend)
        if (direction == -9 || direction == -7 || direction == 7 || direction == 9) {
            // Vérifier que start et position ne traversent pas les bords de colonne
            int colStart = start % 8;
            int colPosition = position % 8;

            //nach Links (-9, +7), die Kolone darf nicht zunehmen
            if (direction == -9 || direction == 7) {
                return colPosition < colStart;
            }

            // nach reccht (-7, +9), die Kolone darf nicht abnehmen
            if (direction == -7 || direction == 9) {
                return colPosition > colStart;  
            }
        }

        return true;
    }



    private boolean isOpponentDisc(int position) {
        // Überprüft ,ob es den Token des Gegners ist
        return board[position] != 0 && board[position] == -currentPlayer; // Überprüft, ob es den Token des Gegners ist
    }

    private boolean isOwnDisc(int position) {
        // Überprüft ,ob es den gleiche Token ist
        return board[position] != 0 && board[position] == currentPlayer; 
    }



//help
    public ArrayList<Integer> getValidMoves() {
        // Erstelle eine Liste für gültige Züge
        ArrayList<Integer> validMoves = new ArrayList<>();
        
        // Durchlaufe das gesamte Spielfeld (64 Felder)
        for (int i = 0; i < this.board.length; i++) {
            
            // Überprüft, ob der Zug an der Position i gültig ist
            if (isLegalMove(i)) {
                
                // Wenn der Zug gültig ist, füge ihn der Liste der gültigen Züge hinzu
                validMoves.add(i);
            }
        }
        
        // Gibt die Liste der gültigen Züge zurück
        return validMoves;
    }


    Reversi help(){

        for(int validMoves:this.getValidMoves()){
            if (currentPlayer == 1) {
                controller.drawXw(  validMoves  ); // Zeigt die gültigen Züge für den weißen Spieler an
                    
            } else {
                controller.drawXb(  validMoves  ); // Zeigt die gültigen Züge für den schwarzen Spieler an
            }
        }



        
        return this;
    }
//help

    






    int countDiscs(int currentPlayer){
        int n =0;
        for(int i:this.board){
            if(currentPlayer == i){
                n +=1;
            }
        }
        return n;
    }
    
    
    
    
     // Funktion zur Bewertung eines Zugs (EASY)
    int evaluateMove(int move){
        int score = 0;
        Simulate tab = this.logic.simulate(move);
        int capturedPieces = tab.getDiscs(move).size();
        score += capturedPieces * 10; 
        return score;
    }

    
    
        
    
    
    
    // Funktion zur Bewertung eines Zugs (MEDIUM)
    int evaluateBoard(int move) {
        int score = 0;
        
        // Simuliere das Spiel nach dem Zug
        Simulate tab = this.logic.simulate(move);
        
        //  Überprüft, ob der Zug ein Eckfeld erobert
        if (tab.isCorner(move)) {
            score += 100; // Hoher Bonus für das Erobern eines Ecks
        }

        //  Überprüft, ob der Zug in der Nähe eines Eckfeldes ist
        if (tab.isCornerAdjacent(move)) {
            score -= 20; // Malus für Züge in der Nähe von Ecken
        }

        //  Überprüft, ob der Zug auf einem nicht angrenzenden Rand ist
        if (tab.isNonAdjacentEdge(move)) {
            score += 50; // Bonus für Züge auf nicht angrenzenden Rändern
        }

        //  Berechnet die Anzahl der eroberten Token durch diesen Zug
        int capturedPieces = tab.getDiscs(move).size();
        score += capturedPieces * 10; // Punkte für eroberte Token

        // Berechnet die Differenz der möglichen Züge zwischen den Spielern
        int myMoves = tab.getValidMoves().size();
        tab.currentPlayer = -tab.currentPlayer; // Wechselt den Spieler
        int opponentMoves = tab.getValidMoves().size();
        score += (myMoves - opponentMoves) * 5; // Bonus oder Malus je nach Zugmöglichkeiten
        tab.currentPlayer = -tab.currentPlayer; // Setzt den Spieler zurück

        //  Berechnet die Differenz der Token auf dem Brett
        int myDiscs = tab.countDiscs(currentPlayer);
        int opponentDiscs = tab.countDiscs(-currentPlayer);
        score += (myDiscs - opponentDiscs) * 5; // Bonus oder Malus je nach Anzahl der eigenen Token

        // Gibt die Gesamtbewertung des Zugs zurück
        return score;
    }

//KI
        // Funktion zur Auswahl des besten Zugs 
    int chooseBestMove(String b) {
        ArrayList<Integer> validMoves = this.getValidMoves();
        
        // Initialisiert die besten Werte
        int bestScore = Integer.MIN_VALUE;
        int bestMove = -1;

        // Durchläuft alle gültigen Züge
        for (int move : validMoves) {
            int score;
            
            // Überprüft, ob die Bewertung basierend auf dem Board oder einem anderen Kriterium erfolgt
            if ("Board".equals(b)) {
                score = evaluateBoard(move); // Bewertet den Zug (MEDIUM)
            } else {
                score = evaluateMove(move); // Bewertet den Zug (EASY)
            }

            // Wenn der aktuelle Zug besser bewertet wurde, aktualisiere den besten Zug
            if (score > bestScore) {
                bestScore = score;
                bestMove = move;
            }
        }

        // Gibt den besten Zug zurück
        return bestMove;
    } 
//KI





    int evaluateBoard2(Simulate simulate) {
        int score = 0;
        //  Bonus für eroberte Ecken
        int[] corners = {0, 7, 56, 63};
        for (int corner : corners) {
            if (simulate.board[corner] == simulate.currentPlayer) {
                score += 100; // Hoher Bonus für kontrollierte Ecken
            } else if (simulate.board[corner] == -simulate.currentPlayer) {
                score -= 100; // Hoher Malus, wenn der Gegner eine Ecke kontrolliert
            }
        }

        //  Nachbarsteine der Ecken (Malus, wenn wir sie kontrollieren)
        int[] cornerAdjacents = {1, 8, 9, 6, 14, 15, 48, 49, 57, 54, 55, 62};
        for (int pos : cornerAdjacents) {
            if (simulate.board[pos] == simulate.currentPlayer) {
                score -= 20; // Malus, wenn der Spieler diese Felder kontrolliert
            } else if (simulate.board[pos] == -simulate.currentPlayer) {
                score += 20; // Bonus, wenn der Gegner diese Felder kontrolliert
            }
        }

        //  Mobilität: Bonus, wenn viele gültige Züge möglich sind
        int myMoves = simulate.getValidMoves().size();
        simulate.currentPlayer = -simulate.currentPlayer;
        int opponentMoves = simulate.getValidMoves().size();
        score += (myMoves - opponentMoves) * 10; // Bonus basierend auf der Anzahl der möglichen Züge
        simulate.currentPlayer = -simulate.currentPlayer; // Wiederherstellung des aktuellen Spielers

        //  Kontrollierte Steine
        int myDiscs = simulate.countDiscs(simulate.currentPlayer);
        int opponentDiscs = simulate.countDiscs(-simulate.currentPlayer);
        score += (myDiscs - opponentDiscs) * 5; // Bonus oder Malus basierend auf der Anzahl der kontrollierten Steine

        //  Bonus/Malus für kontrollierte Felder am Rand (ohne Ecken)
        int[] edgePositions = {2, 3, 4, 5, 16, 24, 32, 40, 23, 31, 39, 47, 58, 59, 60, 61};
        for (int pos : edgePositions) {
            if (simulate.board[pos] == simulate.currentPlayer) {
                score += 10; // Bonus für kontrollierte Randpositionen
            } else if (simulate.board[pos] == -simulate.currentPlayer) {
                score -= 10; // Malus für vom Gegner kontrollierte Randpositionen
            }
        }

        return score; // Rückgabe des berechneten Scores für den Zug
    }

    
    
    // Transpositionstabelle zur Speicherung der bewerteten Spielfelder
    private HashMap<String, Integer> transpositionTable = new HashMap<>();

    // Funktion zur Umwandlung des Spielfelds in einen eindeutigen Schlüssel
    private String boardToString(int[] board) {
        StringBuilder sb = new StringBuilder();
        for (int cell : board) {
            sb.append(cell); // Fügt den Wert der Zelle hinzu
        }
        return sb.toString(); // Gibt den Schlüssel als Zeichenfolge zurück
    }



        
    int minimax( Simulate tab,int depth, int alpha, int beta, int currentPlayer) {
        // Umwandlung des aktuellen Spielfelds in einen einzigartigen Schlüssel
        String boardKey = boardToString(tab.board);

        //  Wenn das Spielfeld bereits bewertet wurde, gib den gespeicherten Wert zurück
        if (transpositionTable.containsKey(boardKey)) {
            return transpositionTable.get(boardKey);
        }

        //  Wenn die Tiefe 0 erreicht oder das Spiel zu Ende ist, bewerte das Spielfeld
        if (depth == 0 || tab.isGameOver()) {
            int eval = evaluateBoard2(tab); // Bewertung des Spielfelds
            transpositionTable.put(boardKey, eval); // Speichert die Bewertung
            return eval;
        }

        //  Hole alle gültigen Züge
        ArrayList<Integer> validMoves = tab.getValidMoves();
        if (currentPlayer == 1) {
            //  Maximierung des Scores für den AI-Spieler
            int maxEval = Integer.MIN_VALUE;
            for (int move : validMoves) {
                Simulate simulateBoard = tab.simulate(move);
                int eval = minimax(simulateBoard, depth - 1, alpha, beta, simulateBoard.currentPlayer);
                maxEval = Math.max(maxEval, eval);
                alpha = Math.max(alpha, eval);
                if (beta <= alpha) {
                    break; // Elimination von Zweigen
                }
            }
            return maxEval;
        } else {
            //  Minimierung des Scores für den Gegner
            int minEval = Integer.MAX_VALUE;
            for (int move : validMoves) {
                Simulate simulateBoard = tab.simulate(move);
                int eval = minimax(simulateBoard, depth - 1, alpha, beta, simulateBoard.currentPlayer);
                minEval = Math.min(minEval, eval);
                beta = Math.min(beta, eval);
                if (beta <= alpha) {
                    break; // Elimination von Zweigen
                }
            }
            //  Speichern der Bewertung des Spielfelds bevor sie zurückgegeben wird
            transpositionTable.put(boardKey, minEval);

            return minEval;
        }
    }

//KI
        // Funktion, um den besten Zug mit Minimax zu wählen
    int chooseBestMoveWithMinimax(int currentPlayer, int depth) {
        //  Hole alle gültigen Züge
        ArrayList<Integer> validMoves = this.getValidMoves();
        int bestScore = Integer.MIN_VALUE; // Initialisiere den besten Score als kleinsten Wert
        int bestMove = -1; // Initialisiere den besten Zug als ungültig

        //  Iteriere über alle gültigen Züge
        for (int move : validMoves) {
            Simulate tab = this.logic.simulate(move); // Simuliere das Spielfeld nach dem Zug
            //  Bewerte das Spielfeld mit Minimax
            int score = minimax(tab, depth - 1, Integer.MIN_VALUE, Integer.MAX_VALUE, tab.currentPlayer);
            //  Wenn der Score besser ist als der bisherige, aktualisiere den besten Zug
            if (score > bestScore) {
                bestScore = score;
                bestMove = move;
            }
        }

        //  Gib den besten Zug zurück
        return bestMove;
    }






    
    int getGreedyMove(){
        return chooseBestMove("move"); // Einfachste Bewertungsfunktion
    }

    int getHeuristicMove(){
        return this.chooseBestMove("Board"); // Bewertungsfunktion mit Heuristiken(MEDIUM)
    }
    
    int getMinimaxMove(){
        return this.chooseBestMoveWithMinimax(this.currentPlayer, 10); // Minimax-Algorithmus (HARD) 
    }





    int chooseAIMove() {
        return switch (difficulty) {
            case EASY -> getGreedyMove();
            case MEDIUM -> getHeuristicMove();
            case HARD -> getMinimaxMove();
            default -> -1;
        };
    }
//KI



    Reversi remove(){
        for(int i =0;i<board.length ;i++){
            if(board[i] == 0){
                controller.drawGreen(i);  
            }
        }
        return this;
    }


//Ende
    int winner(){
        int n = this.countDiscs(-1);// Anzahl der schwarzen Steine
        int b = this.countDiscs(1); // Anzahl der weißen Steine
        if( n == b){
            return 0;
        }else if(n < b){
            return 1;
        }else{
            return -1;
        }
        
    }
    
    
    
    boolean isGameOver() {
        // Überprüft ,ob es noch gültige Bewegung gibt
        for (int i = 0; i < board.length; i++) {
            if (isLegalMove(i)) {
                return false; // noch möglich zu spielen
            }
        }
    
        // wechselt der Spieler und macht das gleiche Prinzip
        currentPlayer = -currentPlayer;
        for (int i = 0; i < board.length; i++) {
            if (isLegalMove(i)) {
                currentPlayer = -currentPlayer; //Geht züruck zum ursprünglichen Spieler
                return false; // hat noch eine gültige Bewegung
            }
        }
    
        currentPlayer = -currentPlayer; //Geht züruck zum ursprünglichen Spieler 
        return true; // niemand kann mehr spielen
    }

//Ende

    void pause(int millisekunden) {
        try {
            Thread.sleep(millisekunden); // Pausiert den aktuellen Thread für die angegebene Zeit
        } catch (InterruptedException e) {
            e.printStackTrace(); // Druckt den Stacktrace, falls der Thread unterbrochen wird
        }
    }


//play
    // Funktion für das Spielen eines Zugs im Reversi-Spiel
    Reversi play(int col, int row) {
        //  Sicherstellen, dass die Zeilen- und Spaltenwerte innerhalb des gültigen Bereichs liegen
        assert row > 0 && row <= 8 && col > 0 && col <= 8;

        //  Berechne die Position auf dem Spielfeld
        int position = (row - 1) * 8 + (col - 1);
        
        //  Überprüfen, ob der Zug legal ist
        if (!this.isLegalMove(position)) {
            throw new IllegalArgumentException("Ungültiger Zug!"); 
        } else {
            this.remove(); // Entfernt das Hilfezeichen
            this.move(position); // Macht den Zug
            
            //  Wenn der aktuelle Spieler die KI ist und das Spiel noch nicht vorbei ist, wähle den besten Zug für die KI
            while (currentPlayer == 1 && !isGameOver() && this.difficulty != Difficulty.FRIEND) {
                pause(1500); // Pause, um den Zug der KI zu visualisieren
                this.move(this.chooseAIMove());
            }
            
            //  Zeige Hilfe an (Wo mann spielen kann )
            this.help();
        }
        
        // Wenn das Spiel vorbei ist, ermittle den Gewinner und zeige ihn an
        if (this.isGameOver()) {
            int winner = this.winner(); // Bestimme den Gewinner
            controller.showWinner(  winner );    // Zeige den Gewinner an
        }

        return this;
    }

    // Reversi r = new Reversi(Difficulty.FRIEND); wenn du mit einem Freund spielen willst
    // Reversi r = new Reversi(Difficulty.difficulty);(difficulty = HARD || MEDIUM || EASY) wenn du gegen die KI spielen willst
    // r.play(4,3); um einen Zug zu machen zum Beispiel
//play

    

    


    
}



class Simulate {
    int[] board = new int[64];
    int currentPlayer = -1;

    Simulate() {
        this.board[27] = 1;  // blanc (3, 3)
        this.board[36] = 1;  // blanc (4, 4)
        this.board[28] = -1; // noir (3, 4)
        this.board[35] = -1; // noir (4, 3)
    }

    boolean isLegalMove(int position){
        int rows = 8;
        int cols = 8;

        int row = position / cols;
        int col = position % cols;
        if (board[position] != 0){
            return false;
        }

        int[][] directions = {
            {-1, 0}, {1, 0}, {0, -1}, {0, 1}, // Oben, Unten, Links, recht
            {-1, -1}, {-1, 1}, {1, -1}, {1, 1} // Diagonalen
        };

        // geht in alle Richtungen
    for (int[] direction : directions) {
        int dx = direction[0], dy = direction[1];
        int x = row + dx, y = col + dy;
        boolean hasCaptured = false;

        // Überprüft, ob es gegnerische Token gibt, die eingeschlossen werden können
        while (x >= 0 && x < rows && y >= 0 && y < cols && board[x * cols + y] == -currentPlayer) {
            x += dx;
            y += dy;
            hasCaptured = true;
        }

        // Überprüft, ob der Zug in dieser Richtung gültig ist
        if (hasCaptured && x >= 0 && x < rows && y >= 0 && y < cols && board[x * cols + y] == currentPlayer) {
            return true; // Gültiger Zug
        }
    }

    return false;
    }




    boolean canPlay(){
        return IntStream.range(0, board.length)
                    .anyMatch(this::isLegalMove); // noch möglich zu spielen
    }
    
    

    void makeMove(int position) {
        // Überprüft, ob die angegebene Position leer ist
        if (board[position] == 0) {
            // Setzt das Spielfeld auf den aktuellen Spieler
            board[position] = currentPlayer;
            
            // Wechselt den aktuellen Spieler
            currentPlayer = -currentPlayer;
            
            // Überprüft, ob der aktuelle Spieler nach dem Zug noch einen gültigen Zug machen kann
            // Wenn nicht, wird der Spieler zurückgesetzt
            if(!this.canPlay()) {
                currentPlayer = -currentPlayer; // Setzt den Spieler zurück, wenn keiner mehr ziehen kann
            }
        }
    }
    

    Simulate simulate(int move) {
        // Erstellen einer neuen Instanz des Simulate-Objekts
        Simulate clone = new Simulate();
        
        // Erstellen einer Kopie des Boards, um Änderungen an diesem Simulate nicht zu beeinflussen
        clone.board = this.board.clone();
        
        // Kopiert den aktuellen Spieler
        clone.currentPlayer = this.currentPlayer;
        
        // Führt den Zug auf dem geklonten Simulate aus
        clone.makeMove(move);
        
        // Gibt das simulierte (geänderte) Simulate zurück
        return clone;
    }
    


    boolean isNonAdjacentEdge(int move) {
        // Erstellen eines Sets von benachbarten Ecken
        HashSet<Integer> cornerAdjacentsSet = new HashSet<>(Arrays.asList(1, 8, 9, 6, 14, 15, 48, 49, 57, 54, 55, 62));
        
        // Überprüft, ob es sich um einen Rand handelt (außer den Ecken)
        boolean isEdge = (move >= 1 && move <= 6) ||  (move >= 57 && move <= 62) ||  (move % 8 == 0 && move != 0 && move != 56) || (move % 8 == 7 && move != 7 && move != 63);  
    
        // Überprüft, ob der Zug nicht neben einer Ecke liegt
        boolean notAdjacentToCorner = !cornerAdjacentsSet.contains(move);
    
        return isEdge && notAdjacentToCorner;
    }


    boolean isCorner(int position){ // Überprüft, ob die Position eine Ecke ist
        return position == 0 || position == 7 || position ==56 || position == 63;
    }

    public int countDiscs(int currentPlayer){
        int n =0;
        for(int i:this.board){
            if(currentPlayer == i){
                n +=1;
            }
        }
        return n;
    }


    boolean isValidPosition(int position, int start, int direction) {
        // Überprüft ,ob die Position im Spielfeld ist
        if (position < 0 || position >= 64) {
            return false;
        }
    
        // Überprüft ,ob die horizontalen Bewegungen auf derselben Linie sind  (-1 oder +1)
        if (direction == -1 || direction == 1) {
            return (start / 8) == (position / 8);
        }
    
        // Überprüft für die Diagonalen Bewegungen(immer angrenzend)
        if (direction == -9 || direction == -7 || direction == 7 || direction == 9) {
            // Vérifier que start et position ne traversent pas les bords de colonne
            int colStart = start % 8;
            int colPosition = position % 8;
    
            //nach Links (-9, +7), die Kolone darf nicht zunehmen
            if (direction == -9 || direction == 7) {
                return colPosition < colStart;
            }
    
            // nach reccht (-7, +9), die Kolone darf nicht abnehmen
            if (direction == -7 || direction == 9) {
                return colPosition > colStart;
            }
        }
    
        return true;
    }



    private boolean isOpponentDisc(int position) {
        // Überprüft ,ob es den Token des Gegners ist
        return board[position] != 0 && board[position] == -currentPlayer;
    }

    private boolean isOwnDisc(int position) {
        // Überprüft ,ob es den gleiche Token ist
        return board[position] != 0 && board[position] == currentPlayer;
    }




    
    boolean isCornerAdjacent(int position){ // Überprüft, ob die Position in der Nähe einer Ecke ist
        int [] corner = {0,7,56,63};
        int [] directions = {1,7,8,9,-1,-7,-8,-9};
        for(int i:corner){
            for(int direction :directions){
                int currentposition = i+ direction;
                if(isValidPosition(currentposition,i,direction) && position == currentposition){ 
                    return true;
                }
            }
            
        }
        return false;
    }
    
    


    public ArrayList<Integer> getDiscs(int position) {
        // Liste für die Token, die umgedreht werden müssen
        ArrayList<Integer> tokensToFlip = new ArrayList<>();
        
        // Richtungen (vertikal, horizontal, diagonal)
        int[] directions = {-1, 1, -8, 8, -9, -7, 7, 9};
    
        for (int direction : directions) {
            // Temporäre Liste für die Token, die vorübergehend umgedreht werden sollen
            ArrayList<Integer> tempFlipped = new ArrayList<>();
            
            // Berechne die aktuelle Position, die überprüft werden muss
            int currentPosition = position + direction;
    
            // Durchlaufe in der aktuellen Richtung, solange wir auf gegnerische Token stoßen
            while (isValidPosition(currentPosition, position, direction) && isOpponentDisc(currentPosition)) {
                tempFlipped.add(currentPosition); // Füge die gegnerischen Pioniere zur temporären Liste hinzu
                currentPosition += direction; // Bewege dich weiter in der gleichen Richtung
            }
    
            // Überprüft, ob die Linie mit einem eigenen Token endet
            if (isValidPosition(currentPosition, position, direction) && isOwnDisc(currentPosition)) {
                tokensToFlip.addAll(tempFlipped); // Füge die gegnerischen Token zur endgültigen Liste hinzu
            }
        }
        return tokensToFlip;
    }



    public ArrayList<Integer> getValidMoves() {
        // Erstelle eine Liste für gültige Züge
        ArrayList<Integer> validMoves = new ArrayList<>();
        
        // Durchlaufe das gesamte Spielfeld (64 Felder)
        for (int i = 0; i < this.board.length; i++) {
            
            // Überprüft, ob der Zug an der Position i gültig ist
            if (isLegalMove(i)) {
                
                // Wenn der Zug gültig ist, füge ihn der Liste der gültigen Züge hinzu
                validMoves.add(i);
            }
        }
        
        // Gibt die Liste der gültigen Züge zurück
        return validMoves;
    }
    

    

   

    boolean isGameOver() {
        // Überprüft ,ob es noch gültige Bewegung gibt
        for (int i = 0; i < board.length; i++) {
            if (isLegalMove(i)) {
                return false; // noch möglich zu spielen
            }
        }
    
        // wechselt der Spieler und macht das gleiche Prinzip
        currentPlayer = -currentPlayer;
        for (int i = 0; i < board.length; i++) {
            if (isLegalMove(i)) {
                currentPlayer = -currentPlayer; //Geht züruck zum ursprünglichen Spieler
                return false; // hat noch eine gültige Bewegung
            }
        }
    
        currentPlayer = -currentPlayer; //Geht züruck zum ursprünglichen Spieler 
        return true; // niemand kann mehr spielen
    }
}
