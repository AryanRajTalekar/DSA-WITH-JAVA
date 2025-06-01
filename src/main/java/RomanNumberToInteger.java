import java.util.HashMap;
import java.util.Map;

public class RomanNumberToInteger {

    public static void main(String args[]){
        String str = "XM";
        System.out.println(RomantoInt(str));
    }

    public static int RomantoInt(String str){
        Map<Character,Integer> romanMap = new HashMap<>();


        romanMap.put('I',1);
        romanMap.put('V',5);
        romanMap.put('X',10);
        romanMap.put('L',50);
        romanMap.put('C',100);
        romanMap.put('D',500);
        romanMap.put('M',1000);


        int result =0;

        for(int i=0;i<str.length();i++){
            int current = romanMap.get(str.charAt(i));

            if(i+1<str.length()&& current<romanMap.get(str.charAt(i+1))){
                result -= current;
            }else{
                result += current;
            }
        }

        return result;

    }
}


//"XM" is invalid as a Roman numeral even though your code gives it a numeric result.
//In Roman numerals, subtraction is only allowed in specific pairs:
//| Symbol | Can be subtracted **from** |
//        | ------ | -------------------------- |
//        | **I**  | V, X                       |
//        | **X**  | L, C                       |
//        | **C**  | D, M                       |


//That’s it. Any other subtraction pattern is considered invalid.
