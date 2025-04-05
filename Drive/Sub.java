// Print all Substring 

import java.util.Scanner;
public class Sub
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter any String:");
String st=sc.nextLine();


for(int i=0;i<st.length();i++)
{
for(int j=i+1;j<=st.length();j++)
{
System.out.println(st.substring(i,j));
}
}

}
}