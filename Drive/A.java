// Array problem 1


// java program to sum the couple of items in an Array 
// input -> []a={1,2,3,4};
// output->1. 1+2=3
// output->2. 3+4=7 

import java.util.Arrays;
public class A
{
public static void main(String[] args)
{
int[] a={2,4,7,5,4,9};
//System.out.print(Arrays.toString(a));

for(int i:a)
  System.out.print(i+ "  ");                                                    // Learn from Yesterday   Live for Today   Hope for Tommorow


for(int i=0;i<a.length-1;i+=2)
{
int sum=a[i]+a[i+1];

System.out.println("\n\n"+sum);
}


if((a.length)%2 != 0 )
{
System.out.print("\n"+"The Last Element in the Array is  "+a[a.length-1]+" Unpaired...");
}
}
}



