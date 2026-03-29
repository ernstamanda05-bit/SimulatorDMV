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

            System.out.println("Now serving number: " + current);

            if (current == userNumber) {
                break;
            }

            current++;
        }

        int chance = rand.nextInt(100);

        if (chance == 0) {
            System.out.println("Wait... it's a miracle! You actually have all the required paperwork. You're all set!");
        } else {
        System.out.println("Sorry you nasty piece of human garbage, you don't have the required paperwork MWAHAHAHAHAHAHAHA.");
    }
}
}