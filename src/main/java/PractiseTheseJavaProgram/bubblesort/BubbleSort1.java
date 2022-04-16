package PractiseTheseJavaProgram.bubblesort;

public class BubbleSort1 {

    public static void sortmethod(int arr[]) {
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
        int arr[] = {2, 33, 4, 55, 23, 45, 6, 78, 43};
        sortmethod(arr);
        for (int i = 0; i < arr.length; i = i + 1) {
            System.out.println(arr[i] + "");
        }
    }
}
