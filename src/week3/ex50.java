package week3;

import java.util.Scanner;

public class ex50 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type your name: ");
        String name = scanner.nextLine();

        if (name.length() >= 3) {
            System.out.println("1. character " + name.charAt(0));
            System.out.println("2. character " + name.charAt(1));
            System.out.println("3. character " + name.charAt(2));
        } else {
            System.out.println("Name should have at least 3 characters.");
        }
        scanner.close();
    }
}
