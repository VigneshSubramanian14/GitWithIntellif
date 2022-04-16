package PractiseTheseJavaProgram.vowelsInAString;

import java.util.Scanner;

public class VowelsInAString2 {

    public void vowelsInString() {
        String s;
        char ch;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
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
                    count = 1;
                    System.out.println(ch);
            }
        }
        if (count==0){
            System.out.println("There are no vowels in String");
        }
    }

    public static void main(String[] args) {
        VowelsInAString2 obj = new VowelsInAString2();
        obj.vowelsInString();
    }
}
