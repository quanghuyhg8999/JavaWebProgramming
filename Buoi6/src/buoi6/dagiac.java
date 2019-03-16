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
public class dagiac {
    public int chieudai;
    public int chieurong;
    dagiac(){
        
    }
    dagiac(int chieudai, int chieurong){
        
    }
    public int getchieudai(){
        return chieudai;
    }
    public void setchieudai(int chieudai){
        this.chieudai = chieudai;
    }
    public int getchieurong(){
        return chieurong;
    }
    public void setchieurong(int chieurong){
        this.chieurong = chieurong;
    }
    public void nhapInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập vào chiều dài a: ");
        chieudai  = sc.nextInt();
        System.out.printf("Nhập vào chiều rộng b: ");
        chieurong = sc.nextInt();
        
    }  
}

