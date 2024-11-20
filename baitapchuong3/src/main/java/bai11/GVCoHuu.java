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

public class GVCoHuu extends GiangVien{
    
    private int ngayLuong;
    private int bacLuong;
    private int thamnien;
    public GVCoHuu() {
    }
    
    public GVCoHuu( String name, String place, String loaiGV, int ngayLuong, int bacLuong, int thamniem) {
        super( name, place, loaiGV);
        this.ngayLuong = ngayLuong;
        this.bacLuong = bacLuong;
        this.thamnien = thamnien;
    }

    public int phuCap(){
        int percent = 0;
        if(thamnien > 5){
            percent = thamnien;
        }
        return ngayLuong * bacLuong * percent / 100;
    }
    @Override
    public double tinhLuong() {
        return ngayLuong * bacLuong + phuCap();
    }
    public String toString(){
        return super.toString() + " " + "Ngay Luong: " + this.ngayLuong + " " + "Bac Luong: " + this.bacLuong + "Thu Nhap: " + tinhLuong();
    }
}