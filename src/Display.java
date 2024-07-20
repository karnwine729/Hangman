public class Display {
    private int bodyparts;
    private String word;
    private int wordLength;
    private int remainingLetters;

    public Display() {
        this.bodyparts = 0;
    }

    public void resetBodyparts() {
        this.bodyparts = 0;
    }

    public void setWord(String word) {
        this.word = word;
        this.wordLength = word.length();
    }

    public void draw() {
        printTopRows();
        printHeadRow();
        printTorsoRow();
        printLegRow();
        printBottomRows();        
        printWord();
    }

    private void printWord() {
        System.out.println();
        // for (int i = 0; i <= wordLength; i++) {

        // }
    }

    private void printTopRows() {        
        System.out.println("  +---+  ");
        System.out.println("  |   |  ");
    }

    private void printHeadRow() {
        if (bodyparts == 0) {
            System.out.println("      |  ");
            return;
        }
        System.out.println("  O   |  ");
    }

    private void printTorsoRow() {
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

    private void printLegRow() {
        if (bodyparts <= 4) {
            System.out.println("      |  ");
            return;
        }
        if (bodyparts == 5) {
            System.out.println("  |   |  ");
            return;
        }
        if (bodyparts == 6) {
            System.out.println(" / \\   |  ");
            return;
        }       
        System.out.println(" /|\\  |  ");
    }

    private void printBottomRows() {
        System.out.println("      |  ");
        System.out.println("=========");
    }
}