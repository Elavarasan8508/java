// In this program we put the 5 float input and then to sum it

import java.util.Arrays;
public class New10{
public static void main(String [] args){
float[] f={2.32f,2.43f,5.43f,6.43f,3.54f};
double d=0;
for(int i=0;i<f.length;i++)
{
d=d+f[i];
}
System.out.print("The sum is:"+d);

}
}