/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi7;

/**
 *
 * @author HP
 */
public class Student {
    public String name;
    public String email;
    public int age;
    Student(){
    }
    Student(String name, String email, int age){        
    }
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }
    public String getemail(){
        return name;
    }
    public void setgmail(String email){
        this.email = email ;
    }
    public int age(){
        return age;
    }
    public void setage(int age){
        this.age = age;
    }
}
