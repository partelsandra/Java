package week1;

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // program code
        System.out.println("Type a number: ");

        int number = Integer.parseInt(reader.nextLine());

        if (number > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is not positive.");
        }

        reader.close();
    }
}
