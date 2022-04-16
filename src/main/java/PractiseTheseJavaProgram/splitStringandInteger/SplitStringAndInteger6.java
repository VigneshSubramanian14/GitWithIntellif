package PractiseTheseJavaProgram.splitStringandInteger;

public class SplitStringAndInteger6 {

    public void splitStringAndInteger(String str) {
        //String Buffer or String Builder anything you can use
        StringBuilder alphabet = new StringBuilder(),
                number = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i))) alphabet.append(str.charAt(i));
            else number.append(str.charAt(i));
        }
        System.out.println(alphabet);
        System.out.println(number);
    }

    public static void main(String[] args) {
        SplitStringAndInteger6 obj = new SplitStringAndInteger6();
        obj.splitStringAndInteger("T34RZAN23");
    }
}
