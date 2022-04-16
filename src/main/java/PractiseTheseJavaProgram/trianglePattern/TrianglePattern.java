package PractiseTheseJavaProgram.trianglePattern;

public class TrianglePattern {

    public void reverseNumberMethod() {
        int givenNumber = 123456678;
        int reverseNumber = 0;

        while (givenNumber != 0) {
            reverseNumber = reverseNumber * 10;
            reverseNumber = reverseNumber + givenNumber % 10;
            givenNumber = givenNumber / 10;
            System.out.println(reverseNumber);
        }
    }

    public static void main(String[] args) {
        TrianglePattern obj = new TrianglePattern();
        obj.reverseNumberMethod();
    }
}
