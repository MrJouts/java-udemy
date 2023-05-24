import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        long avg = 0;

        while (true) {
            String nextNumber = scanner.next();
            try {
                int number = Integer.parseInt(nextNumber);
                sum += number;
                count++;
                avg = Math.round((double) sum / count);
            } catch (NumberFormatException e) {
                break;
            }
        }
        System.out.println("SUM = " + sum + " AVG = " + avg);
    }
}