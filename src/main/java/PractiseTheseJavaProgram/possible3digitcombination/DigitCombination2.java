package PractiseTheseJavaProgram.possible3digitcombination;

public class DigitCombination2 {

    public static void digitCombination() {
        int[] a = {1, 2, 3};
        for (int i = 0; i <= a.length; i = i + 1) {
            for (int j = 0; j < a.length; j = j + 1) {
                for (int k = 0; k <= a.length; k = k + 1) {
                    if (i != j && j != k && k != i) {
                        System.out.println(i + " " + j + " " + k);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        digitCombination();
    }
}
