public class Main {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) return -1;

        int minimumValue = Math.min(first, second);
        int firstDivisor = 0;
        int secondDivisor = 0;
        int commonDivisor = 0;

        for (int i = 1; i <= minimumValue; i++) {
            if (first % i == 0) firstDivisor = i;
            if (second % i == 0) secondDivisor = i;
            if (firstDivisor == secondDivisor) commonDivisor = firstDivisor;
        }
        return commonDivisor;
    }
}