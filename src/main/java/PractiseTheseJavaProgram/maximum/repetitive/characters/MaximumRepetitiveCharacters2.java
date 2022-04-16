package PractiseTheseJavaProgram.maximum.repetitive.characters;

import java.util.Scanner;

public class MaximumRepetitiveCharacters2 {

    public static void maximumRepetitiveCharacters() {
        String maxOccChar;
        int i, max = 0;
        int[] charFreq = new int[256];
        System.out.println("Enter the value: ");
        Scanner sc = new Scanner(System.in);
        maxOccChar = sc.nextLine();
        for ( i = 0; i < maxOccChar.length(); i++) {
            charFreq[maxOccChar.charAt(i)]++;
        }
        for ( i = 0; i < 256; i++) {
            if (charFreq[i] > charFreq[max]) {
                max = i;
            }
        }
        System.out.format("The maximum character is : %c",max);
        System.out.format("\n'%c'The character occurs in %d times: ",max,charFreq[max]);

    }
    public static void main(String[] args) {
        maximumRepetitiveCharacters();
    }
}
