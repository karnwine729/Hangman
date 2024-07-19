public class Display {
    public int bodyparts;
    //private int bodyparts;

    public Display() {
        this.bodyparts = 0;
    }

    public void draw() {
        printTopRows();
        printHeadRow();
        printTorsoRow();
        printLegRow();
        printBottomRows();
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
            System.out.println(" /|   |  ");
            return;
        }       
        System.out.println(" /|\\  |  ");
    }

    private void printBottomRows() {
        System.out.println("      |  ");
        System.out.println("=========");
    }
}