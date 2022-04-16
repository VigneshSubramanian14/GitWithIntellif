package PractiseTheseJavaProgram.secondLargestAndSecondSmallest;

import java.util.Scanner;

public class SecondLargestAndSecondSamllest2 {

    public void smallestAndLargest() {
        int n, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values");
        n = sc.nextInt();
        System.out.println("Enter the number:");
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (p[i] > p[j]) {
                    temp = p[i];
                    p[i] = p[j];
                    p[j] = temp;
                }
            }
        }
        System.out.println(p[n - 2]);
        System.out.println(p[0]);
    }

    public static void main(String[] args) {
        SecondLargestAndSecondSamllest2 obj = new SecondLargestAndSecondSamllest2();
        obj.smallestAndLargest();
    }
}
