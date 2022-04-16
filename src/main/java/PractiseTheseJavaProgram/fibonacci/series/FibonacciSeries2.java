package PractiseTheseJavaProgram.fibonacci.series;

public class FibonacciSeries2 {

    public void fiboSeries() {
        int n = 100, firstNumber = 0, secondNumber = 1;
        System.out.println("The number is: " + n);
        while (firstNumber <= n) {
            System.out.println(firstNumber);
            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }

    public static void main(String[] args) {
        FibonacciSeries2 obj = new FibonacciSeries2();
        obj.fiboSeries();
    }

}
