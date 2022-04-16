package PractiseTheseJavaProgram.trianglePattern;

public class TrianglePattern1 {

    public void triangleMethod() {
        int givenNumber = 123456;
        int reverseNumber = 0;

        while (givenNumber != 0) {
            reverseNumber = reverseNumber * 10;
            reverseNumber = reverseNumber + givenNumber % 10;
            givenNumber = givenNumber / 10;
            System.out.println(reverseNumber);
        }

    }

    public static void main(String[] args) {
        TrianglePattern1 obj = new TrianglePattern1();
        obj.triangleMethod();
    }
}
