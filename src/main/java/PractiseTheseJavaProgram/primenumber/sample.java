package PractiseTheseJavaProgram.primenumber;

import java.util.Scanner;

public class sample {

    public void reverseLoop() {
        int temp;
        boolean isPrime = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values");
        int num = sc.nextInt();
        sc.close();
        for (int i = 2; i < num / 2; i++) {
            temp = num % i;
            if (temp == 0) {
                isPrime=false;
            }
        }
        if (isPrime)
            System.out.println(num+" "+"It is a prime number");
        else
            System.out.println(num+" "+"It is not a prime number");
    }

    public static void main(String[] args) {
        sample obj = new sample();
        obj.reverseLoop();
    }
}
