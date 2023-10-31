package week7;

public class ex4 {
    public static void main(String[] args) {
        Thing book = new Thing("Happiness in Three Steps", 2);
        Thing mobile = new Thing("Nokia 3210", 1);
        Thing brick = new Thing("Brick", 4);

        Suitcase suitcase = new Suitcase(10);
        System.out.println(suitcase);

        suitcase.addThing(book);
        System.out.println(suitcase);

        suitcase.addThing(mobile);
        System.out.println(suitcase);

        suitcase.addThing(brick);
        System.out.println(suitcase);

        System.out.println();

        System.out.println("There are the following things in the suitcase:");
        suitcase.printThings();
        System.out.println("Total weight: " + suitcase.totalWeight() + " kg");

        System.out.println();

        Thing heaviest = suitcase.heaviestThing();
        if (heaviest != null) {
            System.out.println("The heaviest thing: " + heaviest.getName() + " (" + heaviest.getWeight() + " kg)");
        } else {
            System.out.println("No things in the suitcase.");
        }

        System.out.println();

        Suitcase tomsCase = new Suitcase(10);
        tomsCase.addThing(book);
        tomsCase.addThing(mobile);

        Suitcase georgesCase = new Suitcase(10);
        georgesCase.addThing(brick);

        Container container = new Container(1000);
        container.addSuitcase(tomsCase);
        container.addSuitcase(georgesCase);

        System.out.println(container);

        System.out.println("There are the following things in the container suitcases:");
        container.printThings();

        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }

    public static void addSuitcasesFullOfBricks(Container container) {
        int weight = 1;
        for (int i = 0; i < 100; i++) {
            Thing brick = new Thing("Brick", weight);
            Suitcase suitcase = new Suitcase(1000);
            suitcase.addThing(brick);
            container.addSuitcase(suitcase);
            weight++;
        }
    }
}



