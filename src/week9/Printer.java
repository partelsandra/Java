package week9;

import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

public class Printer {
    private String fileName;

    public Printer(String fileName) throws Exception {
        this.fileName = fileName;
    }

    public void printLinesWhichContain(String word) {
        try (Scanner reader = new Scanner(new File(fileName))) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                if (word.isEmpty() || line.contains(word)) {
                    System.out.println(line);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
