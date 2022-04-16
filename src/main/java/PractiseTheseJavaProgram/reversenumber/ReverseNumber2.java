package PractiseTheseJavaProgram.reversenumber;

public class ReverseNumber2 {
    public void reverseNumber() {

        int givenNumber = 4589;
        int reverseNumber = 0;
        while (givenNumber != 0) {
            reverseNumber = reverseNumber * 10;
            reverseNumber = reverseNumber + givenNumber % 10;
            givenNumber = givenNumber / 10;
        }
        System.out.println(reverseNumber);
    }

    public static void main(String[] args) {
        ReverseNumber2 obj = new ReverseNumber2();
        obj.reverseNumber();
    }
}
