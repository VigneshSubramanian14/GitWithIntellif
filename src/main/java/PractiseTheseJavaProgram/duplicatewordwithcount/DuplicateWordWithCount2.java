package PractiseTheseJavaProgram.duplicatewordwithcount;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordWithCount2 {

    public void duplicateCount(String newInput) {
        String[] input = newInput.split(" ");
        Map<String, Integer> output = new LinkedHashMap<>();
        for (String words : input) {
            if (output.containsKey(words)) {
                output.put(words, output.get(words) + 1);
            } else {
                output.put(words, 1);
            }
        }
        Set<String> word = output.keySet();
        for (String words : word) {
            if (output.get(words) > 1) {
                System.out.println(words + " " + output.get(words));
            }
        }
    }

    public static void main(String[] args) {
        DuplicateWordWithCount2 obj = new DuplicateWordWithCount2();
        String str = "Today is Monday Today will be a great Monday Today";
        obj.duplicateCount(str);
    }
}
