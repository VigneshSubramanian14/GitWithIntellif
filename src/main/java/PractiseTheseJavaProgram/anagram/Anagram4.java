package PractiseTheseJavaProgram.anagram;

import java.util.Arrays;

public class Anagram4 {

    public void anagram() {
        String a = "silent";
        String b = "listen";

        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if (Arrays.equals(ch1,ch2)){
            System.out.println("It is a Anagram");
        }else{
            System.out.println("It is not a Anagram");
        }
    }

    public static void main(String[] args) {
        Anagram4 obj = new Anagram4();
        obj.anagram();
    }
}
