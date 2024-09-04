// Write a program to sum first n even numbers using a while loop.

public class First
{
public static void main(String [] args)
{
int n=20,i=0,sum=0;
//for(i=1;i<=n;i=i+2)
//{
//sum=sum+i;
//}
//System.out.println(sum);
while(i<=n)
{
sum=sum+i;
i=i+2;
}
System.out.println("The sum of the Number is :"+sum);
}
}