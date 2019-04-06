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
public class Hocvien {
    public String ID;
    public String name;
    public double mark;
    public int group;
    public String phone;

    Hocvien(){
    }
    Hocvien(String ID, String name, double mark, int group, String phone){        
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public double getMark() {
        return mark;
    }

    public int getGroup() {
        return group;
    }

    public String getPhone() {
        return phone;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void input(){
        Scanner input = new Scanner(System.in);
        try{
        System.out.println("Nhập vào mã học viên: ");
        ID = input.nextLine();
        boolean startsWith = ID.startsWith("HV");
        }
        catch(Exception e){
            System.out.println("Sai định dạng của mã học viên! Định dạng: HVxxx ");
            System.out.println("Mời nhập lại");
        }
        
        try {
               System.out.println("Nhập vào tên học viên: ");
               name = input.nextLine();
        } catch (Exception e) {
            System.out.println("Sai định dạng");
        }
      
        try {
              System.out.println("Nhập vào điểm học viên: ");
              mark = input.nextDouble();
        } catch (NumberFormatException e) {
            System.out.println("Sai định dạng. Điểm ghi bằng số");
        }
        
        try {
            System.out.println("Nhập vào số điện thoại học viên: ");
            phone = input.nextLine();
        } catch (NumberFormatException e) {
            System.out.println("Sai định dạng. Sđt không được có chữ");
        }
        
    }
}
