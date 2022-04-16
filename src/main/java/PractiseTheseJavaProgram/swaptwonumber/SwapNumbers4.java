package PractiseTheseJavaProgram.swaptwonumber;

public class SwapNumbers4 {

    public void swapNumber() {
        int firstNumber = 12345;
        int secondNumber = 4567;
        System.out.println("Before Swapping: " + firstNumber + " " + secondNumber);
        firstNumber = firstNumber - secondNumber;
        secondNumber = firstNumber + secondNumber;
        firstNumber = secondNumber - firstNumber;
        System.out.println("After Swapping: " + firstNumber + " " + secondNumber);
    }

    public static void main(String[] args) {
        SwapNumbers4 obj = new SwapNumbers4();
        obj.swapNumber();
    }
}
