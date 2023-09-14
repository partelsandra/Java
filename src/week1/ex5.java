package week1;

public class ex5 {
    public static void main(String[] args) {
        int secondsInMinute = 60;
        int minutesInHour = 60;
        int hoursInDay = 24;
        int daysInYear = 365;

        int secondsInYear = secondsInMinute * minutesInHour * hoursInDay * daysInYear;

        System.out.println("There are " + secondsInYear + " seconds in a year.");
    }
}
