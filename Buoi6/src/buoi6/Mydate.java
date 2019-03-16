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
public class Mydate {

    public int ngay;
    public int thang;
    public int nam;

    Mydate() {
    }

    Mydate(int ngay, int thang, int nam) {

    }

    public int getngay() {
        return ngay;
    }

    public void setngay(int ngay) {
        this.ngay = ngay;
    }

    public int getthang() {
        return thang;
    }

    public void setthang(int thang) {
        this.thang = thang;
    }

    public int getnam() {
        return nam;
    }

    public void setnam(int nam) {
        this.nam = nam;
    }

    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập vào ngày: ");
        ngay = scanner.nextInt();
        System.out.printf("Nhập vào tháng: ");
        thang = scanner.nextInt();
        System.out.printf("Nhập vào năm: ");
        nam = scanner.nextInt();

    }

    public void namcongi() {
        int can, chi, h, a, b, c, d, e;
        h = this.nam % 10;
        a = this.nam / 100;
        b = this.nam % 100;
        c = a % 3;
        d = c * 4 + b;
        e = d % 12;
        switch (h) {
            case 0:
                System.out.printf("Đây là năm canh");
                break;
            case 1:
                System.out.printf("Đây là năm tân");
                break;
            case 2:
                System.out.printf("Đây là năm nhâm");
                break;
            case 3:
                System.out.printf("Đây là năm quý");
                break;
            case 4:
                System.out.printf("Đây là năm giáp");
                break;
            case 5:
                System.out.printf("Đây là năm Ất");
                break;
            case 6:
                System.out.printf("Đây là năm bính");
                break;
            case 7:
                System.out.printf("Đây là năm đinh");
                break;
            case 8:
                System.out.printf("Đây là năm mậu");
                break;
            case 9:
                System.out.printf("Đây là năm kỷ");
                break;
            case 10:
                System.out.printf("Đây là năm canh");
                break;

        }
        switch (e) {
            case 0:
                System.out.println(" thân");
                break;
            case 1:
                System.out.println(" dậu");
                break;
            case 2:
                System.out.println(" tuất");
                break;
            case 3:
                System.out.println(" hợi");
                break;
            case 4:
                System.out.println(" tý");
                break;
            case 5:
                System.out.println(" sửu");
                break;
            case 6:
                System.out.println(" dần");
                break;
            case 7:
                System.out.println(" mão");
                break;
            case 8:
                System.out.println(" thìn");
                break;
            case 9:
                System.out.println(" tỵ");
                break;
            case 10:
                System.out.println(" ngọ");
                break;
            case 11:
                System.out.println(" mùi");
                break;
        }
    }

    public int songaytrongthang(int thang, int nam,int ngay) {
        int p,o;
        p = this.nam % 19;
        switch (thang) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 31;
            case 2:
                if (p == 0 || p == 3 || p == 6 || p == 9 || p == 11 || p == 14 || p == 17) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 30;
        }
    }


public void congtrusosanh() {
        System.out.printf("Bạn có muốn cộng trừ hay so sánh ngày? 0: cộng, 1:trừ, 2 so sánh");
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        if (m == 0) {
            System.out.println("Chọn số ngày bạn muốn cộng: ");
            int z = scanner.nextInt();
            ngay += z;
            if (ngay > 2) {
            }
        }
    }

    public void thutrongtuan() {
        int thu;
        thu = (ngay + ((153 * (thang + 12 * ((14 - thang) / 12) - 3) + 2) / 5) + (365 * (nam + 4800 - ((14 - thang) / 12)))
                + ((nam + 4800 - ((14 - thang) / 12)) / 4) - ((nam + 4800 - ((14 - thang) / 12)) / 100)
                + ((nam + 4800 - ((14 - thang) / 12)) / 400) - 32045) % 7;
        switch (thu) {
            case 0:
                System.out.println("Đây là ngày thứ hai");
                break;
            case 1:
                System.out.println("Đây là ngày thứ ba");
                break;
            case 2:
                System.out.println("Đây là ngày thứ tư");
                break;
            case 3:
                System.out.println("Đây là ngày thứ năm");
                break;
            case 4:
                System.out.println("Đây là ngày thứ sáu");
                break;
            case 5:
                System.out.println("Đây là ngày thứ bảy");
                break;
            default:
                System.out.println("Đây là ngày chủ nhật");
                break;
        }
    }

    public void printf() {
        System.out.println("Bạn muốn in ra dạng ngắn hay dài? 0: ngắn, 1: dài");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 0) {
            System.out.println("" + ngay + "/" + thang + "/" + nam);
        } else {
            System.out.println("Ngày " + ngay + " tháng " + thang + " năm " + nam);
        }
    }

    public static void main(String[] Args) {
        Mydate mdate = new Mydate();
        Scanner md = new Scanner(System.in);
        mdate.inputInfo();
        mdate.thutrongtuan();
        mdate.namcongi();
        mdate.printf();
    }
}
