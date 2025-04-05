import java.util.Scanner;
public class TwoSum
{
public static void main(String[] args)
{
int[] a={1,2,3,4,5};
Scanner sc=new Scanner(System.in);
int target;
System.out.println("Enter the Target : ");
target = sc.nextInt();
boolean found = false;

for(int i=0;i<a.length;i++)
{
  for(int j=i+1;j<a.length;j++)
  {
    if(a[i]+a[j] == target)
    {
      found = true;
      break;
    }
  }
}
    
    if(found)
    {
      System.out.println(true);
    }
    else 
      System.out.println(false);


}
}