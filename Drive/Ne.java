// Array list 2

/*import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Scanner;
public class Ne
{
public static void main(String[] args)
{
int i=1;
char c='a';
Scanner s=new Scanner(System.in);
ArrayList<Integer> al=new ArrayList <Integer>();
c=s.next().toLowerCase().charAt(0);

while(c != 'n')
{

al.add(s.nextInt());
i++;

}
System.out.print(al);


}
}*/



import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Ne{
    public static void main(String[] args) {
        // Create an ArrayList to store user inputs
        ArrayList<Integer> userList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers to add to the list. Type 'stop' to finish:");

        // Loop to continuously read inputs from the user
        while (true) {
            String input = scanner.next(); // Read the next input as a string

            // Check if the input is 'stop' to end the loop
            if (input.equalsIgnoreCase("stop")) {
                break; // Exit the loop if the user types 'stop'
            }

            try {
                // Convert the input to an integer and add it to the ArrayList
                int number = Integer.parseInt(input);
                userList.add(number);
            } catch (NumberFormatException e) {
                // Handle invalid input gracefully
                System.out.println("Invalid input. Please enter a valid number or type 'stop' to end.");
            }
        }

        // Display the contents of the ArrayList
        System.out.println("ArrayList contents: " + userList);
       

       TreeSet<Integer> ts=new TreeSet<>(userList);

      System.out.print("Sorted and Duplicate Removed Set :"+ts);
    }
}
