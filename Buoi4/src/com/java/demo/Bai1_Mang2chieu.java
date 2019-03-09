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
public class Bai1_Mang2chieu {
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        int sum1 = 0 , sum2 = 0;
        int[][] matrix1 = { 
                            {1,2,3},
                            {4,5,6},
                            {8,9,1},
                                    };
        System.out.println("MA TRAN 1 ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println("");
        }
        int[][] matrix2 = { 
                            {7,8,3},
                            {4,3,6},
                            {8,2,1},
                                    };
        System.out.println("MA TRAN 2 ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println("");
        }
        int c[][];
        for (int i=1;i<n;i++)
            for(int j=1;j<n;j++)
            {c[i][j] = a[i][j] + b[i][j];
            }
    }}
