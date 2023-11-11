package com.teachmeskills.lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Source array:");
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }

        int max = findMax(array);
        int min = findMin(array);
        int average = findAverage(array);

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
        System.out.println("Average value: " + average);
    }

    private static int findMax(int[] array) {
        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    private static int findMin(int[] array) {
        int min = array[0];
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    private static int findAverage(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum / array.length;
    }

}

