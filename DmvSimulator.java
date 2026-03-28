import java.util.Random;

public class DmvSimulator {
    public static void main(String[] args) {
        Random rand = new Random();

        System.out.println("Welcome to the DMV!");

        int userNumber = rand.nextInt(100) + 1;
        System.out.println("Your number is: " + userNumber);
        System.out.println("Please wait until your number is called...\n");

        int current = userNumber + 1;

        while (true) {
            if (current > 200) {
                current = 1;
            }

            if (current == userNumber) {
                System.out.println("Now serving number: " + current);
                break;
            }

            System.out.println("Now serving number: " + current);
            current++;
        }

        System.out.println("Sorry you nasty piece of human garbage, you don't have the required paperwork.");
    }
}