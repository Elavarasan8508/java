// Find the Greatest value among all the values




public class New5
{
public static void main(String [] args)
{
int i=0,count1=0,count2=0,count3=0,count4=0;
int[] a={10,500,20,50,5,10,5,100};
int max=0;
for(i=0;i<a.length;i++)
{
if(a[i]>max)
{
max=a[i];
}
}
System.out.println(max);
}
}