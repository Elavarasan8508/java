//Two Pointers

public class Two
{
public static void main(String[] args)
{

int[] nums={1,2,0,0,5,0};
int[] res=two(nums);

for(int i:res)

System.out.print(i+" ");
}

public static int[] two(int[] num)
{

int n=num.length;

if(n==0 || n==1)
  return num;

int slow=0;
int fast=0;
while (fast < n)
{

if(num[fast] != 0)
{
int temp=num[fast];
num[fast]=num[slow];
num[slow]=temp;
slow++;
fast++;
}
else{
fast++;
}
}
return num;
}
}

