public class Main {
    public static void main(String[] args) {
        Display d = new Display();
        
        //testing
        for (int i = 0; i <= 7; i++) {
            System.out.println("bodyparts = " + i);
            d.bodyparts = i;
            d.draw();            
        }
    }
}