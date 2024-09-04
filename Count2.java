// Find the Sum of given number eg: 123 = 1+2+3 = 6


import java.util.Scanner;
public class Count2
{
public static void main(String [] args)
{
int x,sum=0;
Scanner sc= new Scanner(System.in);
System.out.print("Enter the number :");
x=sc.nextInt();
while(x != 0)
{
sum=sum+x%10;
x=x/10;
}
System.out.println("The sum is :"+ sum);
}
}








