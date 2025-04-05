import java.util.ArrayList;
import java.util.Scanner;

public class Rot2 {

    public static void main(String[] args) {

        ArrayList<Integer> ar=new ArrayList<>();
        ar.add(3);
        ar.add(4);
        ar.add(5);
        ar.add(0);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number to Rotate the ArrayList : ");
        int k= sc .nextInt();


        ArrayList<Integer> result= rotateArray(ar, k);
        System.out.println("Before Rotate : "+ar);
        System.out.println("After Rotate : "+result);

    }
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.
        int len=arr.size();
        k=k%len;
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=k;i<len;i++)
        {
           al.add(arr.get(i));
        }
        for(int i=0;i<k;i++)
        {
            al.add(arr.get(i));
        }
        return al;
        

    }
} 
    

