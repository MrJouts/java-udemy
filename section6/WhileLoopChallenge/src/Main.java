public class Main {
    public static void main(String[] args) {
        int number = 4;
        int eventCount = 0;
        int oddCount = 0;

        while(number <= 20) {
            number++;
            if(!isEvenNumber(number)) {
                oddCount++;
                continue;
            }
            System.out.println(number);
            eventCount++;
            if(eventCount >= 5) break;
        }

        System.out.println("Total even numbers found: " + eventCount);
        System.out.println("Total odd numbers found: " + oddCount);
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}