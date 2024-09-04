import java.util.Scanner;
public class Nee{



public static boolean bala(char ch)
{

ch=Character.toUpperCase(ch);
  return  ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'; 


}


public static void main(String[] args)
{
String s="";
Scanner sc= new Scanner(System.in);
System.out.print("Enter the Name: ");
s=sc.nextLine();
int mid=s.length()/2;
char c=s.charAt(mid);
System.out.print(c+"\n");

if(bala(c))
{
System.out.print("The Mid Value is Vowel...."+"\n");
}
else
{
System.out.print("The Mid Value is Not Vowel...."+"\n");

}
}
}