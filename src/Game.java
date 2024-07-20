import java.util.Scanner;
import java.util.Random;

public class Game {
    private Display display;
    private Words words;
    private Scanner scanner;
    private Random random;
    private boolean gameover;

    public Game() {
        this.display = new Display();
        this.words = new Words();
        this.scanner = new Scanner(System.in);
        this.random = new Random();
        this.gameover = false;
    }

    public void play() {
        start();
        run();
    }

    private void start() {

        words.initData();
        int rng = random.nextInt(words.getWordCount());
        display.setWord(words.getWord(rng));
        display.resetBodyparts();        
        
        System.out.println("-".repeat(50));
        System.out.println("Welcome to Hungman!");
        System.out.println("Enter a letter into the console to start guessing the word.");
        System.out.println("Be careful: once you've guessed seven incorrect letters, you'll be hung!");
        System.out.println("-".repeat(50));
        System.out.println();
    }

    private void run() {
        //while(!gameover) {
            
            display.draw();
            System.out.print("Enter a letter: ");
            String input = scanner.next();
            scanner.nextLine();
            char letter = input.charAt(0);
            
        //}
    }
}
