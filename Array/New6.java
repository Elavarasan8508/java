// these program we get the input as user and pswd if it correct print=Valid ,else  print= Not Valid.



import java.util.Scanner;
public class New6
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);

String[] user=new String[10];
String[] pswd=new String[10];
for(int i=0;i<10;i++)
{
System.out.print("user name:");
user[i]=sc.nextLine();
System.out.print("pswd     :");
pswd[i]=sc.nextLine();


if(user[i].equals(pswd[i]))
{
System.out.print("Valid");
}
else
{
System.out.print("Not valid");
return;

}

}
}
}