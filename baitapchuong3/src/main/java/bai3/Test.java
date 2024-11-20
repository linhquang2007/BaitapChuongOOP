/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //khoi tao nhan vien;
        NhanVien nv = new NhanVien();
        
        System.out.println("Nhap thong tin :\nten");
        nv.setName(sc.nextLine());
        System.out.println("dia chi ");
        nv.input();
        System.out.println("ngay sinh(dob) :");
        nv.setDob(sc.nextLine());
        System.out.println("Nhap gender: ");
        nv.setGender(sc.nextLine().charAt(0));
        
        System.out.println(" in ra thong tin cua nhan vien do :" + nv.toString());
        
    }
}
