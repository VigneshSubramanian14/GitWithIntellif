package PractiseTheseJavaProgram.smallestnumberinArray;

import java.util.Arrays;

public class SortSmallestNumberInAArray2 {

    public void sortSmallestNumber() {
        int[] a = {5, 2, 3, 6, 4, 7, 8, 6, 9, 2};
        Arrays.sort(a);
        for (int i = 0; i < a.length; i = i + 1) {
            System.out.println(a[i]);
            break;
        }
    }

    public void secondLargestNumber() {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        for (int i=a.length-2;i>=0;i=i-1){
            System.out.println(a[i]);
            break;
        }
    }


    public static void main(String[] args) {
        SortSmallestNumberInAArray2 obj = new SortSmallestNumberInAArray2();
        obj.sortSmallestNumber();
        System.out.println("******************");
        obj.secondLargestNumber();
    }
}
