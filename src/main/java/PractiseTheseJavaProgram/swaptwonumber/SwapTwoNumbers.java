package PractiseTheseJavaProgram.swaptwonumber;

public class SwapTwoNumbers {

    public void swappingWithThirdVariable() {
        int mySalary = 30000;
        int tlSalary = 50000;
        System.out.println("Before Swapping: " + "My Salary: " + mySalary + " " + "Tl Salary: " + tlSalary);
        int temp = mySalary;
        mySalary = tlSalary;
        tlSalary = temp;
        System.out.println("Before Swapping: " + "My Salary: " + mySalary + " " + "Tl Salary: " + tlSalary);
    }

    public void swappingwithoutUsingThirdVariable() {
        //memorize the below logic:
        //first = first-second
        //second = first+second
        //first = second-first
        int first = 20;
        int second = 50;
        System.out.println("Before Swapping: " + "First Value: " + first + " " + "SecondValue: " + second);
        first = first - second;
        second = first + second;
        first = second - first;
        System.out.println("Before Swapping: " + "First Value: " + first + " " + "SecondValue: " + second);

    }

    public static void main(String[] args) {
        SwapTwoNumbers obj = new SwapTwoNumbers();
        obj.swappingWithThirdVariable();
        System.out.println("***************************");
        obj.swappingwithoutUsingThirdVariable();
    }
}
