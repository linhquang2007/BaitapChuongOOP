/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author Admin
 */
import java.util.ArrayList;

class Exchange {
    private ArrayList<Rate> rates = new ArrayList<>();

    public void addRate(Rate rate) {
        rates.add(rate);
    }

    public double convert(String code1, String code2, double amount) {
        for (Rate rate : rates) {
            if (rate.getCode1().equals(code1) && rate.getCode2().equals(code2)) {
                return amount * rate.getRate();
            }
        }
        return -1; // Không tìm thấy tỉ giá
    }
}
