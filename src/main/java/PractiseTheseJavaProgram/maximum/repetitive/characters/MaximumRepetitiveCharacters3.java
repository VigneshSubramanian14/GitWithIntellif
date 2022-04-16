package PractiseTheseJavaProgram.maximum.repetitive.characters;

import java.util.Scanner;

public class MaximumRepetitiveCharacters3 {

    public void maxRepetitiveCharacters() {
        String maxOccStr;
        int i, max = 0;
        int[] charFreq = new int[256];
        System.out.println("Enter the value: ");
        Scanner sc = new Scanner(System.in);
        maxOccStr = sc.nextLine();
        for (i = 0; i < maxOccStr.length(); i++) {
            charFreq[maxOccStr.charAt(i)]++;
        }
        for (i = 0; i < 256; i++) {
            if (charFreq[i] > charFreq[max]) {
                max = i;
            }
        }
        System.out.format("Maximum repetitive character is : %c ", max);
        System.out.format("\n'%c' Repeated maximum time with count '%d' ", max, charFreq[max]);
    }

    public static void main(String[] args) {
        MaximumRepetitiveCharacters3 obj = new MaximumRepetitiveCharacters3();
        obj.maxRepetitiveCharacters();
    }
}
