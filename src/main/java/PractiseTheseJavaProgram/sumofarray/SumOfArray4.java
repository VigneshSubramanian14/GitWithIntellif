package PractiseTheseJavaProgram.sumofarray;

public class SumOfArray4 {
    public void sumOfArray() {
        int[] a = {1, 3, 4, 5, 2, 5};
        int sum=0;
        for (int obj:a){
            sum=sum+obj;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        SumOfArray4 obj = new SumOfArray4();
        obj.sumOfArray();
    }
}
