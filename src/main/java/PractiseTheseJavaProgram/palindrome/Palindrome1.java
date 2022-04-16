package PractiseTheseJavaProgram.palindrome;

public class Palindrome1 {

    public void palindromeConcept() {
        String str = "Radar", reverseStr = "";
//Radar
        int strLength = str.length();
        for (int i = (strLength - 1); i >= 0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }
        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str + " is a Palindrome String.");
        } else {
            System.out.println(str + " is not a Palindrome String.");
        }
    }

    public static void main(String[] args) {
        Palindrome1 obj = new Palindrome1();
        obj.palindromeConcept();
    }
}
