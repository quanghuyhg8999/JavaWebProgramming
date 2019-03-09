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
public class Tamgiac {

    public double a;
    public double b;
    public double c;

    Tamgiac() {

    }

    Tamgiac(double a, double b, double c) {

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

    public double getc() {
        return c;
    }

    public void setc(double c) {
        this.c = c;
    }

    public void inputInfo() {
        System.out.printf("Nhập độ dài ba cạnh của tam giác ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
    }

    public void Kiemtratamgiac() {
        if (a < b + c && b < a + c && c < a + b) {
            if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
                System.out.println("Đây là tam giác vuông");
            } else if (a == b || b == c) {
                System.out.println("Đây là tam giác đều");
            } else if (a == b || a == c || b == c) {
                System.out.println("Đây là tam giác cân");
            }
        }
        else {
            System.out.printf("Đây là tam giác thường");
        }
    }
    public void Chuvitamgiac() {
        double chuvi = 0;
        chuvi = a+b+c;
        System.out.println("Chu vi của hình tam giác là " + chuvi);
    }
    public void dientichtamgiac(){
        double dientich = 0,p;
        p = (a+b+c)/2;
        dientich = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("Diện tích của hình tam giác là " +dientich);
    }
    public static void main(String[] args) {
        Tamgiac Tgiac = new Tamgiac();
        Scanner tg = new Scanner(System.in);
        System.out.println("Nhập vào số lượng tam giác: ");
        int n = tg.nextInt();
        for (int i = 1; i <= n; i++) {
            Tgiac.inputInfo();
            Tgiac.Kiemtratamgiac();
            Tgiac.Chuvitamgiac();
            Tgiac.dientichtamgiac();
    
        }
}}
