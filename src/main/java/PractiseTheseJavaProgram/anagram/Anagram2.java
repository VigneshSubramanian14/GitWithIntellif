package PractiseTheseJavaProgram.anagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Anagram2 {

    public void anagramConcept() {
        String a = "silent";
        String b = "listen";

        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if (Arrays.equals(ch1, ch2)) {
            System.out.println("It is a anagram");
        } else {
            System.out.println("It is not a anagram");
        }
    }

    public static void main(String[] args) {
        Anagram2 obj = new Anagram2();
        obj.anagramConcept();
    }
}
