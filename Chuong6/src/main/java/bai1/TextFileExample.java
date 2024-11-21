/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package bai1;

/**
 *
 * @author Admin
 */
import java.io.*;
import java.util.Scanner;

public class TextFileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập dữ liệu
        System.out.print("Nhập một chuỗi ký tự: ");
        String str = scanner.nextLine();
        System.out.print("Nhập một ký tự: ");
        char ch = scanner.next().charAt(0);
        System.out.print("Nhập một số nguyên: ");
        int integer = scanner.nextInt();
        System.out.print("Nhập một số thực: ");
        double real = scanner.nextDouble();

        // Ghi dữ liệu vào file exp.txt
        try (PrintWriter writer = new PrintWriter(new FileWriter("exp.txt"))) {
            writer.println(str);
            writer.println(ch);
            writer.println(integer);
            writer.println(real);
        } catch (IOException e) {
            System.err.println("Lỗi khi ghi file: " + e.getMessage());
        }

        // Đọc dữ liệu từ file và hiển thị
        System.out.println("\nDữ liệu trong file exp.txt:");
        try (BufferedReader reader = new BufferedReader(new FileReader("exp.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Lỗi khi đọc file: " + e.getMessage());
        }
    }
}
