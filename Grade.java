import java.util.Scanner;
public class Grade
{
public static void main(String [] args)
{
Long roll;
int Mark,Tam,Eng,Sci,Soc,Mat;
String name;
Scanner scanner = new Scanner(System.in);
System.out.print("Enter your Name :");
name=scanner.nextLine();
System.out.print("Enter your Roll Number :");
roll = scanner.nextLong();
System.out.print("Enter your Tamil Mark :");
Tam=scanner.nextInt();
System.out.print("Enter your English Mark:");
Eng=scanner.nextInt();
System.out.print("Enter your Science Mark :");
Sci=scanner.nextInt();
System.out.print("Enter your Social Mark :");
Soc=scanner.nextInt();
System.out.print("Enter your Maths Mark :");
Mat=scanner.nextInt();

Mark=(Tam+Eng+Sci+Soc+Mat)/5;

System.out.println("-----------------------------------------------------------------------------------------------------");
System.out.println("                                             REPORT                                                  ");
System.out.println("-----------------------------------------------------------------------------------------------------");
System.out.println("Name : "+name);                                                                System.out.println("Roll :"+roll);

String grade="";
if((Tam>=90 && Tam<=100) && (Eng>=90 && Eng<=100) && (Sci>=90 && Sci<=100) && (Soc>=90 && Soc<=100) && (Mat>=90 && Mat<=100))
{
 grade = " O ";
}
else if((Tam>=80 && Tam<=89) && (Eng>=80 && Eng<=89) && (Sci>=80 && Sci<=89) && (Soc>=80 && Soc<=89) && (Mat>=80 && Mat<=89))
{
 grade = " A+ ";
}
else if((Tam>=70 && Tam<=79) && (Eng>=70 && Eng<=79) && (Sci>=70 && Sci<=79) && (Soc>=70 && Soc<=79) && (Mat>=70 && Mat<=79))
{
 grade = " A ";
}
else if((Tam>=60 && Tam<=69) && (Eng>=60 && Eng<=69) && (Sci>=60 && Sci<=69) && (Soc>=60 && Soc<=69) && (Mat>=60 && Mat<=69))
{
 grade = " B+ ";
}
else if((Tam>=50 && Tam<=59) && (Eng>=50 && Eng<=59) && (Sci>=50 && Sci<=59) && (Soc>=50 && Soc<=59) && (Mat>=50 && Mat<=59))
{
  grade = " B ";
}
else if(Tam<50 || Eng<50 || Sci<50 || Soc<50 || Mat<50)
{
 grade ="Reappear ...";
}
else
{
System.out.println("Invalid Input !");
}

int total=(Tam+Eng+Sci+Soc+Mat);
System.out.println("Total :"+total);
System.out.println("Average/Percentage :" +Mark +'%');
System.out.println("Grade :"+ grade);
                                                                                         

}
}