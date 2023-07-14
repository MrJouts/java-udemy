package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int elements = readInteger();
        System.out.println("_".repeat(30));

        int[] array = readElements(elements);
        System.out.println("Array created:");
        System.out.println(Arrays.toString(array));
        System.out.println("_".repeat(30));

        int min = findMin(array);
        System.out.println("Minimum value: " + min);
    }

    private static int readInteger() {
        System.out.println("How many elements do you want to enter?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int[] readElements(int len) {
        System.out.println("Please enter the elements of the array:");
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int element : array) {
            if (element < min) min = element;
        }
        return min;
    }
}