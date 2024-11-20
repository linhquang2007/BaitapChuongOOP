/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4;

/**
 *
 * @author Admin
 */
public class BenhVien {
    private String ten;
    private String diachi;
    private String giamdoc;
    
    //constructor;
    public BenhVien(){};
    public BenhVien(String ten, String diachi, String giamdoc){
        this.ten = ten;
        this.diachi = diachi;
        this.giamdoc = giamdoc;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setGiamdoc(String giamdoc) {
        this.giamdoc = giamdoc;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getDiachi() {
        return diachi;
    }

    public String getGiamdoc() {
        return giamdoc;
    }

    public String getTen() {
        return ten;
    }

    @Override
    public String toString() {
        return "Benh Vien["+ten+", "+diachi+", "+giamdoc+"]";
    }
    
}
