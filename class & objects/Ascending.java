import java.util.Scanner;

public class Ascending {
public static void main(String[] args) 
{
  int[] a = {50, 25, 30, 14, 6};
 int temp;
for (int i = 0; i < a.length - 1; i++) 
{ 
for (int j = i + 1; j < a.length; j++) 
{ 
  if (a[i] > a[j]) {
 temp = a[i];
 a[i] = a[j];
 a[j] = temp;
}
}
}
System.out.println("Ascending order:");
for (int i = 0; i < a.length; i++) 
{
  System.out.println(a[i]);
}
}
}
