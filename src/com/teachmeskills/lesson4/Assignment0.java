package com.teachmeskills.lesson4;

import java.util.Scanner;
import java.util.Arrays;

public class Assignment0 {

    public static void main(String[] args) {
        int [] array = {33, 14, -15, 77, 99, -888};
        Arrays.sort(array);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print the number for search: ");
        int numberToSearch = scanner.nextInt();
        boolean isInArray = Arrays.binarySearch(array, numberToSearch) >=0;
        if (isInArray){
            System.out.println(numberToSearch + " is in the array");
        } else {
            System.out.println(numberToSearch + " is not in the array");
        }

    }

}
