/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Bai3 {
       public static void main(String[] args) {
        // TODO code application logic here
        int[] arr; //khai bao mang
        Scanner input = new Scanner(System.in);
        int m;
        m = input.nextInt();
        arr = new int[5];
        arr[0]=2;  
        arr[1]=3;  
        arr[2]=6;  
        arr[3]=10;  
        arr[4]=21;
        for (int i=0; i<5; i++){  
         if (m == arr[i])
         { 
             System.out.println("Vi tri trung thu " +i);
        }
        }
       }
}
