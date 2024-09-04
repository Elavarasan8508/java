// Recursive Function

import java.util.Scanner;
public class Recursive
{


//user defined function to perform a Recursion


public static int fact(int n)
{
int fact=1;
if(n==1)
 return 1;
else
 return n*fact(n-1);
}


public static void main(String [] args)
{
int fact = 1;
Scanner sc=new Scanner(System.in);
System.out.print("Enter Value of n :");
int n=sc.nextInt();
int ans=fact(n);
System.out.print(ans);
}
}
