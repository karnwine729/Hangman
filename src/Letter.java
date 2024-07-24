public class Letter {
    private char character;
    private boolean isInWord;

    public Letter(char character) {
        this.character = character;
        this.isInWord = false;
    }

    public char getCharacter() {
        return this.character;
    }

    public void setInWord(boolean isInWord) {
        this.isInWord = isInWord;
    }

    public boolean isInWord() {
        return this.isInWord;
    }
}
