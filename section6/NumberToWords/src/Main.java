public class Main {
    public static void main(String[] args) {
        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));

//        System.out.println(reverse(-121));
//        System.out.println(reverse(1212));
//        System.out.println(reverse(1234));
//        System.out.println(reverse(100));

//        numberToWords(123);
//        numberToWords(1010);
//        numberToWords(1000);
//        numberToWords(-12);
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int countDigits = getDigitCount(number);
        int reverseNumber = reverse(number);

        for (int i = 1; i <= countDigits; i++) {

            int lastDigit = reverseNumber % 10;

            switch (lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            reverseNumber = reverseNumber / 10;
        }
    }

    public static int reverse(int number) {
        boolean isNegative = false;
        if (number < 0) {
            number = -number;
            isNegative = true;
        }

        int reverseNumber = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            number = number / 10;
            reverseNumber = reverseNumber * 10;
            reverseNumber += lastDigit;
        }
        return isNegative ? -reverseNumber : reverseNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) return -1;
        if (number == 0) return 1;
        int countDigits = 0;
        while (number > 0) {
            number = number / 10;
            countDigits++;
        }
        return countDigits;
    }
}