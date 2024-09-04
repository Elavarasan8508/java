import java.util.Arrays;
public class New8
{
public static void main(String[] args)
{
int[] a={1,23,32,44,32,2,4,5};

for(int i=0;i<a.length;i++)
{
Arrays.sort(a);
System.out.println(a[i]);
}
}
}