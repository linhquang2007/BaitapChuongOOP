/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class NhanVien {
    private String name;
    private Address diachi;
    private String dob;
    private char gender;
    
    //constructor
    public NhanVien(){};
    
    public NhanVien(String name, Address diachi, String dob, char gender){
        this.name = name;
        this.diachi =diachi;
        this.dob = dob;
        this.gender = gender;
    }

    public Address getDiachi() {
        return diachi;
    }

    public char getGender() {
        return gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setDiachi(Address diachi) {
        this.diachi = diachi;
    }

    public String getName() {
        return name;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    Scanner sc = new Scanner(System.in);
    
    Address dc = new Address();
    public void input(){
        System.out.println("Nhap thon : ");
        dc.setThon(sc.nextLine());
        System.out.println("Nhap xa :");
        dc.setXa(sc.nextLine());
        System.out.println("Nhap huyen :");
        dc.setHuyen(sc.nextLine());
        System.out.println("Nhap tinh: ");
        dc.setTinh(sc.nextLine());
    }    
    @Override
    public String toString() {
        return " Nhan vien["+name+", "+dc.toString()+","+dob+", "+gender+"]";
    }
    
}
