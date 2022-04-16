package PractiseTheseJavaProgram.duplicatewordwithcount;

import net.bytebuddy.dynamic.scaffold.MethodGraph;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsWithCount1 {


    public static void duplicateWord(String newInput) {

        String[] words = newInput.split(" ");
        Map<String, Integer> output = new LinkedHashMap<>();
        for (String word : words) {
            if (output.containsKey(word)) {
                output.put(word, output.get(word) + 1);
            } else {
                output.put(word, 1);
            }
        }
        Set<String> newWords = output.keySet();
        for (String word : newWords) {
            if (output.get(word) > 1) {
                System.out.println(word + " " + output.get(word));
            }
        }
    }

    public static void main(String[] args) {
        duplicateWord("Today is Monday Monday is a great day");
    }
}
