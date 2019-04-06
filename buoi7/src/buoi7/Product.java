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
public class Product {
    public int ID;
    public String name;
    public double price;
    public int quantity;
    
    Product(){
        
    }
    Product(int ID, String name, double price, int quantity){
        
    }       
    public int getID(){
        return ID;
    }
    public void setID(int ID){
        this.ID = ID;
    }
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }
    public double getprice(){
        return price;
    }
    public void setprice(int price){
        this.price = price;
    }
    public int getquantity(){
        return quantity;
    }
    public void setquantity(int quantity){
        this.quantity = quantity;
    }
    public void addNew(){
        Scanner p = new Scanner(System.in);
        System.out.println("Nhập ID: ");
        ID = p.nextInt();
        System.out.println("Nhập tên: ");
        name = p.nextLine();
        System.out.println("Nhập giá: ");
        price = p.nextDouble();
        System.out.println("Nhập số lượng: ");
        quantity = p.nextInt();
        
    }
}
