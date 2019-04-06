/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgclass;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class ngoaile {
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        int a,b;
        double x;
        System.out.println("Nhập vào số a: ");
        a = sc.nextInt();
        System.out.println("Nhập vào số b: ");
        b = sc.nextInt();
        try {
              x = a/b;
        System.out.println("" +x);
        } catch (ArithmeticException e) {
            System.out.println("Ngoại lệ");
            
        }
    }
    
}
