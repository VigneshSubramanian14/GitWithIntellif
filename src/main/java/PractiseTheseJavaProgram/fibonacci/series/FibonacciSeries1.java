package PractiseTheseJavaProgram.fibonacci.series;

public class FibonacciSeries1 {

    public void fibonacciSeries(){
         int n=100,firstNumber=0,secondNumber=1;
        System.out.println("The fibonacci series is: "+n);
        while (firstNumber<=n){
            System.out.println(firstNumber);
            int nextNumber = firstNumber+secondNumber;
            firstNumber=secondNumber;
            secondNumber=nextNumber;
        }
    }

    public static void main(String[] args) {
        FibonacciSeries1 obj = new FibonacciSeries1();
        obj.fibonacciSeries();
    }
}
