// To find the missing Numbers in the Array

import java.util.Scanner;
public class Find
{
public static void main(String[] args)
{
int n, m=0,k=0;
Scanner sc=new Scanner(System.in);
System.out.print("Enter n value:");
n=sc.nextInt();

int[] a=new int[n-1];

// For loop for get the input from the user
for(int i=0;i<a.length;i++)
{
System.out.print("Enter the Array Element:");
a[i]=sc.nextInt();
}

// Intializing for loop for sum the Array value.
for(int i=0;i<a.length;i++)
{
m=m+a[i];
}

// Initializing for loop for sum the n
for(int j=0;j<=n;j++)
{

k=k+j;

}

int c=k-m;
System.out.print("The Missing Number is:"+c);
}
}
