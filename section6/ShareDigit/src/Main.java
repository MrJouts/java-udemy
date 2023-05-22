public class Main {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int x, int y) {
        if (x < 10 || x > 99 || y < 10 || y > 99) return false;

        int xFirstDigit = x / 10;
        int xLastDigit = x % 10;
        int yFirstDigit = y / 10;
        int yLastDigit = y % 10;

        return xFirstDigit == yFirstDigit || xFirstDigit == yLastDigit || xLastDigit == yFirstDigit || xLastDigit == yLastDigit;
    }
}