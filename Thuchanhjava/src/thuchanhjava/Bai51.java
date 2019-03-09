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
public class Bai51 {
        public static void main(String[] args) {
     System.out.print("Nhap vao chieu dai m: ");
     Scanner input = new Scanner(System.in);
     int m,n,i,j;
     m = input.nextInt();
     System.out.print("Nhap vao chieu rong n: ");
     n = input.nextInt();
     if(m<=n)
     {
         System.out.print("Day khong phai hinh chu nhat");
     }
     else {
     for ( i=0 ; i<n ; i++)
     { for (j=0 ; j<m ; j++)
             System.out.print(" * "); // dùng cho for ở trong
         System.out.print("\n");    // dùng cho for ở ngoài
     }         
     }        
}}