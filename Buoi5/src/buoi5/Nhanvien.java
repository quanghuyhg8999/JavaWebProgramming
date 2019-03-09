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
public class Nhanvien {

    public String Manhanvien;
    public double Diemtrungbinh;
    public int Tuoi;
    public String Lop;


Nhanvien(){

}

Nhanvien(String Manhanvien, int Diemtrungbinh, int Tuoi, String Lop){
    
}

public String getManhanvien(){
    return Manhanvien;
}
public void setManhanvien(String Manhanvien){
    this.Manhanvien = Manhanvien;
}
public double getDiemtrungbinh(){
    return Diemtrungbinh;
}
public void setDiemtrungbinh(int Diemtrungbinh){
    this.Diemtrungbinh = Diemtrungbinh;    
}
public int getTuoi(){
    return Tuoi;
}
public void setTuoi(int Tuoi){
    this.Tuoi = Tuoi;
}
public String getLop(){
    return Lop;
}
public void setLop(String Lop){
    this.Lop = Lop;
}

public void inputInfo(){
    System.out.printf("Nhập vào Mã sinh viên, điểm trung bình, tuổi, lớp: ");
    Scanner scanner = new Scanner(System.in);
    Manhanvien = scanner.nextLine();
    Diemtrungbinh = Integer.parseInt(scanner.nextLine());
    Tuoi = Integer.parseInt(scanner.nextLine());
    Lop = scanner.nextLine();
    
}

public void showInfo(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Mã nhân viên là: " +this.getManhanvien());
    System.out.println("Điểm trung bình là: " +this.getDiemtrungbinh());
    System.out.println("Tuổi nhân viên là: " +this.getTuoi());
    System.out.println("Lớp của nhân viên là: " +this.getLop());
    
}
public void Hocbong(){
    if(Diemtrungbinh>=8)
    {
       System.out.println("Nhân viên được học bổng");
    }
    else{ 
        System.out.println("Nhân viên không được học bổng");
    }}
public static void main (String[] args){
    Nhanvien Nvien = new Nhanvien();
    Scanner nv = new Scanner(System.in);
    System.out.println("Nhập vào số nhân viên: ");
    int n = nv.nextInt();
    for (int i=0;i<n;i++)
    {
        Nvien.inputInfo();
        Nvien.showInfo();
        Nvien.Hocbong();
    }
}
}