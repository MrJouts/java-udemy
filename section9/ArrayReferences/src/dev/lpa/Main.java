package dev.lpa;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;
        modifyArray(anotherArray);

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0]= 1;

        System.out.println("afrter change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("afrter change anotherArray = " + Arrays.toString(anotherArray));
    }

    private  static void modifyArray( int[] array) {
        array[1] = 2;
    }
}