package week4;

import java.util.Random;

public class ex81 {

    public static void main(String[] args) {
        PasswordRandomizer randomizer = new PasswordRandomizer(13);
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
    }
}

class PasswordRandomizer {
    private int length;
    private Random random;

    public PasswordRandomizer(int length) {
        this.length = length;
        this.random = new Random();
    }

    public String createPassword() {
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < this.length; i++) {
            int randomNumber = random.nextInt(26);
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(randomNumber);
            password.append(symbol);
        }

        return password.toString();
    }
}
