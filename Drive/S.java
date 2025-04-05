import java.util.*;
public class S
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

System.out.print("Enter a:");
int a=sc.nextInt();
System.out.print("Enter b:");
int b=sc.nextInt();
System.out.print("Enter c:");
int c=sc.nextInt();

if(a>b && a<c || a>c && a<b)         //  condition for prove 'a' is the Second Largest
  System.out.print("The Second Largest Number is:"+a); 
else if(b>a && b<c || b>c && b<a)   // condition for prove 'b' is the Second Largest 
  System.out.print("The Second Largest Number is:"+b);
else 
  System.out.print("The Second Largest Number is:"+c); 
}
}


