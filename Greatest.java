import java.util.Scanner;
public class Greatest
{
public static void main(String [] args)
{
int x,y,z;
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the x Num :");
x=scanner.nextInt();
System.out.print("Enter the y Num :");
y=scanner.nextInt();
System.out.print("Enter the z Num : ");
z=scanner.nextInt();
if(x>y && x>z)
{
System.out.println("The x is Greater");
}
else if(y>x && y>z)
{
System.out.println("y is Greater");
}
else if(z>x && z>y)
{
System.out.println("z is grater");
}
else
{
System.out.print("No numbers are greater ...");
}
}
}