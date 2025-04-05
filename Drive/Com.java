import java.util.Arrays;
public class Com
{
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[] b={1,2,3,4,4};
        boolean c=Arrays.equals(a,b);
        if(c)
        {
            System.out.println(true);
        }
        else 
           System.out.println(false);

        
    }
}