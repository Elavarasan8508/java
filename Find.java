import java.util.Scanner;
public class Find{
public static void main(String [] args){
int x;
System.out.println("Enter the Number to find Positive or Negative : ");
Scanner scanner=new Scanner (System.in);
x=scanner.nextInt();
if(x>=0)
{
System.out.println("The Number is Positive !!!");
}
else
{
System.out.println("The Number is Negative !!");
}

}
}