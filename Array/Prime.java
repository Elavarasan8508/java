import java.util.Scanner;
public class Prime
{
public static void main(String[] args)
{
int n;
Scanner sc=new Scanner(System.in);
System.out.print("Enter a Number:");
n=sc.nextInt();
Boolean prime=false;

// Conform that 1 and 2 are not Prime:

if(n==0 || n==1)
{
prime=true;
return;
}

// Condition for proving the Number is Not prime

for(int i=2;i<=n;i++)
{
if(i/n==0)
{

prime=false;
break;

}
}


// Make the Condition To print Prime or Not


if(prime)
{
  System.out.print(n+" The Number is Prime ");
}
else
 {
System.out.print(n+" The  Number is Not Prime");
}	
}
}