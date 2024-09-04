// In this program we print the particular integer [2]  like is . and that Returns how many times.. using array


public class New4
{
public static void main(String [] args)
{
int i=0,count1=0,count2=0,count3=0,count4=0;
int[] a={10,5,20,50,5,10,5};
for(i=0;i<a.length;i++)
{
if(a[i]==5)
{
count1=count1 +1;
}
else if(a[i]==20)
{
  count2=count2+1;
}
else if(a[i]==50)
{ 
 count3=count3+1;
}
else if(a[i]==10)
{ 
 count4=count4+1;
}
else
{
System.out.print("Invalid...");
}



}
System.out.println("The Occurance of 5 is:"+count1);
System.out.println("The Occurance of 20 is:"+count2);
System.out.println("The Occurance of 50 is:"+count3);
System.out.println("The Occurance of 10 is:"+count4);

}
}
