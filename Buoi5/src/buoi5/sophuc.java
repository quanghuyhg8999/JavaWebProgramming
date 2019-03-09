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
public class sophuc{

    public double t;
    public double a;


    sophuc() {

    }

    sophuc(double t, double a) {

    }

    public double gett() {
        return t;
    }

    public void sett(double t) {
        this.t = t;
    }

    public double geta() {
        return a;
    }

    public void seta(double a) {
        this.a = a;
    }    

    public void inputInfo() {
        System.out.printf("Nhập phần thực ,ảo ");
        Scanner scanner = new Scanner(System.in);
        t = scanner.nextInt();
        a = scanner.nextInt();
  
    
    }
    public void cong() {
        double cong = 0;
            
        }
}
