package PractiseTheseJavaProgram.invertedtringle;

public class InvertedTriangle2 {

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
        InvertedTriangle2 obj = new InvertedTriangle2();
        obj.invertedTriangle();
    }
}
