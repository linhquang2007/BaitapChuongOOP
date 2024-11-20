/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai10;

/**
 *
 * @author Admin
 */
public class HocVienLT extends HocVien{
    protected double soBuoi;
    protected double donGia;
    
    public HocVienLT() {
        
    }

    public HocVienLT(String name, String diachi, String loaiUuTien, String loaiChuongTrinh, double soBuoi,
            double donGia) {
        super(name, diachi, loaiUuTien, loaiChuongTrinh);
        this.soBuoi = soBuoi;
        this.donGia = donGia;
    }

    public double getUuTien(){
        if(loaiUuTien == "loai 1"){
            return 1000000;
        }else{
            return 500000;
        }
    }
    @Override
    public double tienHocPhi() {
        return this.soBuoi * donGia - getUuTien();
    }

    @Override
    public String toString() {
        return  super.toString()+ "HocVienLT [soBuoi=" + soBuoi + ", donGia=" + donGia + "Tien hoc phi: " + tienHocPhi() + "]";
    }
    
    
}
