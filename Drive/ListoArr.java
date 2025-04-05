import java.util.TreeSet;
public class ListoArr {
    public static void main(String[] args) {
        
        TreeSet<Integer> ts=new TreeSet<>();
        

        ts.add(3);
        ts.add(4);
        ts.add(6);
        ts.add(9);
        ts.add(1);

        Integer[] a=ts.toArray(new Integer[ts.size()]);

        for(int i:a)
        {
            System.out.println(i);
        }
    }
}
