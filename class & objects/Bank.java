// Banking Application

import java.util.Scanner;



public class Bank
{
public static int Amo;
public static long n=1234456;
public static long c;
public static long  f;
public static void display()
{

 
Scanner sc=new Scanner(System.in);

System.out.println("-------------------------------------------------------------------------------------------");
System.out.println("                           Create an  Account                        ");
System.out.println("                       Enter the Following Details                  ");
System.out.print("Name     :");
String Name=sc.nextLine();
System.out.print("Aadhar No:");
long Ano=sc.nextLong();
System.out.print("Initial Amount to be Deposited :");
Amo=sc.nextInt();
System.out.println("Your Account Number :"+n);
n=n+1;
}


// Function for deposit


public static void deposit()
{
Scanner ac=new Scanner(System.in);

System.out.println("-------------------------------------------------------------------------------------------");
System.out.println("                           Deposit Your Money                        ");
System.out.println("                      Enter the Following Details                    ");
System.out.print("Enter your Account Number:");
long c=ac.nextLong();
System.out.print("Enter Your Deposit Amount:");
long d=ac.nextLong();
f=d+Amo;
System.out.println("Current Balance :"+f);
}


// Method for Withdraw

public static void withdraw()
{
Scanner bc=new Scanner(System.in);

System.out.println("-------------------------------------------------------------------------------------------");
System.out.println("                           Withdraw Your Money                        ");
System.out.println("                        Enter the Following Details                                       ");
System.out.print("Enter your Account Number:");
long c=bc.nextLong();
System.out.print("Enter Your Withdraw Amount:");
long d=bc.nextLong();
c=d+f;
if(d > f)
{
System.out.println("Invalid Amount ! Try again...");
}
else
{
System.out.println("Current Balance :"+c);
}
}



public static void main(String[] args)
{
int i;
Scanner sc=new Scanner(System.in);

do{
System.out.println("  Menu  ");
System.out.println("1.Create an Account");
System.out.println("2.Deposite");
System.out.println("3.Withdrawal");
System.out.println("4.Exit");

System.out.print("Enter your Choice:");
 i=sc.nextInt();

if(i==1)
{
//Bank Create=new Bank();
display();
}
else if(i == 2)
{

//Bank Deposite=new Bank();
deposit();

}
else if(i==3)
{
//Bank Withdrawal =new Bank();
withdraw();
}
else 
{
return;
}






}while(i<=4 && i>=1);




}
}