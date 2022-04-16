package SampleCheck.Programcheck;

public class FunctionInStatic {

    String name = "Vignesh";
    static String name1 = "Bala";

    public void method1() {
        System.out.println("This is a normal method");
    }

    public static void method2() {
        System.out.println("This is a static method");
    }

    public static void main(String[] args) {
        FunctionInStatic obj = new FunctionInStatic();
        System.out.println(obj.name);
        System.out.println(name1);

        //Three ways to call a static method
        FunctionInStatic.method2();
        obj.method2();
        method2();
    }
}
