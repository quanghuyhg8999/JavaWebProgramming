/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo;

/**
 *
 * @author HP
 */
public class Bai42 {
     public static void main(String[] args) {
   int arr[] = new int[5];
        int b;
        arr = new int[5];
        arr[0] = 9;
        arr[1] = 3;
        arr[2] = 15;
        arr[3] = 10;
        arr[4] = 21;
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (arr[i] < arr[j]) {
                       b = arr[i];
                       arr[i] = arr[j];
                       arr[j] = b;
                }
            }
            System.out.printf(" %d ", arr[i]);
        }
    }
}

