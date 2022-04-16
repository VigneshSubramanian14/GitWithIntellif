package PractiseTheseJavaProgram.LengthOfString;

public class LengthOfString2 {
    public void lengthOfString(String a) {
        char[] ch = a.toCharArray();
        int count = 0;
        for (char obj:ch){
            count++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        LengthOfString2 obj = new LengthOfString2();
        obj.lengthOfString("TodayIsMonday");
    }
}
