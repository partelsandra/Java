package week2;

import java.util.Scanner;
public class ex25 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type the first number: ");
        int number1 = Integer.parseInt(reader.nextLine());

        System.out.println("Type the second number: ");
        int number2 = Integer.parseInt(reader.nextLine());

        System.out.println("Type the third number: ");
        int number3 = Integer.parseInt(reader.nextLine());

        int sum = number1 + number2 + number3;

        System.out.println("Sum: " + sum);


        reader.close();
    }
}

