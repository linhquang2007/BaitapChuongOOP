/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai6;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Employee extends Person {
    private String employerName;
    private String dateHired;
    
    public Employee(){};
    
    public Employee(String name, int age, char gender, String employerName, String dateHired){
        super(name, age, gender);
        this.employerName = employerName;
        this.dateHired = dateHired;
    }

    public String getDateHired() {
        return dateHired;
    }

    public String getEmployerName() {
        return employerName;
    }

    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }
    Scanner sc = new Scanner(System.in);
    Person p = new Person();
    public void input(){
        System.out.println("Nhap name : "); p.setName(sc.nextLine());
        System.out.println("Nhap tuoi : "); p.setAge(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap gender : "); p.setGender(sc.nextLine().charAt(0));
        System.out.println("Nhap ma NV: "); setEmployerName(sc.nextLine());
        System.out.println("Nhap ngay work cua NV: "); setDateHired(sc.nextLine());
    }
    @Override
    public String toString() {
        return "Employee: "+super.toString()+","+employerName+","+dateHired+".";
    }
    
    
    
}
