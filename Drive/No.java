import java.util.*;
public class No
{
public static void main(String[] args)
{

Scanner sc=new Scanner (System.in);
String s=sc.nextLine();
int count = 0;

String[] w=s.split("");
for(String  i:w)
{
count+=1;
}
System.out.print(count);

}
}