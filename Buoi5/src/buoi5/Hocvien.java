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
public class Hocvien {

    public double Diemtongket;
    public int KhoahocHDSE;
    public int Noiquy;
    public int Solanthi;

    Hocvien() {

    }

    Hocvien(int Solanthi, String Noiquy, String KhoahocHDSE, double Diemtongket) {

    }

    public int getSolanthi() {
        return Solanthi;
    }

    public void setSolanthi(int Solanthi) {
        this.Solanthi = Solanthi;
    }

    public int getNoiquy() {
        return Noiquy;
    }

    public void setNoiquy(int Noiquy) {
        this.Noiquy = Noiquy;
    }

    public int getKhoahocHDSE() {
        return KhoahocHDSE;
    }

    public void setKhoahocHDSE(int KhoahocHDSE) {
        this.KhoahocHDSE = KhoahocHDSE;
    }

    public double getDiemtongket() {
        return Diemtongket;
    }

    public void setDiemtongket(double Diemtongket) {
        this.Diemtongket = Diemtongket;
    }

    public void inputInfo() {
        System.out.printf("Nhập vào thông tin đăng kí khoá học, điểm tổng kết, cam kết vi phạm, số lần thi: ");
        Scanner scanner = new Scanner(System.in);
        KhoahocHDSE = scanner.nextInt();
        Diemtongket = scanner.nextDouble();
        Noiquy = scanner.nextInt();
        Solanthi = scanner.nextInt();
    }

    public void Hocbong() {
        if (KhoahocHDSE == 1) {
            if (Diemtongket >= 7.5) {
                if (Noiquy == 0) {
                    if (Solanthi == 1) {
                        System.out.printf("Đạt được học bổng ");
                    }
                }
            }
        } else {
            System.out.printf("Học viên không đạt được học bổng ");
        }
    }

    public static void main(String[] args) {
        Hocvien hvien = new Hocvien();
        Scanner hv = new Scanner(System.in);
        System.out.println("Nhập vào số Học viên: ");
        int n;
        n = hv.nextInt();
        for (int i = 0; i < n; i++) {
            hvien.inputInfo();
            hvien.Hocbong();
        }
    }
}
