package PractiseTheseJavaProgram.splitStringandInteger;

public class SplitStringAndInteger1 {

    public static void splitStringAndInteger(String str) {

        StringBuffer alphabet = new StringBuffer(),
                numeric = new StringBuffer();
        for(int i=0;i<str.length();i=i+1){
            if (Character.isDigit(str.charAt(i))) numeric.append(str.charAt(i));
            else alphabet.append(str.charAt(i));
        }
        System.out.println(alphabet);
        System.out.println(numeric);
    }

    public static void main(String[] args) {
        String str = "v123ign345esh";
        splitStringAndInteger(str);
    }
}
