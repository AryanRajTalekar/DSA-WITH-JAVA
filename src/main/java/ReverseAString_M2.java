public class ReverseAString_M2 {

    public static void main (String args[]){
        String str = "AryanRajTalekar";
        System.out.println(ReverseString(str));
    }

    static String ReverseString(String str){


        StringBuilder sb = new StringBuilder(str);
        int start = 0;
        int end = str.length()-1;

        while(start<end){

            char temp = str.charAt(start);
            sb.setCharAt(start,sb.charAt(end));
            sb.setCharAt(end,str.charAt(start));
            start++;
            end--;

        }

        return sb.toString().toUpperCase();
    }
}
