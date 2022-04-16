package PractiseTheseJavaProgram.smallestnumberinArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortSmallestNumberInAArray {
    public static void main(String[] args) {
        int[] a = {1,4,5,2,1,0,5,33,4,6,3};
        Arrays.sort(a);
        System.out.println(a[0]);
        System.out.println("*******************");

        Integer[] b = {1,4,5,2,1,0,5,33,4,6,3};
        ArrayList value = new ArrayList(Arrays.asList(b));
        Collections.sort(value);
        System.out.println(value.get(0));
    }
}
