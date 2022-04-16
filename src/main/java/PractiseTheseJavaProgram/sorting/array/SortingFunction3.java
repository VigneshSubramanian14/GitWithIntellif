package PractiseTheseJavaProgram.sorting.array;

public class SortingFunction3 {

    public void sortingMethod(){
        int[] a = {12,2,33,1,12,4,55,56,78,87,54,3,4,8,990,54,23,59,41};
        int temp;
        for (int i=0;i<a.length;i=i+1){
            for (int j=i;j<a.length;j=j+1){
                if (a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int value:a){
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        SortingFunction3 obj = new SortingFunction3();
        obj.sortingMethod();
    }
}
