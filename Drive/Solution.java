import java.util.ArrayList;
import java.util.Scanner;
public class Solution{

    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int num;
       System.out.print("Enter N:");
       num=sc.nextInt();
      ArrayList<Integer> l=printDivisors(num);
      System.out.print(l);
    }
    public static ArrayList< Integer > printDivisors(int n) {
        // Write your code here
        ArrayList<Integer> li=new ArrayList<Integer>();
        for(int i=1;i<=n;i++)
         {
             if(n%i == 0)
             {
                 li.add(i);
             }

         }
         return li;
    }
}