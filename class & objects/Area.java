import java.util.Scanner;
public class Area
{


//User Defined Function for calculate the area of circle


public static void multi(int r )
{
double pi=3.14;
double area=pi*r*r;
System.out.print("The Area of the Circle is:"+area);

}

// Second user Defined Function for claculate the area of Rectangle


public static void multi(int l ,int w )
{
int rect=l*w;
System.out.print("The Area of the Rectangle is:"+rect);

}



// Third user Defined function for calculate the area of Sqaure

public static void multi(int s)
{
int square=s*s;
System.out.println("The Area of the Square is :"+square);
}





//Main Function

public static void main(String[] args)
{

Scanner sc=new Scanner(System.in);
System.out.print("Enter r :");
int r=sc.nextInt();
multi(r);

System.out.print("Enter the Length:");
int l=sc.nextInt();
System.out.print("Enter the Width:");
int w=sc.nextInt();
multi(l,w);


System.out.print("Enter the Square radius:");
int s=sc.nextInt();
multi(s);

}
}
