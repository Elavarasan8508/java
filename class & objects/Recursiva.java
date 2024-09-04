// Recursive Function

import java.util.Scanner;
public class Recursive
{

public static void fact(int n)
{
int fact=fact*n;
}


public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
int fact=1;
System.out.print("Enter Value of n :");
int n=sc.nextInt();
fact(n);

}
}
