import java.util.Scanner;
public class Convertm{
public static void main(String [] args)
{
char c;
Scanner scanner =new Scanner(System.in);
System.out.print("Enter Char:");
c=scanner.next().charAt(0);
int d =(int)c;
System.out.print("String to Number :" +d);
}
}