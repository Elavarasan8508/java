import java.util.Scanner;
public class New1{
public static void main(String [] args)
{
Scanner s=new Scanner(System.in);
int i=0,count;
//System.out.print("Enter the No of Weights:");
//count=s.nextInt();
int[] Weight=new int[5];
for(i=0;i<Weight.length;i++)
{
System.out.print("Your Weight:");
Weight[i]=s.nextInt();
}
for(i=0;i<Weight.length;i++)
{
System.out.println(Weight[i]);
}
}
}






// int[] Weight=new int[5];
// intha Square Bracket kulla Kandipa Integer value tha Kudukanum.....Whether it is any Datatype we must put the Integer Datatype
