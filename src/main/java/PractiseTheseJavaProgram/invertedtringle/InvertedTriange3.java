package PractiseTheseJavaProgram.invertedtringle;

public class InvertedTriange3 {

    public void invertedTriangle() {
        int rows = 5;
        for (int i = rows; i >= 0; --i) {
            for (int j = 0; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        InvertedTriange3 obj = new InvertedTriange3();
        obj.invertedTriangle();
    }
}
