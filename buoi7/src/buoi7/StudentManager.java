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
public class StudentManager extends Student {
    public Student[] addStudents;
    StudentManager(){
        
    }
    StudentManager(String name, String email, int age){
       
    }
    public boolean add(Student stud){
        Scanner sc = new Scanner(System.in);
    System.out.println("Nhập vào thông tên sinh viên: ");
    name = sc.nextLine();
    System.out.println("Nhập vào email của sinh viên: ");
    email = sc.nextLine();
    System.out.println("Nhập vào tuổi của sinh viên: ");
    age = sc.nextInt();
    return true;
    }
    public boolean showInfo(){
        Scanner sc = new Scanner(System.in);
        public String name;
        System.out.println("Nhập vào tên của sinh viên cần tìm: ");
        
    }
}
