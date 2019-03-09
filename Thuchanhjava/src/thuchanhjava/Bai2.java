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
public class Bai2  {
        public static void main(String[] args) {
     System.out.print("Nhap vao so co ba chu so: ");
     Scanner input = new Scanner(System.in);
     int m,n,v,h,q; 
     m = input.nextInt();
     v = m%10;
     q = m/10;
     h = q%10;
     n = m/100;
     switch(n)
     {   
         case 1: 
             System.out.print("Mot tram ");
             break;
        case 2: 
             System.out.print("Hai tram");
             break;
        case 3: 
             System.out.print("Ba tram");
             break;
        case 4: 
             System.out.print("Bon tram");
             break;
        case 5: 
             System.out.print("Nam tram");
             break;
        case 6: 
             System.out.print("Sau tram");
             break;
        case 7: 
             System.out.print("Bay tram");
             break;
        case 8: 
             System.out.print("Tam tram");
             break;
        case 9: 
             System.out.print("Chin tram");
             break;
    }
     switch(h)
     {
         case 1: 
             System.out.print(" muoi ");
             break;
        case 2: 
             System.out.print(" hai muoi");
             break;
        case 3: 
             System.out.print(" ba muoi");
             break;
        case 4: 
             System.out.print(" bon muoi");
             break;
        case 5: 
             System.out.print(" nam muoi");
             break;
        case 6: 
             System.out.print(" sau muoi");
             break;
        case 7: 
             System.out.print(" bay muoi");
             break;
        case 8: 
             System.out.print(" tam muoi");
             break;
        case 9: 
             System.out.print(" chin muoi");
             break;
    }
     switch(v)
     {
         case 1: 
             System.out.println(" mot");
             break;
        case 2: 
             System.out.println(" hai");
             break;
        case 3: 
             System.out.println(" ba");
             break;
        case 4: 
             System.out.println(" bon");
             break;
        case 5: 
             System.out.println(" nam");
             break;
        case 6: 
             System.out.println(" sau");
             break;
        case 7: 
             System.out.println(" bay");
             break;
        case 8: 
             System.out.println(" tam");
             break;
        case 9: 
             System.out.println(" chin");
             break;
    }
}}
