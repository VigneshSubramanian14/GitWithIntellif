package PractiseTheseJavaProgram.reversenumber;

public class ReverseNumber3 {

    public void reverseNumber(){
        int givenNumber = 45678;
        int reverseNumber = 0;
        while (givenNumber!=0){
            reverseNumber=reverseNumber*10;
            reverseNumber=reverseNumber+givenNumber%10;
            givenNumber=givenNumber/10;
        }
        System.out.println(reverseNumber);
    }

    public static void main(String[] args) {
        ReverseNumber3 obj = new ReverseNumber3();
        obj.reverseNumber();
    }
}
