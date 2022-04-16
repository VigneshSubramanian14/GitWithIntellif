package PractiseTheseJavaProgram.importantprogram;

public class AddNumeberTillEnd {

    public void addNumber() {
        int num = 1297;
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
        AddNumeberTillEnd obj = new AddNumeberTillEnd();
        obj.addNumber();
    }
}
