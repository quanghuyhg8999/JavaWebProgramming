/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgclass;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Hocvien1{
public static void main(String Args[]){
        Hocvien hvien = new Hocvien();
        Scanner hv = new Scanner(System.in);
        System.out.printf("Nhập vào số Học viên: ");
        int n;
        n = hv.nextInt();
        for (int i = 0; i < n; i++) {
        hvien.input();
    }
}}
