public class Mat
{
public static void main(String[] args)
{
int[] a={1,1,1};
int[] c= new int[a.length];
boolean b=false;

/*      for (int i = 0; i < a.length; i++) {
            if (a[i] != c[i]) {  // If any element doesn't match, it's not a palindrome
                b = true;
                break;
            }
        }*/

for(int i=a.length-1,j=0;i>=0;i--,j++)
{
c[j] =a[i];
}


for(int i=0;i<a.length;i++)
{
if(a[i] != c[i])
{
b = true;
break;
}
}

if(!b)
{
System.out.print("Palindrome..");
}

else
{
System.out.print("Not Palindrome..");
}

/*public class Mat {
    public static void main(String[] args) {
        int[] a = { 4, 5, 2, 4, 6, 7, 8, 5, 1 };
        boolean b = true;

        // Compare array from start and end towards the center
        for (int i = 0; i < a.length / 2; i++) {
            if (a[i] != a[a.length - 1 - i]) 
              {
                b = false;
                break;
            }
        }

        if (b) {
            System.out.print("Palindrome..");
        } else {
            System.out.print("Not Palindrome..");
        }
    }
}
*/



}
}