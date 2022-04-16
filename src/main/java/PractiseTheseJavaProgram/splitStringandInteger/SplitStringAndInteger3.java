package PractiseTheseJavaProgram.splitStringandInteger;

public class SplitStringAndInteger3 {

    public void splitString(String str) {

        StringBuffer alphabet = new StringBuffer(),
                numeric = new StringBuffer();

        for (int i = 0; i < str.length(); i = i + 1) {
            if (Character.isAlphabetic(str.charAt(i))) alphabet.append(str.charAt(i));
            else numeric.append(str.charAt(i));
        }
        System.out.println(alphabet);
        System.out.println(numeric);
    }

    public static void main(String[] args) {
        SplitStringAndInteger3 obj = new SplitStringAndInteger3();
        String str = "vig567n234es7859h";
        obj.splitString(str);
    }
}
