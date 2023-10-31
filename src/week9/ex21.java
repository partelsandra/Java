package week9;

public class ex21 {
    public static void main(String[] args) {
        try {
            Printer printer = new Printer("src/week9/textfile.txt");

            printer.printLinesWhichContain("Väinämöinen");
            System.out.println("-----");
            printer.printLinesWhichContain("Frank Zappa");
            System.out.println("-----");
            printer.printLinesWhichContain("");
            System.out.println("-----");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
