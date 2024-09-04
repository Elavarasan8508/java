// In this code we have to print the String the codes without Spaces


public class Trim2
{
public static void main(String[] args){

String s="Einstein College Of Engineering  ";

// This code splits the Each and Every spaces 
String[] ns=s.split(" ");

//Creates a new String
String res="";


for(int i=0;i<ns.length;i++)
{
res = res+ ns[i]; // This can store the String in new new String 
}
System.out.println(res);
}
}

