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
public class Bai41 { public static void main(String[] args) {
    System.out.print("Nhap vao chieu cao tam giac can dac ");
    Scanner input = new Scanner(System.in);
    int h,i,j;
    h = input.nextInt();
    for (i=1;i<=h;i++){
        for (j=1;j<=2*h-1;j++)
            if(j >= (h-i+1) && j <= (h+i-1))
                System.out.printf("*");
            else System.out.printf(" ");
        System.out.printf("\n");
}
}}
