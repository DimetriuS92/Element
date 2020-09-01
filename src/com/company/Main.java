package com.company;

public class Main {

    public static void main(String[] args) {
        int arr[] = {1, 206, 10, 2, 3, 0, 7, 56, 32, 3, 14};
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
