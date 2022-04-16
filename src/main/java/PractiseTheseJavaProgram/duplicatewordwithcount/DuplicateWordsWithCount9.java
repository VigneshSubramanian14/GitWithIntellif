package PractiseTheseJavaProgram.duplicatewordwithcount;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsWithCount9 {

    public void duplicateWord(String newInput) {
        String[] input = newInput.split(" ");
        Map<String, Integer> output = new LinkedHashMap<>();
        for (String word : input) {
            if (output.containsKey(word)) {
                output.put(word, output.get(word) + 1);
            } else {
                output.put(word, 1);
            }
        }
        Set<String> value = output.keySet();
        for (String word : value) {
            if (output.get(word) > 1) {
                System.out.println(word + " " + output.get(word));
            }
        }
    }

    public static void main(String[] args) {
        DuplicateWordsWithCount9 obj = new DuplicateWordsWithCount9();
        String value = "Today Is Friday Friday is a great day";
        String newValue = value.toLowerCase();
        obj.duplicateWord(newValue);
    }
}
