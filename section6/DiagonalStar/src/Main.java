public class Main {
    public static void main(String[] args) {
        printSquareStar(5);
        System.out.println("-------------------");
        printSquareStar(8);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        for (int i = 1; i <= number; i++) {
            String row = "";

            for (int j = 1; j <= number; j++) {
                if (i == 1 || i == number) {
                    row += "*";
                } else if (j == 1 || j == number) {
                    row += "*";
                } else if (i == j) {
                    row += "*";
                } else if (j == number - i + 1) {
                    row += "*";
                } else {
                    row += " ";
                }
            }

            System.out.println(row);
        }
    }
}