import java.util.Scanner;
public class Area1
{


//User Defined Function


public static void multi(int l ,int w )
{
int rect=l*w;
System.out.print("The Area of the Rectangle is:"+rect);

}




//Main Function

public static void main(String[] args)
{

Scanner sc=new Scanner(System.in);
System.out.print("Enter Length :");
int l=sc.nextInt();
System.out.print("Enter Width :");
int w=sc.nextInt();
multi(l,w);


}
}