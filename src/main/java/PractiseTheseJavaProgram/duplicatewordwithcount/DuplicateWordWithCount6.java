package PractiseTheseJavaProgram.duplicatewordwithcount;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordWithCount6 {

    public static void duplicate(String newInput) {

        String[] input = newInput.split(" ");
        Map<String,Integer> output = new LinkedHashMap<>();
        for (String words:input){
            if (output.containsKey(words)){
                output.put(words,output.get(words)+1);
            }else{
                output.put(words,1);
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
        String value = "Today is Monday Monday will be a great day";
        duplicate(value);
    }
}
