public class CheckStringRotationOfEachOther {

    public static void main (String args[]){
        String str1 = "abcd";
        String str2 = "cdab";
        System.out.println(isRotation(str1,str2));
    }


    // logic

//        if s2 is a rotation of s1 then s2 will be a substring of (s1+s1)

    static boolean isRotation(String str1, String str2){
        if(str1.length()==str2.length() && (str1+str1).contains(str2)){
            return true;
        }


        return false;
    }


}
