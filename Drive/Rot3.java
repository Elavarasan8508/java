import java.util.Scanner;
public class Rot3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a={1,2,3,4,5,6};
        int len=a.length;
        System.out.println("Enter the Number to rotate the Array :");
        int k=sc.nextInt();

        int[] b=new int[len];
        
        System.out.println("Before");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
           b[i]=a[(i+k)%len];
        }
        System.out.println("\n After");
        for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i]+" ");
        }
    }
    
}
