/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Nhập ngày, tháng, năm
            System.out.print("Nhập ngày: ");
            int ngay = scanner.nextInt();

            System.out.print("Nhập tháng: ");
            int thang = scanner.nextInt();

            System.out.print("Nhập năm: ");
            int nam = scanner.nextInt();

            // Tạo đối tượng ThoiGian
            ThoiGian thoiGian = new ThoiGian(ngay, thang, nam);
            System.out.println(thoiGian);

        } catch (InvalidDateException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Lỗi: Dữ liệu nhập không hợp lệ.");
        } finally {
            scanner.close();
        }
    }
}
