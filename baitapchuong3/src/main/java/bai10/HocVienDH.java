/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai10;

/**
 *
 * @author Admin
 */
public class HocVienDH extends HocVien{
    protected double soBuoi;
    protected double donGia;
    
    public HocVienDH() {
        super();
    }

    public HocVienDH(String name, String diachi, String loaiUuTien, String loaiChuongTrinh, double soBuoi,
            double donGia) {
        super(name, diachi, loaiUuTien, loaiChuongTrinh);
        this.soBuoi = soBuoi;
        this.donGia = donGia;
    }
    public double getUuTien(){
        if(loaiUuTien == "loai 1"){
            return 1000000;
        }else{
            return 800000;
        }
    }
    @Override
    public double tienHocPhi() {
        return this.soBuoi * this.donGia - getUuTien();
    }

    @Override
    public String toString() {
        return super.toString() + "HocVienDH [soBuoi=" + soBuoi + ", donGia=" + donGia + "Hoc Phi: " + tienHocPhi() +"]";
    }
    
}
