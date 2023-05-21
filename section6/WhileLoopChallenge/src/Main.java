public class Main {
    public static void main(String[] args) {
        int number = 4;
        while(number <= 20) {
            number++;
            if(!isEvenNumber(number)) continue;
            System.out.println(number);
        }
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}