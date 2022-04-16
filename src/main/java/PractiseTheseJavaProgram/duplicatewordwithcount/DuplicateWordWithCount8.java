package PractiseTheseJavaProgram.duplicatewordwithcount;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordWithCount8 {

    public void duplicateWord(String newInput) {
        String[] input = newInput.split(" ");
        Map<String,Integer> output = new LinkedHashMap<>();
        for (String word:input){
            if (output.containsKey(word)){
                output.put(word,output.get(word)+1);
            }else{
                output.put(word,1);
            }
        }
        Set<String> newWords = output.keySet();
        for (String words:newWords){
            if (output.get(words)>1){
                System.out.println(words+" "+output.get(words));
            }
        }
    }

    public static void main(String[] args) {
        DuplicateWordWithCount8 obj = new DuplicateWordWithCount8();
        String str = "Today is Monday Monday is a great day";
        String value = str.toLowerCase();
        obj.duplicateWord(value);
    }
}
