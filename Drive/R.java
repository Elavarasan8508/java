// find the repeated values in Array

import java.util.ArrayList;
import java.util.HashSet;
public class R
{
public static void main(String[] args)
{
int[] a={3,24,4,3,5,6,45,23,3,2,4,9};
ArrayList<Integer> al=new ArrayList<>();
HashSet<Integer>  hs=new HashSet<>();

for(int i:a)
{
if(!hs.contains(i))
{
hs.add(i);
}
else
{
al.add(i);
}

}
System.out.print(al);
System.out.print("\n"+hs);


}
}