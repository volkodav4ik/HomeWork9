package com.volkodav4ik;

import java.util.Arrays;
import java.util.Random;

public class HW9T1 {

    public static final int SIZE_ARRAY = 10;
    private static final int MAX_VALUE = 100;
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        int[] arr = new int[SIZE_ARRAY];
        createAndInitArr(arr);
        System.out.println("Unsorted array: " + Arrays.toString(arr));
        SortType st = SortType.BUBBLE;
        Util.sort(arr, st);
        System.out.println("Array after sorting: " + Arrays.toString(arr));

    }

    private static void createAndInitArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = RANDOM.nextInt(MAX_VALUE);
        }
    }
}
