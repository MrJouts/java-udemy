public class Main {
    public static void main(String[] args) {
        checkNumber(10);
        checkNumber(0);
        checkNumber(-1);
        checkNumber(Integer.MAX_VALUE);
        checkNumber(Integer.MAX_VALUE);
        checkNumber(100 * -100);
    }

    public static void checkNumber(int number) {
        String message = "zero";
        if (number > 0) message = "positive";
        if (number < 0) message = "negative";
        System.out.println(message);
    }
}