public class Main {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int day = (int) (minutes / 60 / 24);
        int remainderDays = day % 365;
        int years = day / 365;

        System.out.println(minutes + " min = " + years + " y and " + remainderDays + " d");
    }
}