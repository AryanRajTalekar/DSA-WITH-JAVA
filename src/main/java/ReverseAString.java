public class ReverseAString {

    public static void main (String args[]){
        String str = "AryanRajTalekar";
        System.out.println(ReverseString(str));
    }

    static String ReverseString(String str){


        StringBuilder sb = new StringBuilder();


        for(int i=str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
        }



        return sb.toString();
    }
}
