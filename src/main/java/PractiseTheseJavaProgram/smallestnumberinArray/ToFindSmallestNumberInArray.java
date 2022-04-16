package PractiseTheseJavaProgram.smallestnumberinArray;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ToFindSmallestNumberInArray {

    public void usingArrayList() {
        int[] a = {1, 2, 3, 0, 12, 23, 1, 1, 1, 0};
        Arrays.sort(a);
        System.out.println(a[0]);
    }

    public void usingCollections() {
        Integer[] a = {1, 2, 3, 0, 12, 23, 1, 1, -1, 0};
        List<Integer> value = Arrays.asList(a);
        Collections.sort(value);
        System.out.println(value.get(0));
    }

    public static void main(String[] args) {
        ToFindSmallestNumberInArray obj = new ToFindSmallestNumberInArray();
        obj.usingArrayList();
        obj.usingCollections();
    }
}
