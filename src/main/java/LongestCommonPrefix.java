import java.util.Arrays;

public class LongestCommonPrefix {


    public static void main(String args[]){

        String[] str = {"geeksforGeeks","geeksf","geeeks","geeee"};

        System.out.println(LongestCommonP(str));
    }

    static String LongestCommonP(String[] str){

            Arrays.sort(str);

            //only consider first and last element as they will have the least commonality

        String first = str[0];
        String last = str[str.length-1];
        int i = 0;
        while(i<first.length() && i<last.length()&& first.charAt(i)==last.charAt(i)){
            i++;
        }

        return first.substring(0,i);
    }
}
