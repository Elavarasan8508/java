import java.util.Scanner;
public class H
{
public  static void main(String[] args)
{
String s;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the String : ");
s=sc.nextLine();
                                                  // String[] st=new String[s.length()];
System.out.print("Enter the Sub String :");
String k=sc.nextLine();

if(s.contains(k))
{
 System.out.print("True");
}
else 
 System.out.print("False");
}
}