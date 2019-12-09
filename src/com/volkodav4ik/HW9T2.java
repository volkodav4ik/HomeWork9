package com.volkodav4ik;

import java.util.Arrays;
import java.util.Random;

public class HW9T2 {

    private static final Random RANDOM = new Random();
    private static final int ARRAY_SIZE = 15;
    private static final int MAX_VALUE = 1000;

    public static void main(String[] args) {
        int[] arr = new int[ARRAY_SIZE];
        createAndInitArr(arr);
        System.out.println(Arrays.toString(arr));
        rightBigger(arr);
        evenElements(arr);
        smallerThanMean(arr);
    }

    private static void smallerThanMean(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        double mean = (double) sum / arr.length;
        int count = 0;
        for (int value : arr) {
            if (value < mean) {
                count++;
            }
        }
        System.out.println("Quantity of element which smaller than mean is: " + count);
    }

    private static void evenElements(int[] arr) {
        int count = 0;
        for (int value : arr) {
            if ((value % 2) == 0) {
                count++;
            }
        }
        System.out.println("Quantity of even element is: " + count);
    }

    private static void rightBigger(int[] arr) {
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                count++;
            }
        }
        System.out.println("Quantity of element which bigger than element on his left is: " + count);
    }

    private static void createAndInitArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = RANDOM.nextInt(MAX_VALUE) + 1;
        }
    }
}
