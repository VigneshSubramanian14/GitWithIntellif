package PractiseTheseJavaProgram.swaptwonumber;

public class SwapNumber2 {

    public void swapWithoutThirdNumber() {
        int firstNumber = 10;
        int secondNumber = 20;

        firstNumber = firstNumber - secondNumber;
        secondNumber = firstNumber + secondNumber;
        firstNumber = secondNumber - firstNumber;

        System.out.println(firstNumber + " " + secondNumber);
    }

    public void reverseString() {
        String a = "Today Is Monday Wakeup";
        char[] obj = a.toCharArray();
        for(int i=obj.length-1;i>=0;i=i-1){
            System.out.print(obj[i]);
        }

    }

    public static void main(String[] args) {
        SwapNumber2 obj = new SwapNumber2();
        //obj.swapWithoutThirdNumber();
        obj.reverseString();
    }
}
