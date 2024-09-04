// We have to find the Average of the Array And then The Average is greater than the First Even number in the Array If Greater "Yes"  else "No"..


public class Arr{
public static void main(String[] args)
{
int[] a={1,2,100,7,5,6,5,7,8};
int sum=0, ans=0;

for (int i=0;i<a.length;i++)
{
sum+=a[i];
}

System.out.println("The Sum is:"+sum);

float avg=(float)sum/a.length;

System.out.println("The Average is:"+avg);

for(int i=0;i<a.length;i++)
{
if(a[i]%2 == 0)
{

ans=a[i];
break;

}
}

if(avg > ans)
{
System.out.print(" The Average"+avg+" is greater than the First Even number "+ans+ "     Yes"+"\n");
return;
}
else
{
 System.out.print(" The Average"+avg+" is Not greater than the First Even number "+ans+"     No"+"\n");
}


}
}

