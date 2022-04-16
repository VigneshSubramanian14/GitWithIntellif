package PractiseTheseJavaProgram.maximum.repetitive.characters;

import java.util.Scanner;

public class MaximumRepetitive1 {

    public void maximumRepetitive() {
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
        System.out.format("The Maximum Occurring Character:%c",max);
        System.out.format("\n'%c' Character Occurs %d Times ", max, charFreq[max]);
    }

    public static void main(String[] args) {
        MaximumRepetitive1 obj = new MaximumRepetitive1();
        obj.maximumRepetitive();
    }
}
