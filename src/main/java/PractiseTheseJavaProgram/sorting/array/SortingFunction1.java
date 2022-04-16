package PractiseTheseJavaProgram.sorting.array;

public class SortingFunction1 {

    public static void main(String[] args) {
        int[] a = {1, 2, 33, 4, 2, 11, 12, 32, 44, 23, 5, 66, 54, 76, 8, 77, 54, 33, 65, 37, 63};
        int temp;
        for (int i = 0; i < a.length; i = i + 1) {
            for (int j = i; j < a.length; j = j + 1) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int value:a){
            System.out.println(value);
        }
    }
}
