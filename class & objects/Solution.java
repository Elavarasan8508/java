
class Solution{
    public static void main(String[] args){
int N=12;
        // code here
        int count=0;
        int val = N;
    while(N != 0)
    {
        N=N%10;
        if(N != 0 && val%N==0) 
        if(N==1) count++;
        N=N/10;
    }
    System.out.print( count);
    }
}