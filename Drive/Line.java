// program to find the Largest word in the Line
import java.util.Arrays;
import java.util.Scanner;
public class Line {
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Sentence :");
        s=sc.nextLine();
        String[] split =s.split(" ");
        int[] sp=new int[split.length];

        // for(int i=0;i<split.length;i++)
        // {
        //     System.out.print(split[i]+" ");
        // }
        for(int i=0;i<split.length;i++)
        {
            sp[i] = split[i].length();
        
        }
        System.out.println("Before :");
        for(int i:sp)
        {
            System.out.println(i+" ");
        }

        Arrays.sort(sp);

        System.out.println("After :");

        for(int i:sp)
        {
            System.out.println(i+" ");
        }

        int lv=sp[sp.length-1];

        System.out.println("\n\n"+lv);

        for(int i=0;i<sp.length;i++)
        {
            if( lv == split[i].length() )
            {
                System.out.println(split[i]);
            }
        }
    }
    
}
