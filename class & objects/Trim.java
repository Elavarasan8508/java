public class Trim {
public static void main(String[] args) {
        // TODO code application logic here
        String ans = "Einstein College Of Engineering";
        String[] st = ans.split(" ");
        String val="";
        for(int i=0;i<st.length;i++){
            val +=st[i];
        }
        System.out.println(val);
        
    }
    
}