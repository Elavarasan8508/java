
// input --> S="Hey iam there ";
// Output--> S="There$Iam$Hey"


import java.util.Scanner;
public class Str {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String to reverse :");
        String s=sc.nextLine();
        String[] n=s.split(" ");
        
        for(int i=n.length-1;i>=0;i--)
        {
            String word = n[i];
            int len = word.length();
           System.out.print(word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase());
           if(i != 0)
           {
            System.out.print("$");
           }

        }
    }
    
}
