/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi7;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] Args){
        int chon;
        Scanner input = new Scanner(System.in);
        for (int i =0;i <5 ;i++){
            System.out.println("Student Manager");
            System.out.println(" 1. Danh sách sinh viên ");
            System.out.println(" 2. Tìm sinh viên: ");
            System.out.println(" 3. Thêm sinh viên ");
            System.out.println(" 4. Kết thúc ");
            chon = input.nextInt();
            switch(chon){
                case 1: System.out.println("Danh sách sinh viên: ");
                break;
                case 2: System.out.println("Tên sinh viên cần tìm : ");
                break;
                case 3: System.out.println("Thêm sinh viên: ");
                break;
                case 4: System.out.println("Thoát!! ");
                break;
            }
        }
    }
}
