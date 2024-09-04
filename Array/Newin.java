import java.util.Scanner;

public class Newin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Single Alphabet: ");
        String input = sc.nextLine().toLowerCase();

        if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
            System.out.println("Error: Please enter a single alphabet letter.");
        } else {
            char c = input.charAt(0);
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("Vowel");
                    break;
                default:
                    System.out.println("Consonant");
            }
        }
    }
}
