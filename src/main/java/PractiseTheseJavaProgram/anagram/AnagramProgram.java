package PractiseTheseJavaProgram.anagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AnagramProgram {

    public void splitMethod(){
        String a = "listen";
        String b = "silent";

        String[] value1 = a.split("");
        String[] value2 = b.split("");

        ArrayList<String> obj1 = new ArrayList<String >(List.of((value1)));
        ArrayList<String> obj2 = new ArrayList<String>(List.of(value2));
        Collections.sort(obj1);
        Collections.sort(obj2);
        System.out.println(obj1.equals(obj2));
    }

    public static void main(String[] args){
        AnagramProgram obj = new AnagramProgram();
        obj.splitMethod();
        System.out.println("**************************");
        String str1 = "Race";
        String str2 = "Care";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // check if length is same
        if(str1.length() == str2.length()) {

            // convert strings to char array
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            // sort the char array
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            // if sorted char arrays are same
            // then the string is anagram
            boolean result = Arrays.equals(charArray1, charArray2);

            if(result) {
                System.out.println(str1 + " and " + str2 + " are anagram.");
            }
            else {
                System.out.println(str1 + " and " + str2 + " are not anagram.");
            }
        }
        else {
            System.out.println(str1 + " and " + str2 + " are not anagram.");
        }
    }
}
