package com.teachmeskills.lesson4;

import java.util.Arrays;

public class Assignment3 {
    public static void main(String[] args) {
        int[] array1 = {33, 44, 677, 25, 4};
        int[] array2 = {12, 34, 12, 5, 8};
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        int average1 = calculateAverage(array1);
        int average2 = calculateAverage(array2);
        if (average1 > average2) {
            System.out.println("Arithmetic mean for Array 1 is greater : " + average1);
        } else if (average1 < average2) {
            System.out.println("Arithmetic mean for Array 2 is greater : " + average2);
        } else {
            System.out.println("Arithmetic averages are equal to: " + average1);
        }
    }

    private static int calculateAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum / arr.length;
    }

}
