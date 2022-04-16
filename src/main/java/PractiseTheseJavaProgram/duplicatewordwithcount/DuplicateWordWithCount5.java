package PractiseTheseJavaProgram.duplicatewordwithcount;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordWithCount5 {

    public void duplicateWord(String newInput) {
        String[] word = newInput.split(" ");
        Map<String, Integer> output = new LinkedHashMap<>();
        for (String words : word) {
            if (output.containsKey(words)) {
                output.put(words, output.get(words) + 1);
            } else {
                output.put(words, 1);
            }
        }
        Set<String> newWords = output.keySet();
        for (String words : newWords) {
            if (output.get(words) > 1) {
                System.out.println(words + " " + output.get(words));
            }
        }
    }

    public static void main(String[] args) {
        DuplicateWordWithCount5 obj = new DuplicateWordWithCount5();
        String str = "Today is a great day and today is monday and monday is the starting day";
        String newStr = str.toLowerCase();
        obj.duplicateWord(newStr);
    }
}

