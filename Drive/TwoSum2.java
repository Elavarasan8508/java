import java.util.Scanner;
public class TwoSum2 {
    public static void main(String[] args) {
        
        int[] a={1,2,3,4,5};
        Scanner sc=new Scanner(System.in);
        int l=a.length;
        System.out.println("Enter the Triplet Value :");
        int x=sc.nextInt();
        boolean found = false;

        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                for(int k=j+1;k<a.length;k++)
                {
                    if(a[i]+a[j]+a[k]  == x)
                    {
                       found =true;
                       System.out.println(true);
                       break;
                    }
                }
            }
        }
        if(!found)
         System.out.println(false);
        
    }
}
