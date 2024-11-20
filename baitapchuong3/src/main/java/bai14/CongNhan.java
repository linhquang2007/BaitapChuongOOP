/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai14;

/**
 *
 * @author Admin
 */
public abstract class CongNhan extends Person {
    protected String loaiCN;

    public CongNhan() {
        
    }

    public CongNhan(String name, String ns, String place, String loaiCN) {
        super(name, ns, place);
        this.loaiCN = loaiCN;
    }
    
    public abstract double thuNhap();

    public String getLoaiCN() {
        return loaiCN;
    }

    public void setLoaiCN(String loaiCN) {
        this.loaiCN = loaiCN;
    }
    public String toString(){
        return super.toString() + "Loai cong nhan la: " + this.loaiCN;
    }
}
