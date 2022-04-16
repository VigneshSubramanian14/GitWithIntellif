package PractiseTheseJavaProgram.smallestnumberinArray;

import java.util.Arrays;

public class SortSmallestNumberInArray1 {

    public static void main(String[] args) {
        int[] i = {5,3,4,5,6,3,2,3,4,2};
       Arrays.sort(i);
        System.out.println(i[0]);
        }
    }