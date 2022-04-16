package PractiseTheseJavaProgram.splitStringandInteger;

public class SplitStringAndInteger5 {

    public void splitString(String str) {
        StringBuffer alphabet = new StringBuffer(),
                number = new StringBuffer();
        for (int i = 0; i < str.length(); i = i + 1) {
            if (Character.isAlphabetic(str.charAt(i))) alphabet.append(str.charAt(i));
            else number.append(str.charAt(i));
        }
        System.out.println(alphabet +" "+number);
    }

    public static void main(String[] args) {
        SplitStringAndInteger5 obj = new SplitStringAndInteger5();
        obj.splitString("344TAR23ZAN");
    }
}
