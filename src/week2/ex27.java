package week2;

import java.util.Scanner;
public class ex27 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int number = 1;

        while (number < 101) {
            System.out.println(number);
            number++;  // number++ means the same as number = number + 1
        }

        reader.close();
    }
}
