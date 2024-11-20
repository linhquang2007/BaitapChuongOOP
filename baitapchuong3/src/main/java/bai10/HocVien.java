/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai10;

/**
 *
 * @author Admin
 */
public abstract class HocVien {
    protected String name, diachi, loaiUuTien, LoaiChuongTrinh;
   
    
    public HocVien() {
    }

    public HocVien(String name, String diachi, String loaiUuTien, String loaiChuongTrinh) {
        this.name = name;
        this.diachi = diachi;
        this.loaiUuTien = loaiUuTien;
        LoaiChuongTrinh = loaiChuongTrinh;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getLoaiUuTien() {
        return loaiUuTien;
    }

    public void setLoaiUuTien(String loaiUuTien) {
        this.loaiUuTien = loaiUuTien;
    }

    public String getLoaiChuongTrinh() {
        return LoaiChuongTrinh;
    }

    public void setLoaiChuongTrinh(String loaiChuongTrinh) {
        LoaiChuongTrinh = loaiChuongTrinh;
    }

    public abstract double tienHocPhi();

    @Override
    public String toString() {
        return "HocVien [name=" + name + ", diachi=" + diachi + ", loaiUuTien=" + loaiUuTien + ", LoaiChuongTrinh="
                + LoaiChuongTrinh + "]";
    }
    
    
}
