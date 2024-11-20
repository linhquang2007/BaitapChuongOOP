/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {
                System.out.print("Nhập chuỗi (nhập 'DONE' để kết thúc): ");
                String input = scanner.nextLine();

                if (input.equalsIgnoreCase("DONE")) {
                    System.out.println("Kết thúc chương trình.");
                    break;
                }

                if (input.length() > 30) {
                    throw new StringTooLongException("Chuỗi quá dài: " + input);
                }

                System.out.println("Chuỗi hợp lệ: " + input);
            }
        } catch (StringTooLongException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
