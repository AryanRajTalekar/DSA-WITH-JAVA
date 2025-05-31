import java.util.Stack;

public class ReverseAString_M3 {
    public static void main (String args[]){
        String str = "AryanRajTalekar";
        System.out.println(ReverseString(str));
    }

    static String ReverseString(String str){


        Stack<Character> st = new Stack<>();

        for(int i = 0;i<str.length();i++){
            st.push(str.charAt(i));
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<str.length();i++){
            sb.append(st.pop());
        }



        return sb.toString();
    }
}
