package StringProblems.StringLevelOne;

public class NullPointerDemo {

    public static void generateException() {
        String text = null;   
        System.out.println("Length of text: " + text.length());
    }

    public static void handleException() {
        String text = null;
        try {
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("⚠️ Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("---- Generating NullPointerException ----");
        try {
            generateException(); 
        } catch (Exception e) {
            System.out.println("Program stopped due to exception: " + e);
        }
        System.out.println("\n---- Handling NullPointerException ----");
        handleException();
    }
}
