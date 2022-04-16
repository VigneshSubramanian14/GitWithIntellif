package PractiseTheseJavaProgram.sumofarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SumOfArray3 {

    public void sumOfArray() {
        int[] a = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int obj : a) {
            sum = sum + obj;
        }
        System.out.println(sum);
    }


    public static void main(String[] args) {
        SumOfArray3 obj = new SumOfArray3();
        obj.sumOfArray();
    }
}
