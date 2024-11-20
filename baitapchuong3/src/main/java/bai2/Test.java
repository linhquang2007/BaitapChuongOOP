/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Test {
    public static void main(String[] args) {
        DiaChi dc;
        //tao doi tuong;
        try (Scanner sc = new Scanner(System.in)) {
            //tao doi tuong;
            dc = new DiaChi();
            //nhap thong tin doi tuong
            System.out.println("thon :");
            dc.setThon(sc.nextLine());
            System.out.println("xa: ");
            dc.setXa(sc.nextLine());
            System.out.println("huyen: ");
            dc.setHuyen(sc.nextLine());
            System.out.println("tinh: ");
            dc.setTinh(sc.nextLine());
            // dong scanner
            sc.close();
        }
        
        // hien thi doi tuong:
        System.out.println(dc.toString());
    }
}
