/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

/**
 *
 * @author Admin
 */
import java.io.Serializable;

public class Student implements Serializable {
    private String code;
    private String name;
    private String dob; // dd/MM/yyyy
    private String gender;

    // Constructor không đối số
    public Student() {}

    // Constructor đầy đủ đối số
    public Student(String code, String name, String dob, String gender) {
        this.code = code;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
               "code='" + code + '\'' +
               ", name='" + name + '\'' +
               ", dob='" + dob + '\'' +
               ", gender='" + gender + '\'' +
               '}';
    }
}
