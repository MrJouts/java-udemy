public class Main {
    public static void main(String[] args) {
        System.out.println(getTranslation('A'));
        System.out.println(getTranslation('B'));
        System.out.println(getTranslation('S'));
    }

    public static String getTranslation(char letter) {
        return switch (letter) {
            case 'A' -> "A is able";
            case 'B' -> "B is baker";
            case 'C' -> "C is charlie";
            case 'D' -> "D is dog";
            case 'E' -> "E is easy";
            default -> {
                String message = "Letter " + letter + " was not found in the switch.";
                yield message;
            }
        };
    }
}