/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Nguoi {
    private String ten;
    private int tuoi;
    private char gioitinh;
    
    public Nguoi(){};
    
    public Nguoi(String ten,int tuoi,char gioitinh){
        this.ten = ten;
        this.tuoi =  0;
        this.gioitinh = ' ';
    }

    public char getGioitinh() {
        return gioitinh;
    }

    public String getTen() {
        return ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setGioitinh(char gioitinh) {
        this.gioitinh = gioitinh;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    Scanner sc = new Scanner(System.in);
//    public void input(){
////        System.out.println("Nhap ten : "); ten = sc.nextLine();
////        System.out.println("Nhap tuoi : "); tuoi = sc.nextInt();
////        System.out.println("Nhap gioi tinh "); gioitinh = sc.nextLine().charAt(0);
////    }
//        System.out.println(" Nhap ten: "); sc.nextLine(); // Consume newline
//        System.out.println("Nhap tuoi: "); tuoi = sc.nextInt();
////        System.out.println(" Nhap ten: "); sc.nextLine(); // Consume newline
//        System.out.println("Nhap gioi tinh: "); gioitinh = sc.nextLine().charAt(0);
//    }
    public void input() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap ten: ");
    ten = sc.nextLine(); // Đọc tên trước
    System.out.println("Nhap tuoi: ");
    tuoi = sc.nextInt();
    sc.nextLine(); // Loại bỏ ký tự '\n' thừa sau khi nhập số
    System.out.println("Nhap gioi tinh: ");
    gioitinh = sc.nextLine().charAt(0);
}
    @Override
    public String toString() {
        return" Nguoi : "+ ten + ", " +tuoi+", "+ gioitinh+".";
    }
}
