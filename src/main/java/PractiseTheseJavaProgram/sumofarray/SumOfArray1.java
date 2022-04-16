package PractiseTheseJavaProgram.sumofarray;

public class SumOfArray1 {

    public void sumMethod(){
        int [] a = {1,4,5,7,3,4,6};
        int sum=0;
        for (int j:a){
            sum=sum+j;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        SumOfArray1 obj = new SumOfArray1();
        obj.sumMethod();
    }
}
