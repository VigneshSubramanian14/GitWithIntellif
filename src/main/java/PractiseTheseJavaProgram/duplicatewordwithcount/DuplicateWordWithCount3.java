package PractiseTheseJavaProgram.duplicatewordwithcount;

import net.bytebuddy.dynamic.scaffold.MethodGraph;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordWithCount3 {

    public void duplicateWords(String newInput) {

        String[] input = newInput.split(" ");
        Map<String, Integer> output = new LinkedHashMap<>();
        for (String words : input) {
            if (output.containsKey(words)) {
                output.put(words, output.get(words) + 1);
            } else {
                output.put(words, 1);
            }
        }
        Set<String> value = output.keySet();
        for (String word:value){
            if (output.get(word)>1){
                System.out.println(word+" "+output.get(word));
            }
        }
    }

    public static void main(String[] args) {
        DuplicateWordWithCount3 obj = new DuplicateWordWithCount3();
        String str = "Today is Thursday Thursday will be a great day";
        obj.duplicateWords(str);
    }
}
