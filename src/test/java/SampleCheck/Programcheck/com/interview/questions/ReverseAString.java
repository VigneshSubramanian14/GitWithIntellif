package SampleCheck.Programcheck.com.interview.questions;

public class ReverseAString {

    public static void main(String[] args) {
        String value = "Yellow";
        //2types : String Buffer and String Builder:
        //String Buffer
        StringBuffer buffer = new StringBuffer();
        buffer.append(value);
        StringBuffer newValue = buffer.reverse();
        System.out.println(newValue);

        System.out.println("******************************");

        //StringBuilder:
        String name = "Vignesh";
        StringBuilder build = new StringBuilder();
        build.append(name);
        StringBuilder newName = build.reverse();
        System.out.println(newName);

        System.out.println("******************************");
    }
}
