// Write a java Program to find the Maximum Element in the Array


import java.util.Arrays;
import java.util.Scanner;
public class New12
{
public static void main(String[] args)
{

int[] a={1,2,3};
Scanner sc=new Scanner(System.in);

if(a[0] > a[1] && a[0] > a[2])
 System.out.println("Greater is "+a[0]);
else if(a[1] > a[0] && a[1] > a[2] )
 System.out.println("Greater is "+a[1]);
else if(a[2] > a[0] && a[2] > a[1])
 System.out.println("Greater is "+a[2]);
else
{
return;
}

}
}