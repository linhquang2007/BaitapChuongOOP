/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

/**
 *
 * @author Admin
 */
import java.io.*;
import java.util.ArrayList;

public class StudentFileExample {
    public static void main(String[] args) {
        // Tạo danh sách sinh viên
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("S01", "Nguyen Van A", "01/01/2000", "Nam"));
        students.add(new Student("S02", "Tran Thi B", "05/05/2001", "Nữ"));

        // Ghi danh sách sinh viên vào file student.dat
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.dat"))) {
            oos.writeObject(students);
        } catch (IOException e) {
            System.err.println("Lỗi khi ghi file: " + e.getMessage());
        }

        // Đọc danh sách sinh viên từ file student.dat và hiển thị
        System.out.println("Dữ liệu trong file student.dat:");
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.dat"))) {
            ArrayList<Student> readStudents = (ArrayList<Student>) ois.readObject();
            for (Student student : readStudents) {
                System.out.println(student);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Lỗi khi đọc file: " + e.getMessage());
        }
    }
}
