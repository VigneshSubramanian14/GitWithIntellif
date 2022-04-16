package PractiseTheseJavaProgram.sumofarray;

public class SumOfArray {
    public static void main(String[] args) {
        //Initialize array
        int [] arr =  {1, 2, 3, 4, 5};
        int sum = 0;
        //Loop through the array to calculate sum of elements
        for (int j : arr) {
            sum = sum + j;
        }
        System.out.println("Sum of all the elements of an array: " + sum);
    }
}

