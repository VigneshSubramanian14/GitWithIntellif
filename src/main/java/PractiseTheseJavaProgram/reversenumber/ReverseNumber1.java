package PractiseTheseJavaProgram.reversenumber;

public class ReverseNumber1 {

    public void reverseNumber() {

        int givenNumber = 5647;
        int reverseNumber = 0;
        while (givenNumber != 0) {
            reverseNumber = reverseNumber * 10;
            reverseNumber = reverseNumber + givenNumber % 10;
            givenNumber = givenNumber / 10;
        }
        System.out.println(reverseNumber);
    }

    public static void main(String[] args) {
        ReverseNumber1 obj =new ReverseNumber1();
        obj.reverseNumber();
    }
}
