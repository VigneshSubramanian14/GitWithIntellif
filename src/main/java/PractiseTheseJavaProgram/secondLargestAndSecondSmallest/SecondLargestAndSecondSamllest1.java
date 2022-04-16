package PractiseTheseJavaProgram.secondLargestAndSecondSmallest;

import java.util.Scanner;

public class SecondLargestAndSecondSamllest1 {

    public void program() {
        int n, temp;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the values 'Maximum of 3': ");
        n = s.nextInt();
        System.out.println("Enter the values: ");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("The second largest element is: " + a[n - 2]);
        System.out.println("The smallest element is: " + a[0]);
    }

    public static void main(String[] args) {
        SecondLargestAndSecondSamllest1 obj = new SecondLargestAndSecondSamllest1();
        obj.program();
    }
}
