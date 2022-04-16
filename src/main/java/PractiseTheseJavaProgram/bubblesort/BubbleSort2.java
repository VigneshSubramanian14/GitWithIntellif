package PractiseTheseJavaProgram.bubblesort;

public class BubbleSort2 {

    public void bubbleSorting(int arr[]) {

        int n = arr.length;
        for (int i = 0; i < n; i = i + 1) {
            for (int j = 1; j < (n - i); j = j + 1) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        BubbleSort2 obj = new BubbleSort2();
        int arr[] = {2, 33, 4, 55, 23, 45, 6, 78, 43};
        obj.bubbleSorting(arr);
        for (int i = 0; i < arr.length; i = i + 1) {
            System.out.println(arr[i]);
        }
    }
}
