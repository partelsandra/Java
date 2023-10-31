package week7;

import java.util.ArrayList;

public class Suitcase {
    private int maxWeight;
    private ArrayList<Thing> things;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.things = new ArrayList<Thing>();
    }

    public void addThing(Thing thing) {
        int totalWeight = 0;
        for (Thing t : things) {
            totalWeight += t.getWeight();
        }

        if (totalWeight + thing.getWeight() <= maxWeight) {
            things.add(thing);
        }
    }

    public void printThings() {
        for (Thing thing : things) {
            System.out.println(thing);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Thing thing : things) {
            totalWeight += thing.getWeight();
        }
        return totalWeight;
    }

    public Thing heaviestThing() {
        if (things.isEmpty()) {
            return null;
        }

        Thing heaviest = things.get(0);
        for (Thing thing : things) {
            if (thing.getWeight() > heaviest.getWeight()) {
                heaviest = thing;
            }
        }

        return heaviest;
    }

    @Override
    public String toString() {
        int totalWeight = totalWeight();
        String suitcaseLabel = (things.size() == 1) ? "thing" : "things";
        return things.size() + " " + suitcaseLabel + " (" + totalWeight + " kg)";
    }
}

