// Find the Number of Digits 


public class Count
{
public static void main(String [] args)
{
int i=3827683,count=0;
while(i != 0)
{
i=i/10;
count++;
}
System.out.println("The count is :"+count);
}  

}