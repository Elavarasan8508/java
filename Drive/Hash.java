// Hashset 

import java.util.HashSet;
import java.util.ArrayList;
public class Hash
{
public static void main(String[] args)
{
int[] a={5,2,3,3,3,4,5,5,6,7};
int element =11;

HashSet<Integer> set=new HashSet<>();
ArrayList<Integer> duplicate=new ArrayList<>();

for(int i:a)
{
if(!set.contains(i))
  set.add(i);   // It contains Without Duplicate
else
  duplicate.add(i);// It contains Duplicate
}

System.out.print(set);
System.out.print("\n "+duplicate);

Integer[] b=new Integer[element]; 
b=set.toArray(b);

for(int i=0;i<element;i++)
{
System.out.print("\n"+b[i]+" ");
}


}
}


   