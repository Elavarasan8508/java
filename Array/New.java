import java.util.Arrays;
import java.util.Scanner;
public class New
{
public static void main(String [] args)
{
int[] Marks=new int[5];
int i=0;
Scanner sc=new Scanner(System.in);
while( i < 5)
{
System.out.print("Enter Your Marks:");
Marks[i] =sc.nextInt();
i++;
}
System.out.println(Marks[i]);
}
}