/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai14;

/**
 *
 * @author Admin
 */
public class CNKSP extends CongNhan{
    private int soSP, donGia;
    public CNKSP(){
        super();
    }
    public CNKSP(String name, String ns, String place, String loaiCN, int soSP, int donGia) {
        super(name, ns, place, loaiCN);
        this.soSP = soSP;
        this.donGia = donGia;
    }
    public double thuong(){
        if(this.soSP >= 1150){
            return 1500000;
        }else if(this.soSP > 1100){
            return 1000000;
        }else{
            return 0;
        }
    }
    @Override
    public double thuNhap() {
        return this.soSP * this.donGia + thuong();
    }
    public String toString(){
        return super.toString() + "So San Pham: " + this.soSP + "Don Gia: " + this.donGia + "Thu Nhap: " + thuNhap();
    }
}