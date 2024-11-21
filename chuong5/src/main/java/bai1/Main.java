/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author Admin
 */
import java.util.Random;

class Main {
    public static void main(String[] args) {
        CircleCollection cc = new CircleCollection();
        Random rand = new Random();

        // Tạo danh sách hình tròn với bán kính ngẫu nhiên
        for (int i = 0; i < 5; i++) {
            double radius = 1 + rand.nextDouble() * 10; // Bán kính từ 1 đến 10
            cc.addCircle(new Circle(radius));
        }

        // Hiển thị thông tin
        System.out.println(cc);

        // Tổng diện tích
        System.out.println("Tổng diện tích: " + cc.calcSumArea());

        // Diện tích lớn nhất
        System.out.println("Diện tích lớn nhất: " + cc.findMaxArea());

        // Tìm hình tròn có diện tích nhỏ nhất
        double minArea = cc.findMinArea();
        for (int i = 0; i < 5; i++) {
            if (cc.getCircle(i).getArea() == minArea) {
                System.out.println("Hình tròn có diện tích nhỏ nhất: " + cc.getCircle(i) + " (Vị trí: " + i + ")");
                break;
            }
        }
    }
}
