package HelloThere;

public class HelloThere {

    public static void main(String[] args) {

        HelloThere hello = new HelloThere();
        hello.printMethod(2);


    }

    public void printMethod(int x) {

        int newX = x * 2;

        System.out.println("Hello there!\nOh, and " + x + " times 2 is " + newX);

    }
}
