import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Display {
    private StringBuilder[] displayStrings;
    private int incorrectCount;
    private boolean isFirstDraw;

    public Display() {
        this.displayStrings = new StringBuilder[7];
    }

    public void resetDisplay() {
        displayStrings[0] = new StringBuilder("  +---+  ");
        displayStrings[1] = new StringBuilder("  |   |  ");
        displayStrings[2] = new StringBuilder("      |      ");
        displayStrings[3] = new StringBuilder("      |  ");
        displayStrings[4] = new StringBuilder("      |      Incorrect Guesses:");
        displayStrings[5] = new StringBuilder("      |      ");
        displayStrings[6] = new StringBuilder("=========");
        this.incorrectCount = 0;
        this.isFirstDraw = true;
    }

    public void draw(int bodyparts, HashMap<Character, Boolean> wordMap, ArrayList<Character> incorrectGuesses) {                
        if (isFirstDraw) {
            for (int i = 0; i < wordMap.size(); i++) {
                displayStrings[2].append('_');
            }
            isFirstDraw = false;
        }
        updateWord(wordMap);
        updateIncorrectGuesses(incorrectGuesses);        
        addBodyparts(bodyparts);
        printRows(0, 6);        
    }

    private void updateWord(HashMap<Character, Boolean> wordMap) {
        int i = 0;
        for (Map.Entry<Character, Boolean> me : wordMap.entrySet()) {
            if (me.getValue() == true) displayStrings[2].setCharAt(13 + i, me.getKey());
            i++;
        }
    }

    private void addBodyparts(int bodyparts) {        
        switch (bodyparts) {
            case 1:
                displayStrings[2].setCharAt(2,'O');                
                break;
            case 2:                
                displayStrings[3].setCharAt(2,'|');                
                break;
            case 3:
                displayStrings[3].setCharAt(1,'/');                
                break;
            case 4:
                displayStrings[3].setCharAt(3,'\\');
                break;
            case 5:
                displayStrings[4].setCharAt(1,'/');
                break;
            case 6:
                displayStrings[4].setCharAt(3,'\\');
                break;
            case 7:
                displayStrings[4].setCharAt(2,'|');
                break;
            default:
                break;
        }   
    }

    private void updateIncorrectGuesses(ArrayList<Character> incorrectGuesses) {
        if (incorrectGuesses.size() == 0 || incorrectGuesses.size() == incorrectCount) return;

        incorrectCount = incorrectGuesses.size();
        char latestIncorrectGuess = incorrectGuesses.get(incorrectCount - 1);
        displayStrings[5].append(latestIncorrectGuess);    
    }

    private void printRows(int startingRow, int endingRow) {
        for (int i = startingRow; i <= endingRow; i++) {
            System.out.println(displayStrings[i]);
        }
    }

    // private void printWord(String word, boolean[] lettersGuessed) {
        
    //     System.out.println(word.length() + " letter word:");
    //     for (int i = 0; i < word.length(); i++) {
    //         if (lettersGuessed[i] == false) {
    //             System.out.print("_");
    //             continue;
    //         }
    //         System.out.print(word.charAt(i));
    //     }        
    // }   
}