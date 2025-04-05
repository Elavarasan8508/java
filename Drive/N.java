// ArrayList

import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Scanner;
public class N
{
public static void main(String[] args)
{


ArrayList<Integer> al=new ArrayList<>();
Scanner sc=new Scanner(System.in);


while(true)
{
String s=sc.nextLine();

if(s.equalsIgnoreCase("No"))
{
break;
}

try
{
int i=Integer.parseInt(s);
al.add(i);
}
catch(Exception e)
{
System.out.print("Invalid Inputtt");
}
}

System.out.print("The ArrayList :"+al);

TreeSet<Integer> ts=new TreeSet<>(al);

System.out.print("\n\n"+"The Sorted Array is : "+ts);

}
}