package PractiseTheseJavaProgram.sorting.array;

public class SortingFunction2 {

    public void sortingMethod(){
        int a[] = {2,34,21,12,3,44,56,67,65,7,88,67,90,89,97};
        int temp;
        for(int i=0;i<a.length;i=i+1) {
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

    public static void main(String[] args) {
        SortingFunction2 obj = new SortingFunction2();
        obj.sortingMethod();
    }
}
