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
public class SinhVien extends Nguoi{
    private String lop;
    private String nganh;
    private Truong truong;
    
    public SinhVien(String ten,int tuoi, char gioitinh, String lop, String nganh, Truong truong){
        super(ten,tuoi, gioitinh);
        this.lop = lop;
        this.nganh = nganh;
        this.truong = truong;
    }

    public SinhVien() {
    }

    public String getLop() {
        return lop;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public Truong getTruong() {
        return truong;
    }

    public void setTruong(Truong truong) {
        this.truong = truong;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        
        Nguoi n = new Nguoi();
        Truong school = new Truong();
        
        n.input();
//        System.out.println("Nhap ten nguoi: "); n.setTen(sc.nextLine());
//        System.out.println("Nhap tuoi nguoi : "); n.setTuoi(sc.nextInt());
//        System.out.println("Nhap gioi tinh : "); n.setGioitinh(sc.nextLine().charAt(0));
        System.out.println("Nhap lop : "); lop = sc.nextLine();
        System.out.println("Nhap nganh : "); nganh= sc.nextLine();
        System.out.println("Nhap truong : "); school.input();
    }   

    @Override
    public String toString() {
        return " SinhVien: "+lop+", "+nganh+", "+ truong+", "+super.toString();
    }
    
}
