package com.volkodav4ik;

public class HW9T6 {

    private static final int MAX_LENGTH = 201;
    private static final int MAX_SQUARE = 100;

    public static void main(String[] args) {
        int result = areaLessThanHundred();
        System.out.println("Quantity of original triangles with square less, than 100 is: " + result);
    }

    private static int areaLessThanHundred() {
        int counter = 0;
        for (int i = 1; i < MAX_LENGTH; i++) {
            for (int j = i; j < MAX_LENGTH; j++) {
                for (int k = j; k < MAX_LENGTH; k++) {
                    if (k >= (j + i)) {
                        break;
                    }
                    if (square(i, j, k) < MAX_SQUARE) {
                        counter++;
                    }
                }
            }
        }
        return counter;
    }

    private static double square(int a, int b, int c) {
        double p = (double) (a + b + c) / 2;
        double sq = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return sq;
    }

}
