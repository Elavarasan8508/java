// In this code we have to find the given integer is present in the Array or Not


import java.util.Scanner;
public class New11{
public static void main(String [] args)
{
int[] a={1,2,3,4,5,6};
int b;
Scanner sc=new Scanner(System.in);
System.out.print("Enter Integer:");
b=sc.nextInt();
Boolean present=false;

for(int i=0;i<a.length;i++)
{
if(b == a[i])
{
 present=true;
 break;
}
}
if(present)
{
System.out.print("Present");
}
else
{
System.out.print("Not present");
}
}
}