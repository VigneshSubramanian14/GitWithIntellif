package PractiseTheseJavaProgram.swaptwonumber;

public class SwapNumbers5 {

    public void swapNumber() {
        int firstNumber = 10;
        int secondNumber = 20;

        System.out.println("Before Swapping: " + firstNumber + " " + secondNumber);
        firstNumber = firstNumber - secondNumber;
        secondNumber = firstNumber + secondNumber;
        firstNumber = secondNumber - firstNumber;

        System.out.println("After Swapping: " + firstNumber + " " + secondNumber);
    }

    public static void main(String[] args) {
        SwapNumbers5 obj = new SwapNumbers5();
        obj.swapNumber();
    }
}
