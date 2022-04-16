package PractiseTheseJavaProgram.possible3digitcombination;

public class DigitCombination4 {

    public void digitCombination() {
        int[] a = {3, 5, 8};
        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < a.length; ++j) {
                for (int k = 0; k < a.length; ++k) {
                    if (i != j && j != k && k != i) {
                        System.out.println(i + " " + j + " " + k);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        DigitCombination4 obj = new DigitCombination4();
        obj.digitCombination();
    }
}
