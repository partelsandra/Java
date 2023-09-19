package week2;

import java.util.Scanner;

public class ex34 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number:");
        int n = Integer.parseInt(reader.nextLine());

        int factorial = 1;

        if (n < 0) {
            System.out.println("Factorial is undefined for negative numbers.");
        } else {
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println("Factorial is " + factorial);
        }

        reader.close();
    }
}
