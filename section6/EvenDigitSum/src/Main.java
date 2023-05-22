public class Main {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) return -1;
        int sum = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            number = number / 10;
            if(lastDigit % 2 != 0) continue;
            sum += lastDigit;
        }
        return sum;
    }
}