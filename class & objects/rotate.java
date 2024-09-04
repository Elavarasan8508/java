// In this code we have to Rotate the Array Depends on the Users input

import java.util.Scanner;
public class Rotate
{
public static void main(String[] args)
{
int r=0,j=1, i;
int[] a={5, 10, 15, 20, 25, 30 };
int[] b=new int[7];
Scanner sc=new Scanner(System.in);
System.out.print("Enter Number to Rotate:");
int n=sc.nextInt();

int c=a.length;

for(i=0;i<n;i++)
{
System.out.println(a[i]);
break;

}
for(j=1;j<a.length;j++)
{

b[j]=a[j]+a[i];

}


System.out.print(b[j]);



}
}