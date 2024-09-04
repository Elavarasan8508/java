//Print the String in Reverse with some constraints 

import java.util.Scanner;
public class Revv
{
public static void main(String[] args)
{
String s="",ns="";
Scanner sc=new Scanner(System.in);
System.out.print("Enter the Name : ");
s=sc.nextLine();
char c;
int i=0;

for(i =0;i<s.length();i++)
{
c=s.charAt(i);
ns=c+"#"+ns;
}
System.out.print(ns);

}
}