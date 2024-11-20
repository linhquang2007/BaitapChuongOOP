/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4;

/**
 *
 * @author Admin
 */
public class Nguoi {
    private String ten;
    private String tuoi;
    private char gioitinh;
    
    public Nguoi(){};
    public Nguoi(String ten, String tuoi, char gioitinh){
        super();
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioitinh = gioitinh;
    }

    public String getTen() {
        return ten;
    }

    public String getTuoi() {
        return tuoi;
    }

    public char getGioitinh() {
        return gioitinh;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public void setGioitinh(char gioitinh) {
        this.gioitinh = gioitinh;
    }

    @Override
    public String toString() {
        return "Nguoi:"+ten+ ","+tuoi+", "+gioitinh+".";
    }
}
