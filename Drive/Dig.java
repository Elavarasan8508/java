// Count the digit 

import java.util.*;
public class Dig
{
public static void main(String[] args)
{
int a;
Scanner s=new Scanner(System.in);
System.out.print("Enter Number :");
a=s.nextInt();

System.out.print(divid(a));

}

public static int divid(int n){
int num=n;
int count=0;

while(n != 0)
{
int digit=n%10;

if(digit != 0 && num%digit == 0)
{
count ++;

}
n=n/10;

}
return count;

}
}