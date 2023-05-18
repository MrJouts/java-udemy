public class Challenge {
    public static void main(String[] args) {

        double score1 = 20.00d;
        double score2 = 80.00d;

        double result = (score1 + score2) * 100;
        System.out.println("result: " + result);

        double remainder = result % 40;
        System.out.println("remainder: " + remainder);

        boolean isZero = remainder == 0 ? true : false;
        System.out.println("Is Zero: " + isZero);

        if (!isZero) {
            System.out.println("got some remainder");
        }
    }
}
