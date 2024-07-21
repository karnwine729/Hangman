import java.util.Scanner;
import java.util.Random;

public class Game {
    private Display display;
    private static Words words = new Words();
    private String word;
    private Scanner scanner;
    private Random random;
    private boolean gameover;
    private boolean playAgain;
    private boolean[] lettersGuessed;
    private int rng;

    public Game() {
        this.display = new Display();
        this.scanner = new Scanner(System.in);
        this.random = new Random();
        this.gameover = false;
        this.playAgain = true;
    }

    public void play() {
        if(playAgain) {
            start();
            run();
            this.playAgain = end();
        }
    }

    private boolean end() {
        System.out.print("Enter \"y\" or \"yes\" to play again: ");
        String input = scanner.next().toLowerCase();
        scanner.nextLine();
        if (input.equals("y") || input.equals("yes")) return true;
        return false;
    }

    private void start() {
        words.initData();
        this.rng = random.nextInt(words.getWordCount());
        this.word = words.getWord(rng);
        this.lettersGuessed = new boolean[word.length()];
        display.resetBodyparts();        
        
        System.out.println("-".repeat(50));
        System.out.println("Welcome to Hungman!");
        System.out.println("Enter a letter into the console to start guessing the word.");
        System.out.println("Be careful: once you've guessed seven incorrect letters, you'll be hung!");
        System.out.println("-".repeat(50));
        System.out.println();
    }

    private void run() {
        while(!gameover) {            
            display.draw(this.word, this.lettersGuessed);
            System.out.print("\n\nEnter a letter: ");
            String input = scanner.next();
            scanner.nextLine();
            checkLetter(input.charAt(0), this.word);
            checkWin();
            checkLose();
        }
    }

    private void checkWin() {
        boolean wordIsGuessed = true;
        for (int i = 0; i < this.lettersGuessed.length; i++) {
            if (this.lettersGuessed[i] == false) {
                wordIsGuessed = false;
                break;
            }
        }
        if (wordIsGuessed) {
            System.out.println("You guessed the word!");
            this.gameover = true;
        }
    }

    private void checkLose() {
        if (display.getBodyparts() == 7) {
            System.out.println("You're hung!");
            this.gameover = true;            
        }
    }

    private void checkLetter(char letter, String word) {
        boolean correctGuess = false;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                this.lettersGuessed[i] = true;
                correctGuess = true;                
            }
        }
        if (correctGuess) {
            System.out.println("Correct!");
            return;
        }
        System.out.println("Letter not found!");
        display.addBodypart();
    }    
}
