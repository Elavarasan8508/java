public class Ennamo
{
   public static void main(String[] args) {
        int start = 2; // Starting number
        int lines = 3; // Number of lines to print

        for (int i = 0; i < lines; i++) {
            for (int j = 1; j <= start + i; j++) {
                System.out.print(j);
            }
            System.out.println(); // Move to the next line
        }
    }
}