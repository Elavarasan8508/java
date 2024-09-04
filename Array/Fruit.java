public class Fruit
{
public static void main(String [] args)

{
String [] Fruits={"Apple","Orange","Banana","Grape"};
boolean flag=false;
for(int i=0;i<Fruits.length;i++)
{
if(Fruits[i] == Fruits[1])
{
flag=true;

if(flag)
{
System.out.println("Found");
System.out.println("The Index Value is :"+i);
}
else
{
System.out.print("Not found");
}
}
}
}
}