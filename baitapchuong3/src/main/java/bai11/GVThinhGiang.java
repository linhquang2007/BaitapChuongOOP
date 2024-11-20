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

public class GVThinhGiang extends GiangVien{
    private int soTietDay;
    private int donGia;
    public GVThinhGiang() {
        
    }
    public GVThinhGiang( String name, String place, String loaiGV, int soTietDay, int donGia) {
        super(name, place, loaiGV);
        this.soTietDay = soTietDay;
        this.donGia = donGia;
    }
    public GVThinhGiang(int soTietDay, int donGia) {
        this.soTietDay = soTietDay;
        this.donGia = donGia;
    }
    public int  thuNhap(){
        return this.donGia * soTietDay;
    }
    @Override
    public double tinhLuong() {
        return thuNhap() - thuNhap() * 15 /100;
    }
    @Override
    public String toString() {
        return super.toString() + "GVThinhGiang [soTietDay=" + soTietDay + ", donGia=" + donGia  +  "Thu Nhap: " + tinhLuong() + "]";
    }    
    
    
}
