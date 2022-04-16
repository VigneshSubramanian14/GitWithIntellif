package PractiseTheseJavaProgram.sumofarray;

public class SumOfArray5 {

    public void sumOfArray(){
        int[] a = {1,2,3,5,6,9};
        int sum=0;
        for(int obj:a){
            sum=sum+obj;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        SumOfArray5 obj = new SumOfArray5();
        obj.sumOfArray();
    }
}
