/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Address {
     private String thon;
    private String xa;
    private String huyen;
    private String tinh;
    
    public Address(){};
    public Address(String thon, String xa, String huyen, String tinh){
        this.thon = thon;
        this.xa = xa;
        this.huyen =huyen;
        this.tinh = tinh;
    }

    public String getHuyen() {
        return huyen;
    }

    public String getThon() {
        return thon;
    }

    public String getXa() {
        return xa;
    }

    public String getTinh() {
        return tinh;
    }

    public void setHuyen(String huyen) {
        this.huyen = huyen;
    }

    public void setThon(String thon) {
        this.thon = thon;
    }

    public void setTinh(String tinh) {
        this.tinh = tinh;
    }

    public void setXa(String xa) {
        this.xa = xa;
    }

    @Override
    public String toString() {
        return "Dia Chi[ thon: "+thon+", xa: "+xa+", huyen :"+huyen+", tinh: "+tinh+"]";
    }
}
