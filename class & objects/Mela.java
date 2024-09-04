// In this question we have a Input as Einstein to print as    E n t i     
//                                                               i s e n 

import java.util.Scanner;
public class Mela
{
public static void main(String[] args)
{
String s="";
Scanner sc=new Scanner(System.in);
System.out.print("Enter a String :");
s=sc.nextLine();


for(int i=0;i<s.length();i=i+2)
{

System.out.print(s.charAt(i)+ " " );
}

for(int i=1;i<s.length();i+=2)
{
System.out.print("  "+"\n"+"  "+s.charAt(1));
break;

}
for(int i=3;i<s.length();i+=2)
{
System.out.print(" "+s.charAt(i)+" ");
}
}
}

