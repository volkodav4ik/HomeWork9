package com.volkodav4ik;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW9T5 {

    private static final Random RANDOM = new Random();
    private static final int MAX_SIZE_AND_VALUE = 1000;
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[MAX_SIZE_AND_VALUE];
        createAndInitArr(arr);
        int low = 0;
        int high = arr.length - 1;
        quickSort(arr, low, high);
        System.out.println("Please, enter some number from 1 to " + MAX_SIZE_AND_VALUE);
        int n = SCANNER.nextInt();
        if (n <= 0 || n > MAX_SIZE_AND_VALUE) {
            System.out.println("Number out of bound, please enter correct number. ");
            System.exit(0);
        }
        System.out.println(Arrays.toString(arr));
        boolean result = binarSearch(arr, n);
        System.out.println("Result of searching is: " + result);
    }

    private static boolean binarSearch(int[] arr, int n) {
        int lowestIndex = 0;
        int higherIndex = arr.length - 1;
        int middle = (higherIndex + lowestIndex) / 2;
        while (arr[middle] != n && lowestIndex <= higherIndex) {
            if (arr[middle] > n) {
                higherIndex = middle - 1;
            } else {
                lowestIndex = middle + 1;
            }
            middle = (higherIndex + lowestIndex) / 2;
        }
        return lowestIndex <= higherIndex;
    }

    private static void quickSort(int[] quickArr, int low, int high) {
        if (quickArr.length == 0) {
            return;
        }
        if (low >= high) {
            return;
        }
        int middle = low + (high - low) / 2;
        int support = quickArr[middle];
        int i = low;
        int j = high;
        while (i <= j) {
            while (quickArr[i] < support) {
                i++;
            }
            while (quickArr[j] > support) {
                j--;
            }
            if (i <= j) {
                swap(quickArr, i, j);
                i++;
                j--;
            }
        }
        if (low < j) {
            quickSort(quickArr, low, j);
        }
        if (high > i) {
            quickSort(quickArr, i, high);
        }
    }

    private static void createAndInitArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = RANDOM.nextInt(MAX_SIZE_AND_VALUE) + 1;
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
