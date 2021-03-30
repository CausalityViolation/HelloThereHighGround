package HelloThere;

import java.util.Random;

public class HelloThere {

    public static void main(String[] args) {

        Random rand = new Random();
        HelloThere hello = new HelloThere();

        var randomNumber = rand.nextInt(10 - 1) - 1;

        hello.printMethod(randomNumber);


    }

    public boolean printMethod(int x) {

        int newX = x * 2;
        int highGround = 9;

        if (newX >= 10) {
            System.out.println("Oh, " + newX + " is higher than " + highGround + "?!\nLooks like you have THE HIGH GROUND!\n");
            return true;
        } else {
            System.out.println("Oh, quick math time! " + x + " times 2 is " + newX + "!");
            return false;
        }
    }
}
