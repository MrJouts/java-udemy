public class Main {
    public static void main(String[] args) {
        int value = 4;

        switch (value) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Was a 3, a 4 or a 5");
                System.out.println("Actually it was a " + value);
            }
            default -> System.out.println("Was not 1, 2, 3, 4, or 5");
        }
    }
}