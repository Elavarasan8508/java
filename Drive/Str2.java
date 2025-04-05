import java.util.Scanner;
public class Str2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String :");
        String s=sc.nextLine();
        String[] n=s.split(" ");

        for(int i=0;i<n.length;i++)
        {
            String word=n[i];
            int len=word.length();
            String Capitalize = word.substring(0,1).toUpperCase()+word.substring(1,len-1).toLowerCase()+word.substring(len-1).toUpperCase();
                                                // First Letter                                       Middle Letters                       Last Letter                                            
             System.out.print(Capitalize);
            if(i < n.length-1)
            {
              System.out.print(" ");
        
            }
        }
}
}
