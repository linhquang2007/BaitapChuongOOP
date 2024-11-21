/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author Admin
 */
import java.io.*;
import java.util.Scanner;

public class BinaryFileExample {
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

        // Ghi dữ liệu vào file exp.dat
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("exp.dat"))) {
            dos.writeUTF(str);
            dos.writeChar(ch);
            dos.writeInt(integer);
            dos.writeDouble(real);
        } catch (IOException e) {
            System.err.println("Lỗi khi ghi file: " + e.getMessage());
        }

        // Đọc dữ liệu từ file và hiển thị
        System.out.println("\nDữ liệu trong file exp.dat:");
        try (DataInputStream dis = new DataInputStream(new FileInputStream("exp.dat"))) {
            System.out.println("Chuỗi ký tự: " + dis.readUTF());
            System.out.println("Ký tự: " + dis.readChar());
            System.out.println("Số nguyên: " + dis.readInt());
            System.out.println("Số thực: " + dis.readDouble());
        } catch (IOException e) {
            System.err.println("Lỗi khi đọc file: " + e.getMessage());
        }
    }
}
