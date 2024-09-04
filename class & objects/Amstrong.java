import java.util.Scanner;
public class Amstrong
{
public static void main(String[] args)
{
int a,b,c;
int cube=0;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the Number:");
a=sc.nextInt();

while(a != 0)
{
b=a%10;
cube+=b*b*b;
a=a/10;
}
System.out.println("The cube is:"+cube);

if(cube ==  a)
{
System.out.println("The Number is Amstrong");
}
else
{
System.out.println("The Number is Not Amstrong");
}
}
}