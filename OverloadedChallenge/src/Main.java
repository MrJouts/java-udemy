public class Main {
    public static void main(String[] args) {
        System.out.println("5ft, 8in = " + convertToCentimiters(5, 8) + "cm");
        System.out.println("68in = " + convertToCentimiters(68) + "cm");
    }

    public static double convertToCentimiters(int inches) {
        return inches * 2.54d;
    }

    public static double convertToCentimiters(int feet, int inches) {
        return convertToCentimiters(feet * 12 + inches);
    }
}