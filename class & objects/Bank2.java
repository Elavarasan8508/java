import java.util.Scanner;
public class Bank2
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int i,k;
 
String[] name=new String[4];
int[] acc=new int[4];
int[] aadhar= new int[4];
int[]balance=new int[4];



do
{
System.out.println("Menu");
System.out.println("1.Create an Account");
System.out.println("2.Display your details");
System.out.println("3.Enter Numbers to Display the Details");
System.out.println("4.Exit");

System.out.print("Enter your Choice:");
i=sc.nextInt();

if(i<=4 && i>=1)
{

}
else
{
return;
}
switch(i)
{
case 1:
 System.out.println("Enter the Following\n");
for(int j=1;j<=3;j++)
{
System.out.println(j+" Details\n");
System.out.print("Enter Name:");
name[j]=sc.next();
System.out.print("Enter AadharNo:");
aadhar[j]=sc.nextInt();
System.out.print("Enter your Initial Amount:");
balance[j]=sc.nextInt();

}

break;
case 2:
 System.out.print("Name\t    AadharNo\t   Initial Amount\t \n");
 for(int j=1;j<=3;j++)
{
System.out.println(name[j]+"\t"+aadhar[j]+"\t"+balance[j]+"\n");
}
break;

case 4:
 return;

case 3:
 System.out.print("Enter Number to Display the Details:");
 k=sc.nextInt();
 if(k==1)
 {
 System.out.print("\n"+name[1]+"\t"+aadhar[1]+"\t"+balance[1]+"\n");
}
else if(k==2)
{
 System.out.print(name[2]+"\t"+aadhar[2]+"\t"+balance[2]+"\n");

}
else if(k==3)
{
 System.out.print(name[3]+"\t"+aadhar[3]+"\t"+balance[3]+"\n");

}
else
{
System.out.print("Invalid Input >>>>>>>>>>>> ");
}
 
default:
 break;
}

}while(i<=3 && i>=1);

}
}