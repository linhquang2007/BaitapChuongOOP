/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập lương: ");
            double salary = scanner.nextDouble();

            if (salary < 5000000 || salary > 20000000) {
                throw new OutOfRangeException("Lương không hợp lệ: " + salary);
            }

            System.out.println("Lương hợp lệ: " + salary);

        } catch (OutOfRangeException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Lỗi: Dữ liệu nhập không hợp lệ.");
        } finally {
            scanner.close();
        }
    }
}
