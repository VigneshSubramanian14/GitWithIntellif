package PractiseTheseJavaProgram.anagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Anagram13 {

    public void anagramWithSimpleConcept() {
        String a = "listen";
        String b = "silent";
        char[] obj1 = a.toCharArray();
        char[] obj2 = b.toCharArray();
        Arrays.sort(obj1);
        Arrays.sort(obj2);
        if (Arrays.equals(obj1, obj2)) {
            System.out.println("It is a anagram");
        } else {
            System.out.println("It is not a anagram");
        }
    }

    public void anagramWithCollections() {
        String a = "listen";
        String b = "silent";
        char[] obj1 = a.toCharArray();
        char[] obj2 = b.toCharArray();
        ArrayList value1 = new ArrayList(List.of(obj1));
        ArrayList value2 = new ArrayList(List.of(obj2));
        Collections.sort(value1);
        Collections.sort(value2);
        if (value1.equals(value2)) {
            System.out.println("It is a anagram");
        } else {
            System.out.println("It is not a anagram");
        }
    }


    public static void main(String[] args) {
        Anagram13 obj = new Anagram13();
        obj.anagramWithSimpleConcept();
        System.out.println("*********************");
        obj.anagramWithCollections();
    }
}
