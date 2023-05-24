import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);

        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        int loopCount = 0;

        while (true) {
            System.out.println("Enter a number, or any character to quit");
            String nextNumber = scanner.next();
            try {
                double number = Double.parseDouble(nextNumber);
                if (number < min) min = number;
                if (number > max) max = number;
                loopCount++;
            } catch (NumberFormatException e) {
                break;
            }
        }

        if (loopCount > 0) {
            System.out.println("Max: " + max);
            System.out.println("Min: " + min);
        } else {
            System.out.println("No valid data entered");
        }
    }
}