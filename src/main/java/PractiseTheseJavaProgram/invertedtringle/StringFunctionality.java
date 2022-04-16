package PractiseTheseJavaProgram.invertedtringle;

public class StringFunctionality {

    public void splitFunction() {
        String a = "TodayIsMonday";
        String a1 = a.substring(0, 5);
        String b1 = a.substring(5, 7);
        String c1 = a.substring(7, 13);
        String d1 = a1 + " " + b1 + " " + c1;
        for(int i=0;i<d1.length();i++){
            System.out.println(d1);
            break;
        }
    }

    public static void main(String[] args) {
        StringFunctionality obj = new StringFunctionality();
        obj.splitFunction();

    }
}
