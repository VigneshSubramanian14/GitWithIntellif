package PractiseTheseJavaProgram.duplicatewordwithcount;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsWithCount7 {

    public void duplicateWordWithCount(String newInput) {
        String[] input = newInput.split(" ");
        Map<String,Integer> output = new LinkedHashMap<>();
        for (String word:input){
            if (output.containsKey(word)){
                output.put(word,output.get(word)+1);
            }else{
                output.put(word,1);
            }
        }
        Set<String> value = output.keySet();
        for (String words:value){
            if (output.get(words)>1){
                System.out.println(words+" "+output.get(words));
            }
        }
    }

    public static void main(String[] args) {
        DuplicateWordsWithCount7 obj = new DuplicateWordsWithCount7();
        String value = "Today is Monday Monday is a great day";
        String newValue = value.toLowerCase();
        obj.duplicateWordWithCount(newValue);
    }
}
