package PractiseTheseJavaProgram.LengthOfString;

public class LenghtOfString1 {

    public void stringLength(String a) {
        char[] ch = a.toCharArray();
        int count = 0;
        for (char value : ch) {
            count++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        LenghtOfString1 obj = new LenghtOfString1();
        obj.stringLength("sdjkhfgdsjkhfgmbcnxzvbmnxzvcsbmnvc");
    }
}
