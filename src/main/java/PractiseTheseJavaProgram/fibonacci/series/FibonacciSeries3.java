package PractiseTheseJavaProgram.fibonacci.series;

public class FibonacciSeries3 {

    public void fibonacciSeries() {
        int n = 100, firstNumber = 0, secondNumber = 1;
        System.out.println("The value for the numbers: " + n);
        while (firstNumber <= n) {
            System.out.println(firstNumber);
            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }

    public static void main(String[] args) {
        FibonacciSeries3 obj = new FibonacciSeries3();
        obj.fibonacciSeries();
    }
}
