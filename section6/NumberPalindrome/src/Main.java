public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println(isPalindrome(0));
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int originalNumber = number;
        if (number < 0) number = -number;

        while (number > 0) {
            int lastDigit = number % 10;
            number = number / 10;
            reverse = reverse * 10;
            reverse += lastDigit;
        }
        return originalNumber == reverse || -originalNumber == reverse;
    }
}