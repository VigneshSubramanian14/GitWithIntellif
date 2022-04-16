package SampleCheck.Programcheck.com.constructor;

public class Dog extends Animal{

    Dog(){
        System.out.println("This is a dog");
    }

    public void sand(){
        System.out.println("This is a method");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.sand();
    }
}
