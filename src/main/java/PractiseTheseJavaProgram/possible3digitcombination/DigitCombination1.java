package PractiseTheseJavaProgram.possible3digitcombination;

public class DigitCombination1 {

    public void digitCombination() {
        int value[] = {1, 2, 3};
        for (int i = 0; i < value.length; i = i + 1) {
            for (int j = 0; j < value.length; j = j + 1) {
                for (int k = 0; k < value.length; k = k + 1) {
                    if (i != j && j != k && k != i) {
                        System.out.println(i + " " + j + " " + k);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        DigitCombination1 obj = new DigitCombination1();
        obj.digitCombination();
    }
}
