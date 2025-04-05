// Matrix 

import java.util.Arrays;
import java.util.Scanner;
public class Matrix
{
public static void main(String[] args)
{
int[][] a={{6,3,5,1},{6,7,5,4},{9,7,5,8}};

for(int i=0;i<a.length;i++)
{
Arrays.sort(a[i]);
}

for(int i=0;i<a.length;i++) // Loop through Rows
{
for(int j=0;j<a[i].length;j++) // Loop through Columns
{
System.out.print(a[i][j]);
}
System.out.println();
}

}
}