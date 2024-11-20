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
public class PtEmployee extends Employee{
    private int hoursPerWeek;
    
    public PtEmployee(){
        super();
    }
    public PtEmployee(String name, int age, char gender, String employerName, String dateHired, int hoursPerWeek){
        super(name, age, gender,employerName, dateHired);
        this.hoursPerWeek = hoursPerWeek;
    }

    public int getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(int houresPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }
    Scanner sc = new Scanner(System.in);
    Employee e = new Employee();
    public void input(){
        e.input();
        System.out.println(" Nhap gio lam viec trong 1 tuan : ");
        setHoursPerWeek(sc.nextInt());
    }
    
    @Override
    public String toString() {
        return super.toString()+" PartimeEmployee"+hoursPerWeek;
    }
    
}
