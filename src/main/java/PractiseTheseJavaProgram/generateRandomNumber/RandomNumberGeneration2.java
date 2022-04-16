package PractiseTheseJavaProgram.generateRandomNumber;

import java.util.Random;

public class RandomNumberGeneration2 {

    public void randomNumber() {
        Random random = new Random();
        int x = random.nextInt(1000);
        System.out.println("RandomNumber"+x);
    }

    public static void main(String[] args) {
        RandomNumberGeneration2 obj = new RandomNumberGeneration2();
        obj.randomNumber();
    }
}
