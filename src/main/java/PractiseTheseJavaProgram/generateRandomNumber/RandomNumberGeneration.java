package PractiseTheseJavaProgram.generateRandomNumber;

import java.util.Random;

public class RandomNumberGeneration {

    public void randomNumber() {
        Random random = new Random();
        int x = random.nextInt(10000);
        System.out.println("Automation"+x);
    }

    public static void main(String[] args) {
        RandomNumberGeneration obj = new RandomNumberGeneration();
        obj.randomNumber();
    }
}
