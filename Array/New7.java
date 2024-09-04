// these program we get the input as user and pswd if it correct print=Valid ,else  print= Not Valid.



import java.util.Scanner;
public class New7
{
public static void main(String [] args)
{
String[] user={"user1","user2","user3"};
String[] pswd={"u1","u2","u3"};

Scanner s=new Scanner(System.in);

System.out.print("Enter User:");
String newuser=s.nextLine();

System.out.print("Enter pswd:");
String newpswd=s.nextLine();

boolean valid=false;


for(int i=0;i<user.length;i++)
{

if(user[i].equals(newuser) && pswd[i].equals(newpswd))
{
valid=true;
break;
}
}

if(valid)
{
System.out.println("Valid...");
}
else
{
System.out.println("Not valid...");
return;
}


}
}