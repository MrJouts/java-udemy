public class Main {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) return false;
        int n = 1;
        int sum = 0;

        while (n < number) {
            if (number % n == 0) sum += n;
            n++;
        }
        return number == sum;
    }
}