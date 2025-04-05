// longest subarray with sum K

import java.util.*;
import java.util.HashMap;
public class Long
{
public static void main(String[] args)
{
int[] a= new int[5];
Scanner sc= new Scanner(System.in);
System.out.print("Enter the K value : ");
int k = sc.nextInt();
for(int i=0;i<a.length;i++)
{
a[i] = sc.nextInt();
}
int res = sub(a , k);
System.out.print("\n\n"+res);
}
public static int sub(int[] a, int  k)
{
Map<Integer , Integer> map = new HashMap<>();
int s = 0 , max = 0;
for(int i=0;i<a.length;i++)
{
s += a[i];

if(s == k)
{
max= i+1;
}
if(!map.containsKey(s))
{
map.put(s, i);
}
if(map.containsKey(s - k))
{
max = Math.max(max , i-map.get(s - k));
}
}
return max;
}

}