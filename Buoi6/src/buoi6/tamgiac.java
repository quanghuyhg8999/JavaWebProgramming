/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi6;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class tamgiac {
    public int a;
    public int b;
    public int c;
    tamgiac(){
        
    }
    tamgiac(int a,int b,int c){
        
    }
    public int geta(){
        return a;
    }
    public void seta(int a){
        this.a = a;
    }
    public int getb(){
        return b;
    }
    public void setb(int b){
        this.b = b;
    }
    public int getc(){
        return c;
    }
    public void setc(int c){
        this.c = c;
    }
    public void nhapInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập vào độ dài cạnh a: ");
        a  = sc.nextInt();
        System.out.printf("Nhập vào độ dài cạnh b: ");
        b  = sc.nextInt();
        System.out.printf("Nhập vào độ dài cạnh c: ");
       c  = sc.nextInt();
    }  
}
