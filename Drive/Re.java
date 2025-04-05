
import java.util.LinkedList;
import java.util.TreeSet;

// find the repeated values in Array
public class Re
{
    public static void main(String[] args) {

        int[] a={1,2,3,4,4,5,4,6,7};
        LinkedList<Integer> al=new LinkedList<>();
        TreeSet<Integer> hs=new TreeSet<>();

        for(int i:a)
        {
           if(!hs.contains(i))
           {
            hs.add(i);
           }
           else{
            al.add(i);
           }
        } 
        System.out.println(al);
        System.out.println(hs);
        
    }
}