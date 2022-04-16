package PractiseTheseJavaProgram.sumofarray;

public class SumOfArray2 {

    public void sumArray(){
        int[] a = {1,4,5,6,7,9};
        int sum=0;
        for(int obj:a){
            sum=sum+obj;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        SumOfArray2 obj = new SumOfArray2();
        obj.sumArray();
    }
}
