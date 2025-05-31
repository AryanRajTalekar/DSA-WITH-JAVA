public class ReverseSequenceOfWords {

    public static void main (String args[]){
        String str = "Aryan    Raj     Talekar";
        System.out.println(ReverseWords(str));
    }

    static String ReverseWords(String str){


        String[] words= str.trim().split("\\s+");
//        instead of \\s+ if input is in aryan..raj..talekar format then
//        we will right \\.+



//        for(int i=0;i<words.length;i++){
//            System.out.println(words[i]);
//        }


        StringBuilder sb = new StringBuilder();


        for(int i = words.length-1;i>=0;i--){
            sb.append(words[i]);
            if(i>0) sb.append(" ");
        }

        return sb.toString();
    }
}
