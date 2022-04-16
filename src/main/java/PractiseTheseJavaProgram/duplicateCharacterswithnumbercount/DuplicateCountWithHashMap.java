package PractiseTheseJavaProgram.duplicateCharacterswithnumbercount;

import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateCountWithHashMap {

    public void duplicateCount(String input){

        Map<Character,Integer> output = new LinkedHashMap<>();
        for (int i=0;i<input.length();i=i+1){
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
        DuplicateCountWithHashMap obj = new DuplicateCountWithHashMap();
        obj.duplicateCount("akshjdgaklsdgajksdcmdhfjkcvx");
    }
}
