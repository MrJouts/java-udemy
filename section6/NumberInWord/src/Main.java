public class Main {
    public static void main(String[] args) {
        printNumberInWord(1);
        printNumberInWord(-1);
        printNumberInWord(4);
    }

    public static void printNumberInWord(int n) {
        String message;
        switch (n) {
            case 0:
                message = "ZERO";
                break;
            case 1:
                message = "ONE";
                break;
            case 2:
                message = "TWO";
                break;
            case 3:
                message = "THREE";
                break;
            case 4:
                message = "FOUR";
                break;
            case 5:
                message = "FIVE";
                break;
            case 6:
                message = "SIX";
                break;
            case 7:
                message = "SEVEN";
                break;
            case 8:
                message = "EIGHT";
                break;
            case 9:
                message = "NINE";
                break;
            default:
                message = "OTHER";
                break;
        }

        System.out.println(message);
    }
}