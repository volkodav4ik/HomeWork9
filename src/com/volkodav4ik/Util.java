package com.volkodav4ik;

public class Util {

    public static void sort(int[] arr, SortType st) {
        switch (st) {
            case BUBBLE:
                bubbleSort(arr);
                break;
            case INSERT:
                insertionSort(arr);
                break;
            case SELECT:
                selectSort(arr);
                break;
            default:
                System.out.println("Unknown sort type");
        }
    }

    private static void bubbleSort(int[] arr) {
        boolean isSorted;
        for (int i = 0; i < arr.length; i++) {
            isSorted = true;
            for (int j = 1; j <= (arr.length - 1); j++) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j - 1, j);
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
        }
    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            int j = i - 1;
            while ((j > -1) && (arr[j] > tmp)) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = tmp;
        }
    }

    private static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int min_i = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                swap(arr, i, min_i);
            }
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
