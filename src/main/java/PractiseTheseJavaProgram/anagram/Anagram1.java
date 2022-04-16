package PractiseTheseJavaProgram.anagram;

import java.util.Arrays;

public class Anagram1 {

    public void anagramMethod() {
        String a = "silent";
        String b = "listen";

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
        Anagram1 obj = new Anagram1();
        obj.anagramMethod();
    }
}
