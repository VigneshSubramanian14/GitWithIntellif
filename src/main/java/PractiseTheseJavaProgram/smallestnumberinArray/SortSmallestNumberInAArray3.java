package PractiseTheseJavaProgram.smallestnumberinArray;

import java.util.Arrays;

public class SortSmallestNumberInAArray3 {

    public void smallestNumber(int[] value) {
        Arrays.sort(value);
        for (int i = 0; i < value.length; i = i + 1) {
            System.out.println(value[i]);
            break;
        }
    }

    public static void main(String[] args) {
        SortSmallestNumberInAArray3 obj = new SortSmallestNumberInAArray3();
        int[] value = {4, 5, 6, 7, 2, 5, 6, 8, 10};
        obj.smallestNumber(value);
    }
}
