package PractiseTheseJavaProgram.possible3digitcombination;

public class DigitCombination5 {

    public void digitCombination() {
        int[] a = {4, 7, 9};
        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < a.length; ++j) {
                for (int k = 0; k < a.length; ++k) {
                    if (i != j && j != k && k != i) {
                        System.out.println(i+" "+j+" "+k);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        DigitCombination5 obj =new DigitCombination5();
        obj.digitCombination();
    }
}
