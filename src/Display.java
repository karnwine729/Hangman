import java.util.ArrayList;

public class Display {    

    public Display() {}

    public void draw(String word, boolean[] lettersGuessed, int bodyparts, ArrayList<Character> incorrectGuesses) {
        printTopRows();
        printHeadRow(bodyparts);
        printTorsoRow(bodyparts);
        printLegRow(bodyparts);
        printBottomRows();        
        printWord(word, lettersGuessed);
        printIncorrectGuesses(incorrectGuesses);
    }

    private void printIncorrectGuesses(ArrayList<Character> incorrectGuesses) {
        System.out.println();
        System.out.print("Incorrect Guesses: ");
        for (int i = 0; i < incorrectGuesses.size(); i++) {
            System.out.print(incorrectGuesses.get(i));
        }
        System.out.println();
    }

    private void printWord(String word, boolean[] lettersGuessed) {
        
        System.out.println(word.length() + " letter word:");
        for (int i = 0; i < word.length(); i++) {
            if (lettersGuessed[i] == false) {
                System.out.print("_");
                continue;
            }
            System.out.print(word.charAt(i));
        }        
    }

    private void printTopRows() {        
        System.out.println("\n  +---+  ");
        System.out.println("  |   |  ");
    }

    private void printHeadRow(int bodyparts) {
        if (bodyparts == 0) {
            System.out.println("      |  ");
            return;
        }
        System.out.println("  O   |  ");
    }

    private void printTorsoRow(int bodyparts) {
        if (bodyparts <=1) {
            System.out.println("      |  ");
            return;
        }
        if (bodyparts == 2) {
            System.out.println("  |   |  ");
            return;
        }
        if (bodyparts == 3) {
            System.out.println(" /|   |  ");
            return;
        }       
        System.out.println(" /|\\  |  ");
    }

    private void printLegRow(int bodyparts) {
        if (bodyparts <= 4) {
            System.out.println("      |  ");
            return;
        }
        if (bodyparts == 5) {
            System.out.println(" /    |  ");
            return;
        }
        if (bodyparts == 6) {
            System.out.println(" / \\  |  ");
            return;
        }       
        System.out.println(" /|\\  |  ");
    }

    private void printBottomRows() {
        System.out.println("      |  ");
        System.out.println("=========");
    }
}