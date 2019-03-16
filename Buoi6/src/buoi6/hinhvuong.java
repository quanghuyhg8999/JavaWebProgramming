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
public class hinhvuong extends hinhchunhat{
    @Override
        public void chuvi(){
            System.out.println("Đây là nhập vào thông tin của hình vuông");
        int cv;
        chieudai = chieurong;
        cv = chieudai *2;
        System.out.println("Chu vi của hình vuông là: " +cv);
    }
        public void dientich(){
        int dt;
        dt = chieudai *chieurong;
        System.out.println("Chu vi của hình vuông là: " +dt);
    }
}
