package week2;

import java.util.Scanner;

public class ex26 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int sum = 0;
         while(true) {
             System.out.println("Enter a number: ");
             int number = Integer.parseInt(reader.nextLine());

             if (number == 0) {
                 break;
             }

             sum += number;
             System.out.println("Sum now: " + sum);

         }

        System.out.println("Sum in the end: " + sum);


        reader.close();
    }
}
