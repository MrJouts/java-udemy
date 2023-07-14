import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] unsortedArray = getIntegers(5);
        printArray(unsortedArray);
        printArray(sortIntegers(unsortedArray));
    }

    public static int[] getIntegers(int len) {
        Scanner scanner = new Scanner(System.in);
        int[] newArray = new int[len];
        for (int i = 0; i < len; i++) {
            newArray[i] = Integer.parseInt(scanner.next());
        }
        return newArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] reverseSortedArray = new int[array.length];
        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);
        for (int i = 0; i < sortedArray.length; i++) {
            reverseSortedArray[i] = sortedArray[sortedArray.length - 1 - i];
        }
        return reverseSortedArray;
    }
}