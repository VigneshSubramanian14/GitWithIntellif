package PractiseTheseJavaProgram.swaptwonumber;

public class SwapNumbers3 {

    public static void swapWithoutThirdVariable() {
        int firstNumber = 34;
        int secondNumber = 90;
        System.out.println("Before Swapping:" + firstNumber + " " + secondNumber);
        firstNumber = firstNumber - secondNumber;
        secondNumber = firstNumber + secondNumber;
        firstNumber = secondNumber - firstNumber;
        System.out.println("After Swapping:" + firstNumber + " " + secondNumber);
    }

    public static void main(String[] args) {
        swapWithoutThirdVariable();
    }
}
