public class Matr
{
public static void main(String[] args)
{
int[][] a={{0,2,1},{2,0,5},{2,4,0}};
boolean b= false;
int i;

for(i=0;i<a.length;i++)
{
if (a[i][i] != 0)
{
b=true;
break;
}
}

if(!b)
{
System.out.print("True");
}
else
{
System.out.print("Fasle");
}

}
}