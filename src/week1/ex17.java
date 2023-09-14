package week1;

import java.util.Scanner;
public class ex17 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        //program code
        System.out.println("Type the first number: ");

        int number1 = Integer.parseInt(reader.nextLine());

        System.out.println("Type the second number: ");

        int number2 = Integer.parseInt(reader.nextLine());

        if (number1 > number2) {
            System.out.println("Greater number: " + number1);

        } else if (number2 > number1) {
            System.out.println("Greater number:" + number2);

        } else {
            System.out.println("The numbers are equal!");
        }

        reader.close();
    }
}