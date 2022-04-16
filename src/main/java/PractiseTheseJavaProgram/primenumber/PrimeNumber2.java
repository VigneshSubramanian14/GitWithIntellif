package PractiseTheseJavaProgram.primenumber;

import java.util.Scanner;

public class PrimeNumber2 {

    public void primeNumberFunction() {
        int temp;
        boolean isPrime = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int num = sc.nextInt();
        sc.close();
        for (int i = 2; i < num / 2; i++) {
            temp = num % i;
            if (temp == 0) {
                isPrime = false;
            }
        }
        if (isPrime)
            System.out.println(num+" "+"The number is prime");
        else
            System.out.println(num+" "+"The number is not prime");
    }

    public static void main(String[] args) {
        PrimeNumber2 obj = new PrimeNumber2();
        obj.primeNumberFunction();
    }
}
