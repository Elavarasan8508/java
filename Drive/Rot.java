public class Rot {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        int l=a.length;
        int[] b=new int [l];
        for(int i=0;i<l;i++)
        {
            b[(i+1)%l]=a[i];
        }
        for (int i : b)
         {
           System.out.print(i+" ");   
        }
    }
    
}
