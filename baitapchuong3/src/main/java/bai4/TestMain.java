/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4;

import java.util.Scanner;


/**
 *
 * @author Admin
 */
public class TestMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        BenhNhan bn = new BenhNhan();
        //nhap thong tin cho benh nhan
        System.out.println("Tien su : ");
        bn.setTiensu(sc.nextLine());
        System.out.println("Nhap chuan doan: ");
        bn.setChuandoan(sc.nextLine());
        System.out.println("Nhap BenhVien: ");
        bn.input();
        
        // xuat thong tin benh nhan;
        System.out.println("Thong tin Benh Nhan Trong Benh Vien: \n " + bn.toString());
    }
}
