package PractiseTheseJavaProgram.splitStringandInteger;

public class SplitStringAndInteger2 {

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
        SplitStringAndInteger2 obj = new SplitStringAndInteger2();
        String str = "V235IGN67889ESH";
        obj.splitString(str);
    }
}
