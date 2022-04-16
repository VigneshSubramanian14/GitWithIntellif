package PractiseTheseJavaProgram.vowelsInAString;

import java.util.Scanner;

public class VowelsInAString1 {

    public void vowelsInString() {
        String s;
        char ch;
        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        s = sc.nextLine();
        for (int j = 0; j < s.length(); j = j + 1) {
            ch = s.charAt(j);
            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    i = 1;
                    System.out.println(ch);
            }
        }
        if (i==0){
            System.out.println("There are no vowels in String");
        }
    }

    public static void main(String[] args) {
        VowelsInAString1 obj = new VowelsInAString1();
        obj.vowelsInString();
    }
}
