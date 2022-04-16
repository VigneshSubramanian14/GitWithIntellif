package PractiseTheseJavaProgram.anagram;

import java.util.Arrays;

public class Anagram5 {

    public void anagramMethod() {
        String a = "listen";
        String b = "silent";

        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if (Arrays.equals(ch1,ch2)){
            System.out.println("It is a anagram");
        }else{
            System.out.println("It is not a anagram");
        }
    }

    public static void main(String[] args) {
        Anagram5 obj = new Anagram5();
        obj.anagramMethod();
    }
}
