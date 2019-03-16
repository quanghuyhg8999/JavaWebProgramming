/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi6;

/**
 *
 * @author HP
 */
public class hinhchunhat extends hinhbinhhanh{
    @Override
        public void chuvi(){
            System.out.println("Đây là nhập vào thông tin của hình chữ nhật");
        int cv;
        cv = (chieudai +chieurong)*2;
        System.out.println("Chu vi của hình chữ nhật là: " +cv);
    }
        public void dientich(){
        int dt;
        dt = chieudai *chieurong;
        System.out.println("Chu vi của hình chữ nhật là: " +dt);
    }
}
