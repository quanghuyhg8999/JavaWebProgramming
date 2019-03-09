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
public class Sinhvien {

    private String Ten;
    private int Tuoi;
    private String Diachi;
    private double Tienluong;
    private int Tongsogiolam;

    Sinhvien() {
    }

    Sinhvien(String Ten, int Tuoi, String Diachi, double Tienluong, int Tongsogiolam) {
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int Tuoi) {

        this.Tuoi = Tuoi;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachia(String Diachi) {
        this.Diachi = Diachi;
    }

    public double getTienluong() {
        return Tienluong;
    }

    public void setTienluong(double Tienluong) {
        this.Tienluong = Tienluong;
    }

    public int getTongsogiolam() {
        return Tongsogiolam;
    }

    public void setTongsogiolam(int Tongsogiolam) {
        this.Tongsogiolam = Tongsogiolam;
    }

    public void inputInfo() {
        System.out.printf("Nhập tên, tuổi, địa chỉ, lương, số giờ làm: ");
        Scanner scanner = new Scanner(System.in);
        Ten = scanner.nextLine();
        Tuoi = Integer.parseInt(scanner.nextLine());
        Diachi = scanner.nextLine();
        Tienluong = scanner.nextDouble();
        Tongsogiolam = scanner.nextInt();
    }

    public void printfInfo() {
        System.out.println("Tên của sinh viên:  " + Ten);
        System.out.println("Tuổi của sinh viên: " + Tuoi);
        System.out.println("Địa chỉ của sinh viên: " + Diachi);
        System.out.println("Tiền lương của sinh viên: " + Tienluong);
        System.out.println("Tổng số giờ làm của sinh viên:" + Tongsogiolam);
    }

    public double tinhThuong() {
        double Thuong;
        if (Tongsogiolam >= 200) {
            Thuong = Tienluong * 0.2;
        } else if (Tongsogiolam < 200 && Tongsogiolam >= 100) {
            Thuong = Tienluong * 0.1;
        } else {
            Thuong = 0;
        }
        return Thuong;
    }

    public static void main(String[] args) {
        Sinhvien Svien = new Sinhvien();
        Scanner sv = new Scanner(System.in);
        System.out.println("Nhập vào số lượng sinh viên: ");
        int n = sv.nextInt();
        for (int i = 1; i <= n; i++) {
            Svien.inputInfo();
            Svien.printfInfo();
            System.out.printf("Tiền thưởng: %.3f\n", Svien.tinhThuong());
        }
    }
}
