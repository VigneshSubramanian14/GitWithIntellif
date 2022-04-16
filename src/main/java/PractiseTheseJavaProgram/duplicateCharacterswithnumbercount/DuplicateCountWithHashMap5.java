package PractiseTheseJavaProgram.duplicateCharacterswithnumbercount;

import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateCountWithHashMap5 {

    public void duplicateCharacters(String input) {

        Map<Character, Integer> output = new LinkedHashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (output.containsKey(ch)) {
                output.put(ch, output.get(ch) + 1);
            } else {
                output.put(ch, 1);
            }
        }
        System.out.println(output);
    }

    public static void main(String[] args) {
        DuplicateCountWithHashMap5 obj = new DuplicateCountWithHashMap5();
        String value = "TodayIsFridayWakeup";
        String newValue = value.toLowerCase();
        obj.duplicateCharacters(newValue);
    }
}
