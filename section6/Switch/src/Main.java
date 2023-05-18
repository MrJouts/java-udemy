public class Main {
    public static void main(String[] args) {
        int value = 4;

        switch (value) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
            case 3: case 4: case 5:
                System.out.println("Was a 3, a 4 or a 5");
                System.out.println("Actually it was a " + value);
                break;
            default:
                System.out.println("Was not 1, 2, 3, 4, or 5");
        }
    }
}