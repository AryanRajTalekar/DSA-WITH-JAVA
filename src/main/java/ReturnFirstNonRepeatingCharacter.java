public class ReturnFirstNonRepeatingCharacter {

    public static void main (String args[]){
        String str = "AryanRajTalekar";
        System.out.println(NonRep(str));
    }

    static char NonRep(String str){
        str =str.toLowerCase();

        for(int i=0;i<str.length();i++){
            boolean found = false;
            for(int j = 0;j< str.length();j++){
                if(i!=j && str.charAt(i) == str.charAt(j)){
                    found = true;
                    break;
                }
            }
            if(!found) return str.charAt(i);
        }


        return '$';


    }
}
