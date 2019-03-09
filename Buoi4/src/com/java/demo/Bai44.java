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
public class Bai44 {
     public static void main(String[] args) {
        // TODO code application logic here
        int arr[] = new int[5];
        int count2 =0;
        arr = new int[5];
        arr[0] = 9;
        arr[1] = 3;
        arr[2] = 15;
        arr[3] = 10;
        arr[4] = 21;
        for (int i = 0; i < 5; i++) {
                       if(arr[i]%2==1)
                           count2++;
            }
    System.out.println(" " +count2);
    }    
}
