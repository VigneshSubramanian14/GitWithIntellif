package SampleCheck.Programcheck.com.java.practise;

import java.util.*;

public  class CharacterWithNumber {

        public void duplicateMethod(String input){
            Map<Character,Integer> output = new HashMap<>();
            for(int i=0;i<input.length();i=i+1){
                char ch = input.charAt(i);
                if(output.containsKey(ch)){
                    output.put(ch,(output.get(ch)+1));
                }else{
                    output.put(ch,1);
                }
            }
            System.out.println(output);
        }

    int[] a = {1,2,3,4,5,6,7,8};

    ArrayList ar = new ArrayList(20);

        public static void main(String[] args){
            CharacterWithNumber obj = new CharacterWithNumber();
            obj.duplicateMethod("viignesh");

        }
    }

