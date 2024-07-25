import java.util.ArrayList;

public class Display {
    private StringBuilder[] displayStrings;
    private int incorrectCount;
    private boolean isFirstDraw;

    public Display() {
        this.displayStrings = new StringBuilder[7];
        this.incorrectCount = 0;
        this.isFirstDraw = true;
    }

    public void resetDisplay() {
        this.displayStrings[0] = new StringBuilder("  +---+  ");
        this.displayStrings[1] = new StringBuilder("  |   |  ");
        this.displayStrings[2] = new StringBuilder("      |      ");
        this.displayStrings[3] = new StringBuilder("      |  ");
        this.displayStrings[4] = new StringBuilder("      |      Incorrect Guesses:");
        this.displayStrings[5] = new StringBuilder("      |      ");
        this.displayStrings[6] = new StringBuilder("=========");
        this.incorrectCount = 0;
        this.isFirstDraw = true;
    }

    public void draw(int bodyparts, String word, boolean[] letterIsGuessed, ArrayList<Character> incorrectGuesses) {                
        if (this.isFirstDraw) {
            for (int i = 0; i < word.length(); i++) {
                this.displayStrings[2].append('_');
            }
            this.isFirstDraw = false;
        }
        updateWord(word, letterIsGuessed);
        updateIncorrectGuesses(incorrectGuesses);        
        addBodyparts(bodyparts);
        printRows(0, 6);        
    }

    private void updateWord(String word, boolean[] letterIsGuessed) {        
        for (int i = 0; i < letterIsGuessed.length; i++) {
            if (letterIsGuessed[i] == true) {
                this.displayStrings[2].setCharAt(13 + i, word.charAt(i));
            }
        }
    }

    private void addBodyparts(int bodyparts) {        
        switch (bodyparts) {
            case 1:
                this.displayStrings[2].setCharAt(2,'O');                
                break;
            case 2:                
                this.displayStrings[3].setCharAt(2,'|');                
                break;
            case 3:
                this.displayStrings[3].setCharAt(1,'/');                
                break;
            case 4:
                this.displayStrings[3].setCharAt(3,'\\');
                break;
            case 5:
                this.displayStrings[4].setCharAt(1,'/');
                break;
            case 6:
                this.displayStrings[4].setCharAt(3,'\\');
                break;
            case 7:
                this.displayStrings[4].setCharAt(2,'|');
                break;
            default:
                break;
        }   
    }

    private void updateIncorrectGuesses(ArrayList<Character> incorrectGuesses) {
        if (incorrectGuesses.size() == 0 || incorrectGuesses.size() == this.incorrectCount) return;

        this.incorrectCount = incorrectGuesses.size();
        char latestIncorrectGuess = incorrectGuesses.get(this.incorrectCount - 1);
        this.displayStrings[5].append(latestIncorrectGuess);    
    }

    private void printRows(int startingRow, int endingRow) {
        for (int i = startingRow; i <= endingRow; i++) {
            System.out.println(this.displayStrings[i]);
        }
    }
}