import java.util.Scanner;
public class Convert {
public static void main(String [] agrs){
int i;
double d;
float f;
char c;
Scanner sc=new Scanner(System.in);
System.out.print("Integer value:");
i=sc.nextInt();
System.out.print("Double value:");
d=sc.nextDouble();
System.out.print("Float value:");
f=sc.nextFloat();
System.out.print("Char value:");
c=sc.next().charAt(0);
System.out.println("----------------------------------------------------------------------------------------------------------");
 f=(float)d;
System.out.println("Double to float :"+f);
 i=(int)d;
System.out.println("Double to int :"+i);
f=(float)i;
System.out.println("Integer to Float :"+f);
i=(int)c;
System.out.println("Character to Int:"+i);
c=(char)i;
System.out.println("Int to Character :"+c);


}
}



