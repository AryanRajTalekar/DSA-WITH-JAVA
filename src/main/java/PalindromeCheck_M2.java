public class PalindromeCheck_M2 {


        public static void main(String args[]){
            String str = "abba";
            System.out.println(isPalindrome(str));
        }

        static boolean isPalindrome(String str){
            StringBuilder rs = new StringBuilder(str);
            rs.reverse();
            if(str.equals(rs)) return false;

         return true;
        }

    }



