package PractiseTheseJavaProgram.duplicatewordwithcount;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordWithCount4 {

    public void duplicateWordWithCount(String newInput) {

        String[] input = newInput.split(" ");
        Map<String, Integer> output = new LinkedHashMap<>();
        for (String word : input) {
            if (output.containsKey(word)) {
                output.put(word, output.get(word) + 1);
            } else {
                output.put(word, 1);
            }
        }
        Set<String> words = output.keySet();
        for (String word : words) {
            if (output.get(word) > 1) {
                System.out.println(word + " " + output.get(word));
            }
        }
    }

    public static void main(String[] args) {
        DuplicateWordWithCount4 obj = new DuplicateWordWithCount4();
        String word = "Today is Monday Monday is be a great day";
        String words = word.toLowerCase();
        obj.duplicateWordWithCount(words);
    }
}
