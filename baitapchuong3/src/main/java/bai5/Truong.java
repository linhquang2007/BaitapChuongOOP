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
public class Truong {
    private String ten;
    private String diachi;
    private String hieutruong;
    
    public Truong(){};
    
    public Truong(String ten, String diachi, String hieutruong){
        this.diachi = diachi;
        this.ten = ten;
        this.hieutruong = hieutruong;
    }

    public String getDiachi() {
        return diachi;
    }

    public String getHieutruong() {
        return hieutruong;
    }

    public String getTen() {
        return ten;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setHieutruong(String hieutruong) {
        this.hieutruong = hieutruong;
    }
    Scanner sc = new Scanner(System.in);
    
   public void input(){
       System.out.println("Nhap ten truong : "); ten = sc.nextLine();
       System.out.println("Nhap dia chi cua truong : "); diachi = sc.nextLine();
       System.out.println("Nhap hieu truong : "); hieutruong = sc.nextLine();
   }
    
    @Override
    public String toString() {
        return " Hieu Truong: "+ ten + ", " +diachi+", "+ hieutruong+".";
    }
    
    
}
