package PractiseTheseJavaProgram.trianglePattern;

public class TiranglePattern2 {

    public void trianglePattern(){
        int givenNumber = 7654321;
        int reverseNumber = 0;
        while(givenNumber!=0) {
            reverseNumber = reverseNumber * 10;
            reverseNumber = reverseNumber + givenNumber % 10;
            givenNumber = givenNumber / 10;
            System.out.println(reverseNumber);
        }
    }

    public static void main(String[] args) {
        TiranglePattern2 obj = new TiranglePattern2();
        obj.trianglePattern();
    }
}
