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
public class Person {
    public String ten;
    public int gioitinh;
    public int namsinh;
    public String diachi;
    Person(){
        
    }
    Person(String ten, int gioitinh,int ngaysinh, String diachi){
        
    }
    public String getten(){
        return ten;
    }
    public void setten(String ten){
        this.ten = ten;
    }
    public int getgioitinh(){
        return gioitinh;
    }
    public void setgioitinh(int gioitinh){
        this.gioitinh = gioitinh;
    }
    public int getnamsinh(){
        return namsinh;
    }
    public void setnamsinh(int namsinh){
        this.namsinh = namsinh;
    }
    public String getdiachi(){
        return diachi;
    }
    public void setdiachi(String diachi){
        this.diachi = diachi;
    }
    public void nhapInfo(){
        System.out.println("Nhập vào thông tin của người dùng ");
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập vào tên : ");
        ten = sc.nextLine();
        System.out.printf("Nhập vào giới tính của người đó: (Lưu ý: Nam = 0 , Nữ =1) ");
        gioitinh = Integer.parseInt(sc.nextLine());
        System.out.printf("Nhập vào năm sinh của người đó: ");
        namsinh = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào địa chỉ của người đó: ");
        diachi = sc.nextLine();
    }
    public void showInfo(){
        System.out.println("Thông tin của người dùng là ");
        System.out.println("Tên :  " +ten);
        if(gioitinh == 0){
        System.out.println("Giới tính: Nam ");
        }
        else{
            System.out.println("Giới tính: Nữ");
        }
        System.out.println("Năm sinh:  " +namsinh);
        System.out.println("Địa chỉ: " +diachi);
    }
    public static void main(String[] Args){
        System.out.println("Chào mừng bạn đến mới phần khai báo thông tin");
        Scanner sc = new Scanner(System.in);
        Person ps = new Person();
        ps.nhapInfo();
        ps.showInfo();
    }
    }
    

