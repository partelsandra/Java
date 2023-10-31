package week5;

public class ex84 {
    public static void main(String[] args) {
        Counter counter1 = new Counter(10, true);
        System.out.println("Counter 1 Value: " + counter1.value());

        counter1.increase();
        System.out.println("Increased Counter 1 Value: " + counter1.value());

        counter1.decrease(5);
        System.out.println("Decreased Counter 1 Value: " + counter1.value());

        Counter counter2 = new Counter(5);

        System.out.println("\nCounter 2 Value: " + counter2.value());
        counter2.decrease(10);
        System.out.println("Decreased Counter 2 Value: " + counter2.value());
    }
}


