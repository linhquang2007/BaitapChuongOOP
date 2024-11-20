/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai11;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public abstract class GiangVien {
    Scanner sc = new Scanner(System.in);
    protected String name, place, loaiGV;
    
    public GiangVien() {
    }
    public GiangVien(String name, String place, String loaiGV) {
       
        this.name = name;
        this.place = place;
        this.loaiGV = loaiGV;
    }
    
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPlace() {
        return place;
    }
    public void setPlace(String place) {
        this.place = place;
    }
    public String getLoaiGV() {
        return loaiGV;
    }
    public void setLoaiGV(String loaiGV) {
        this.loaiGV = loaiGV;
    }
    public void nhapThongTin(){
        name = sc.nextLine();
        place = sc.nextLine();
        loaiGV = sc.nextLine();
    }
    public abstract double tinhLuong();
    public String inThongTin(){
        return "Name: " + name + "Dia Chi: " + place + "loaiGV: " + loaiGV;
    }
}