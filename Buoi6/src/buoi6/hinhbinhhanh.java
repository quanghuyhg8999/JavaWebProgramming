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
public class hinhbinhhanh extends dagiac {
    public int chieucao;
    public void chuvi(){
        int cv;
        cv = (chieudai +chieurong)*2;
        System.out.println("Chu vi của hình bình hành là: " +cv);
    }
    public void dientich(){
        int dt;
        Scanner sc = new Scanner(System.in);
        System.out.println("Lưu ý: Diện tích hình bình hành bằng tích của đường cao nhân với cạnh đáy mà đường cao đó hạ xuống");
        System.out.printf("Nhập vào chiều cao h: ");
        chieucao  = sc.nextInt();
        dt = chieucao * chieudai;
        System.out.println("Diện tích hình bình hành là: " +dt);
    }
}