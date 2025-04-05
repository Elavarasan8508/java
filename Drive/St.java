// Get the String from the user and to get the Forbitten String . and to print the All combinations of String without the Combination of the Forbitten Eg String ="abc"; Forbitten ="ab"


import java.util.Scanner;
public class St
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the String:");
String s=sc.nextLine();

System.out.print("Enter The Forbitten:");
String f=sc.nextLine();

generate("",s,c);
}

public static void generate(String newstring, String st, String forbitten)
{
if(!newstring.contains(forbitten) && !newstring.isEmpty())
{
System.out.println(newstr);
}
for(int i=0;i<st.length();i++)
{
generate(newstring + st.charAt(i) , st.substring(i+1) , forbitten);
}

}
}


