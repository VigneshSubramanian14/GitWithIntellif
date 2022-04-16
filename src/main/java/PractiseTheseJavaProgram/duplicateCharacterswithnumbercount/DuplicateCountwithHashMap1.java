package PractiseTheseJavaProgram.duplicateCharacterswithnumbercount;

import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateCountwithHashMap1 {

    public void duplicateCount(String input) {

        Map<Character, Integer> output = new LinkedHashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (output.containsKey(ch)){
                output.put(ch,output.get(ch)+1);
            }else{
                output.put(ch,1);
            }
        }
        System.out.println(output);
    }

    public static void main(String[] args) {
        DuplicateCountwithHashMap1 obj = new DuplicateCountwithHashMap1();
        obj.duplicateCount("ahjksdfgjkasgfajksgf");
    }
}
