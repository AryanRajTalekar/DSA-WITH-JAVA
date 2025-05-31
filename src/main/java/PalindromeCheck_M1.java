public class PalindromeCheck_M1 {

    public static void main(String args[]){
        String str = "abba";
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str){
        str = str.toLowerCase();

        for(int i=0;i<str.length()/2;i++){

//            we only go till str.length()/2 as no need to go to the other half of the String
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);

            if(start != end) return false;
        }




        return true;
    }
}
