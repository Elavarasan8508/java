// Math Function in java

import java.util.*;
public class Ma
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.print("Enter a :");
        a=sc.nextInt();
        System.out.print("Enter b :");
        b=sc.nextInt();
        long  r=(long) Math.pow(a,b);
        long div=(long) r%1000000007;
       System.out.print("The Last Value of is :"+div );

    //    System.out.println(a%10);
    }
}


/*import java.util.Scanner;
public class Ma
{
public static void main(String[] args)
{
String s,t;
Scanner sc=new Scanner(System.in);
System.out.print("Enter S1:");
s=sc.next();
System.out.print("Enter S2:");
t=sc.next();
int resl=mat(s,t);
System.out.print(resl);
}

public static int mat(String s1, String s2)
{

if(s1.equals("0")) return 0;
if(s2.equals("1")) return 1;


int ld= s1.charAt(s1.length() - 1) - '0';   


// calculate b%4 

int mod	= 0;
for(int i=0;i<s2.length();i++)
{
  mod=(mod*10+s2.charAt(i) - '0') % 4;
}

if(mod == 0)
mod=4;

int res=(int) Math.pow(ld,mod)%10;
return res;

}

}*/