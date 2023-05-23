public class Main {
    public static void main(String[] args) {

//        System.out.println(canPack(1, 0, 4));
//        System.out.println(canPack(1, 0, 5));
//        System.out.println(canPack(0, 5, 4));
//        System.out.println(canPack(2, 2, 11));
//        System.out.println(canPack(-3, 2, 12));
//        System.out.println(canPack(5, 0, 5));
//        System.out.println(canPack(0, 5, 5));
//        System.out.println(canPack(4, 18, 19));
//        System.out.println(canPack(1, 18, 19));
        System.out.println(canPack(3, 2, -12));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) return false;
//
//        // Solution #1
//        while (bigCount > 0 && goal >= 5) { // #2 subtract 5 from goal for each bigCount
//            goal -= 5;
//            bigCount--;
//        }
//        return smallCount >= goal; // #3 make sure enough smallCount to fill remaining goal
//
//        // Solution #2
//        int bigCountToUse = bigCount < goal/5 ? bigCount : goal/5 ; // #2 determine how many bigCount to use
//        return (goal - bigCountToUse*5) <= smallCount; // #3 evaluate if enough smallCount to fill the rest of the order

        // Solution #3
        if ((bigCount * 5 + smallCount) < goal) return false;
        return (goal % 5 <= smallCount);
    }
}