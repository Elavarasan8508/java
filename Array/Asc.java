// Find the Second Largest Number in the Array And then Check the Number is Prime or Not Prime

public class Asc{
public static void main(String[] args)
{
int[] a={2,4,21,4,8,3,5};
boolean prime=false;
for(int i=0;i<a.length;i++)
{

for(int j=i+1;j<a.length;j++)
{
if(a[i]>a[j])
{
int temp=a[i];
   a[i]=a[j];
   a[j]=temp;
}

}
}


for(int i=0;i<a.length;i++)
{
System.out.println(a[i]+" ");
}

int ans=a[a.length-2];   // it was the Condition to remove the Last digit in the Array 


for(int i=1;i<a.length;i++)
{
if(ans/i==0)
{
prime=true;
break;
}
}
if(prime)
{
System.out.println("The Second Largest Number  " +ans+ " in the Array is Prime");
}
else
{
 System.out.println("The Second Largest Number"+ans+" in the Array is Not Prime");
}

}
}