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
public class BenhNhan extends Nguoi{
    private String tiensu;
    private String chuandoan;
    private BenhVien benhvien;
    
    public BenhNhan(){};
    
    public BenhNhan(String ten, String tuoi, char gioitinh,String tiensu, String chuandoan, BenhVien benhvien ){
        super(ten, tuoi, gioitinh);
        this.tiensu = tiensu;
        this.chuandoan = chuandoan;
        this.benhvien = benhvien;
    }

    public BenhVien getBenhvien() {
        return benhvien;
    }
    public String getChuandoan() {
        return chuandoan;
    }
    public String getTiensu() {
        return tiensu;
    }

    public void setChuandoan(String chuandoan) {
        this.chuandoan = chuandoan;
    }

    public void setBenhvien(BenhVien benhvien) {
        this.benhvien = benhvien;
    }

    public void setTiensu(String tiensu) {
        this.tiensu = tiensu;
    }
    Scanner sc = new Scanner(System.in);
    //tao doi tuong tu lop nguoi de nhap;
    BenhVien bv = new BenhVien();
    public void input(){
        System.out.println("Nhap ten BV:");
        bv.setTen(sc.nextLine());
        System.out.println("Nhap dia chi BV: ");
        bv.setDiachi(sc.nextLine());
        System.out.println("Nhap giam doc BV: ");
        bv.setGiamdoc(sc.nextLine());
    }
    @Override
    public String toString() {
        return "BenhNhan : "+tiensu+","+chuandoan+", "+bv.toString()+"].";
    }
    
}
