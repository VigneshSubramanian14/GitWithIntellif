package PractiseTheseJavaProgram.vowelsInAString;

import java.util.Scanner;

public class VowelsInAString5 {

    public void vowelsInString() {
        String a;
        char ch;
        int count = 0;
        System.out.println("Enter the value: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextLine();
        for (int i = 0; i < a.length(); i = i + 1) {
            ch = a.charAt(i);
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
        if (count ==0){
            System.out.println("There are no vowels in it");
        }
    }

    public static void main(String[] args) {
        VowelsInAString5 obj = new VowelsInAString5();
        obj.vowelsInString();
    }
}
