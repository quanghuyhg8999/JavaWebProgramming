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
public class Bai1 {
        public static void main(String[] args) {
     System.out.print("Nhap vao so co hai chu so: ");
     Scanner input = new Scanner(System.in);
     int m,n,v; 
     m = input.nextInt();
     v = m%10;
     n = m/10;
     switch(n)
     {
         case 1: 
             System.out.print("Muoi ");
             break;
        case 2: 
             System.out.print("Hai muoi");
             break;
        case 3: 
             System.out.print("Ba muoi");
             break;
        case 4: 
             System.out.print("Bon muoi");
             break;
        case 5: 
             System.out.print("Nam muoi");
             break;
        case 6: 
             System.out.print("Sau muoi");
             break;
        case 7: 
             System.out.print("Bay muoi");
             break;
        case 8: 
             System.out.print("Tam muoi");
             break;
        case 9: 
             System.out.print("Chin muoi");
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