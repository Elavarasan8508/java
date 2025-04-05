// Pairs with difference K

import java.util.HashMap;
import java.util.*;
public class Pair
{
public static void main(String[] args)
{
int[] a={3,4,2,5,3,3,7,5};
Scanner sc=new Scanner(System.in);
System.out.print("Enter the Key value :");
int k=sc.nextInt();
int res = p(a,k);
System.out.print(res);
}

public static int p(int[] a,int k)
{
int count=0;
Map<Integer,Integer> m=new HashMap<>();

for(int i:a)
{
   m.put(i, m.getOrDefault(i, 0) + 1);
// m.put(i, m.getOrDefault(i, 0) + 1);

}

for(int i:a)
{
if(m.containsKey(i-k))
{
count += m.get(i-k);
}
}

return count;
}
}