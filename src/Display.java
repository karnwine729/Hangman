public class Display {
    private int bodyparts;

    public Display() {
        this.bodyparts = 0;        
    }

    public void resetBodyparts() {
        this.bodyparts = 0;
    }

    public void addBodypart() {
        this.bodyparts++;
    }

    public int getBodyparts() {
        return this.bodyparts;
    }

    public void draw(String word, boolean[] lettersGuessed) {
        printTopRows();
        printHeadRow();
        printTorsoRow();
        printLegRow();
        printBottomRows();        
        printWord(word, lettersGuessed);
    }

    private void printWord(String word, boolean[] lettersGuessed) {
        System.out.println();
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