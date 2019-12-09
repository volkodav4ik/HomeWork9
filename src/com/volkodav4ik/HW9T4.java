package com.volkodav4ik;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW9T4 {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();
    private static final int ARRAY_SIZE = 3;
    private static final int MAX_VALUE = 100;

    public static void main(String[] args) {
        int[] arr = new int[ARRAY_SIZE];
        createAndInitArr(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Please, enter factor N:");
        int n = SCANNER.nextInt();
        int[] newArr = new int[arr.length * n];
        factorArray(arr, newArr);
        System.out.println(Arrays.toString(newArr));
    }

    private static void factorArray(int[] arr, int[] newArr) {
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i % arr.length];
        }
    }

    private static void createAndInitArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = RANDOM.nextInt(MAX_VALUE) + 1;
        }
    }
}
