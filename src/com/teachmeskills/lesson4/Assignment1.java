package com.teachmeskills.lesson4;

import java.util.Scanner;

public class Assignment1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter the number to delete: ");
        int numberToRemove = scanner.nextInt();
        int newSize = removeNumberFromArray(array, numberToRemove);
        if (newSize > 0) {
            System.out.println("A new array without a number " + numberToRemove + ":");
            for (int i = 0; i < newSize; i++) {
                System.out.print(array[i] + " ");
            }
        } else {
            System.out.println("Number " + numberToRemove + " not found in the array.");
        }
    }

    private static int removeNumberFromArray(int[] array, int numberToRemove) {
        int newSize = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != numberToRemove) {
                array[newSize] = array[i];
                newSize++;
            }
        }
        return newSize;
    }

}
