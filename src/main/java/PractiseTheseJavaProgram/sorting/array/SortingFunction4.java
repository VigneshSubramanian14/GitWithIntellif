package PractiseTheseJavaProgram.sorting.array;

public class SortingFunction4 {

    public void sortingMethod() {
        int[] a = {1, 3, 2, 44, 54, 23, 12, 13, 14, 23, 25, 23, 55, 67, 54, 3, 8, 9, 10};
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
        for (int value : a) {
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        SortingFunction4 obj = new SortingFunction4();
        obj.sortingMethod();
    }
}
