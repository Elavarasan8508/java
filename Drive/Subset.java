public class Subset {
    public static void main(String[] args) {
        
        

        see();
    }
        public static void see()
        {
            
            int[] a={11,7,1,13,21,3,7,3};
            int[] b={11,3,7,1,7};
            int n=a.length;
            int m=b.length;
            int i=0;
            int j=0;
            int count =0;

            while(i<n && j<m)
            {
                if(a[i] == b[j])
                {
                    count++;
                    i++;
                    j++;
                }
                else if(a[i] != b[j])
                {
                    i++;
                }
            }
            if(count == m){
                System.out.println("yes");
            }
            else
            {
                System.out.println("No");
            }
        }
    }
    

