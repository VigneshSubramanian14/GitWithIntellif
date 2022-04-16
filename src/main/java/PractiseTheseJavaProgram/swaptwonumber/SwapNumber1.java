package PractiseTheseJavaProgram.swaptwonumber;

public class SwapNumber1 {

    public void reverNumberWithThridVariable() {
        int firstNumber = 100;
        int secondNumber = 200;
        System.out.println("Before Swapping: " + firstNumber + " : " + secondNumber);
        int temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;
        System.out.println("After Swapping: " + firstNumber + " : " + secondNumber);
    }

    public void reverseNumberWithoutThirdVariable() {
        int firstNumber = 10;
        int secondNumber = 20;
        System.out.println("Before Swapping: " + firstNumber + " : " + secondNumber);
        firstNumber = firstNumber - secondNumber;
        secondNumber = firstNumber + secondNumber;
        firstNumber = secondNumber - firstNumber;
        System.out.println("After Swapping: " + firstNumber + " : " + secondNumber);
    }

    public static void main(String[] args) {
        SwapNumber1 obj = new SwapNumber1();
        obj.reverNumberWithThridVariable();
        obj.reverseNumberWithoutThirdVariable();
    }
}
