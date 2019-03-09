/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi5;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class hinhchunhat {

    public double a;
    public double b;


    hinhchunhat() {

    }

    hinhchunhat(double a, double b) {

    }

    public double geta() {
        return a;
    }

    public void seta(double a) {
        this.a = a;
    }

    public double getb() {
        return b;
    }

    public void setb(double b) {
        this.b = b;
    }

    

    public void inputInfo() {
        System.out.printf("Nhập độ dài hai cạnh của hình chữ nhật ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
  
    
    }
    public void Chuvihcn() {
        double chuvi = 0;
        chuvi = (a+b)*2;
        System.out.println("Chu vi của hình chữ nhật là " + chuvi);
    }
    public void dientichhcn(){
        double dientich = 0;
        dientich = a*b;
        System.out.println("Diện tích của hình chữ nhật là " +dientich);
    }
    public static void main(String[] args) {
        hinhchunhat hcnhat = new hinhchunhat();
        Scanner hcn = new Scanner(System.in);
        System.out.println("Nhập vào số lượng hình chữ nhật: ");
        int n = hcn.nextInt();
        for (int i = 1; i <= n; i++) {
            hcnhat.inputInfo();
            hcnhat.Chuvihcn();
            hcnhat.dientichhcn();
    
        }
}}
