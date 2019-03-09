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
public class Bai3 {
    public static void main(String[] args) {
     System.out.print("Nhap vao so tien : ");
     Scanner input = new Scanner(System.in);
     int n,q,h,v,m,t; 
     n = input.nextInt();
     q = n / 500000;
     System.out.println("So to tien 500000: " +q);
     h = n % 500000;
     v = h / 200000;
     System.out.println("So to tien 200000: " +v);
     m = n % 200000;
     t = m / 100000;
     System.out.println("So to tien 100000: " +t);
  
     
}}
