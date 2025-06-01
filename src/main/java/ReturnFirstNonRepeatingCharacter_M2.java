import java.util.LinkedHashMap;
import java.util.Map;

public class ReturnFirstNonRepeatingCharacter_M2 {
    public static void main(String[] args) {
        String str = "AryanRajTalekar";
        System.out.println(NonRep(str));
    }

    static char NonRep(String str) {
        str = str.toLowerCase();

        Map<Character, Integer> freqMap = new LinkedHashMap<>();

        // First pass: count frequencies
        for (char ch : str.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        // Second pass: find first non-repeating
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return '$'; // if no non-repeating character found
    }
}
