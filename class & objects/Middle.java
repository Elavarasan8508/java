// Check the Character in the Middle of the String is Vowel or Not


public class Middle
{
public static void main(String[] args)
{

String s="KriUnan";
char[] c =new char[s.length()];

for(int i=0;i<s.length();i++)
{
 c[i]=s.charAt(i);
}

for(int i=0;i<c.length;i++)
{
System.out.print(c[i]);
}

// Find the Middle Index(Integer)	
int mid=s.length()/2;


// Find the Char of the Middle
char d=s.charAt(mid);

System.out.println("The Middle Index is :"+d+"\n");

switch(d)
{
 case 'a':
 System.out.println("Vowel");
 break;
  

  case 'e':
 System.out.println("Vowel");
 break;

 case 'i':
 System.out.println("Vowel");
 break;


 case 'o':
 System.out.println("Vowel");
 break;

 case 'u':
 System.out.println("Vowel");
 break;

 default:
 System.out.print(d+ " is not a Vowel");
}


}
}