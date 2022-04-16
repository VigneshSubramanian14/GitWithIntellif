package PractiseTheseJavaProgram.generateRandomNumber;

import java.util.Random;

public class RandomNumberGeneration1 {

    public void randomNumber(){
        Random random = new Random();
        int x = random.nextInt(1000);
        System.out.println("RandomNumber"+x);
    }

    public static void main(String[] args) {
        RandomNumberGeneration1 obj = new RandomNumberGeneration1();
        obj.randomNumber();
    }
}
