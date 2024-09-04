import java.util.Scanner;
public class Condition
{
public static void main(String [] args)
{
int x;
System.out.println("Enter the number to find Odd or Even :");
Scanner scanner = new Scanner(System.in);
x=scanner.nextInt();
if(x%2==0)
{
System.out.println("The Number is Even ");
}
else{
System.out.println("The Number is Odd");
}

}
}