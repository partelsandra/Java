package week8;

public class ex10 {
    public static void main(String[] args) {
        NationalService civilService = new CivilService();
        NationalService militaryService = new MilitaryService(180);

        System.out.println("Civil Service days left: " + civilService.getDaysLeft());
        System.out.println("Military Service days left: " + militaryService.getDaysLeft());

        while (civilService.getDaysLeft() > 0) {
            civilService.work();
        }

        while (militaryService.getDaysLeft() > 0) {
            militaryService.work();
        }

        System.out.println("Civil Service days left: " + civilService.getDaysLeft());
        System.out.println("Military Service days left: " + militaryService.getDaysLeft());
    }
}
