package week7;

import java.util.ArrayList;

public class Container {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Container(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<Suitcase>();
    }

    public void addSuitcase(Suitcase suitcase) {
        int totalWeight = 0;
        for (Suitcase s : suitcases) {
            totalWeight += s.totalWeight();
        }

        if (totalWeight + suitcase.totalWeight() <= maxWeight) {
            suitcases.add(suitcase);
        }
    }

    public void printThings() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printThings();
        }
    }

    @Override
    public String toString() {
        int totalWeight = 0;
        for (Suitcase suitcase : suitcases) {
            totalWeight += suitcase.totalWeight();
        }
        String suitcaseLabel = (suitcases.size() == 1) ? "suitcase" : "suitcases";
        return suitcases.size() + " " + suitcaseLabel + " (" + totalWeight + " kg)";
    }
}

