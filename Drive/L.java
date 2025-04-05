public class L
{
public static void main(String[] args)
{
int[] a={1,2,3,7,5,8};
int t=0;
//System.out.print(a[a.length-2]);
int n=a.length;

for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(a[i]>a[j])
{
t=a[i];
a[i]=a[j];
a[j]=t;
}
}
}


System.out.print(a[a.length-2]+" ");


}
}