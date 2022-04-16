package PractiseTheseJavaProgram.swaptwonumber;

public class SwapNumber4 {
    public void swapNumber() {
        int firstNumber = 1234;
        int secondNumber = 345;
        firstNumber = firstNumber - secondNumber;
        secondNumber = firstNumber + secondNumber;
        firstNumber = secondNumber - firstNumber;
        System.out.println(firstNumber + " " + secondNumber);
    }

    public static void main(String[] args) {
        SwapNumber4 obj = new SwapNumber4();
        obj.swapNumber();
    }
}
