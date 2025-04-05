// input String  = "abcac" int = 10

public class Rep
{
public static void main(String[] args)
{
String s="abcac";
int n=20;
int Count=0,l=s.length();


for(int i=0;i<n;i++)
{
System.out.print(s.charAt (i % l)  );

if('a' == s.charAt(i % l))
{
 Count+=1;

}
}
System.out.println("\n"+"The count of the a is :"+Count);


}
}