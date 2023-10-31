package week6;

public class ex100 {
    public static void main(String[] args) {
        NightSky nightSky1 = new NightSky(0.1, 40, 10);
        nightSky1.print();
        System.out.println("Number of stars: " + nightSky1.starsInLastPrint());
        System.out.println();

        NightSky nightSky2 = new NightSky(0.2, 15, 6);
        nightSky2.print();
        System.out.println("Number of stars: " + nightSky2.starsInLastPrint());
    }
}

