/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuchanhjava;

import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Bai52 {   public static void main(String[] args) {
     System.out.print("Nhap vao chieu dai m: ");
     Scanner input = new Scanner(System.in);
     int m,n,i,j;
     m = input.nextInt();
     System.out.print("Nhap vao chieu rong n: ");
     n = input.nextInt();
     for ( i=0 ; i<n ; i++)
     { for (j=0 ; j<m ; j++)
         if (i == 0 || j == 0 || i == n-1 || j == m-1  )
             System.out.print("*"); 
         else System.out.print(" ");
         System.out.print("\n");                          
     }        
}}
