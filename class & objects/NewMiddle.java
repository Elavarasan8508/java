import java.util.Scanner;
public class NewMiddle{


// Function to find the vowel
public static boolean vovel(char c)
{


c=Character.toLowerCase(c);     //it will treat 'A' and 'a' as the same

return c == 'a' || c == 'e' || c == 'i'  || c =='o' || c =='u';


}




// Main Function
public static void main(String[] args)
{


String s="";
Scanner sc=new Scanner(System.in);
System.out.print("Enter the Name:");
s=sc.nextLine();

int mid=s.length()/2;

char ch=s.charAt(mid);

System.out.println(" "+ch);

if(vovel(ch))
{
System.out.println("The Mid value is Vowel..");
}
else
{
System.out.println("The Mid value is Not !!! Vowel");
}


}
}