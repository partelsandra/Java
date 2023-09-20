package week3;

import java.util.Scanner;

public class ex53 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Type a word:  ");
        String word = scanner.nextLine();

        System.out.println("Length of the first part: ");
        int length = Integer.parseInt(scanner.nextLine());

        if(length >= 0 && length <= word.length()) {
            String result = word.substring(0, length);
            System.out.println("Result: " + result);
        } else {
            System.out.println("Invalid length input.");
        }


        scanner.close();
    }
}
