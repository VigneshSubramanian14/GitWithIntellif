package PractiseTheseJavaProgram.splitStringandInteger;

public class SplitStringAndInteger4 {

    public static void splitStringAndInteger(String str) {
        StringBuffer value = new StringBuffer(),
                number = new StringBuffer();
        for (int i = 0; i < str.length(); i = i + 1) {
            if (Character.isAlphabetic(str.charAt(i)))
                value.append(str.charAt(i));
            else number.append(str.charAt(i));
        }
        System.out.println(value);
        System.out.println(number);
    }

    public static void main(String[] args) {
        String str = "HAV1239E456Taken";
        splitStringAndInteger(str);
    }
}
