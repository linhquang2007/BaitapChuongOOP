/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author Admin
 */
public class ThoiGian {
    private int ngay;
    private int thang;
    private int nam;

    // Constructor đầy đủ, ném ra ngoại lệ InvalidDateException nếu dữ liệu không hợp lệ
    public ThoiGian(int ngay, int thang, int nam) throws InvalidDateException {
        if (ngay < 1 || ngay > 31) {
            throw new InvalidDateException("Ngày không hợp lệ: " + ngay);
        }
        if (thang < 1 || thang > 12) {
            throw new InvalidDateException("Tháng không hợp lệ: " + thang);
        }
        if (nam < 0) {
            throw new InvalidDateException("Năm không hợp lệ: " + nam);
        }
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    @Override
    public String toString() {
        return "Thời gian: " + ngay + "/" + thang + "/" + nam;
    }
}   
