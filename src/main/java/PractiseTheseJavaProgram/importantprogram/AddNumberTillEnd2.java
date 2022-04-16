package PractiseTheseJavaProgram.importantprogram;

public class AddNumberTillEnd2 {


    public void addNumber() {
        int num = 2345;
        while (num / 10 != 0) {
            int sum = 0;
            while (num % 10 != 0) {
                sum = num % 10;
                num = num / 10;
            }
            sum = sum + num;
            num = sum;
        }
        System.out.println(num);
    }

    public static void main(String[] args) {
        AddNumberTillEnd2 obj = new AddNumberTillEnd2();
        obj.addNumber();
    }
}
