/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person person = new Person();
        
        System.out.println("Nhap ten : ");
        person.setname(sc.nextLine());
        
        System.out.println("Nhap ngay sinh : ");
        person.setDob(sc.nextLine());
        
        System.out.println("Nhap noi sinh : ");
        person.setPob(sc.nextLine());
        
        System.out.println("Nhap gioi tinh(M/N) : ");
        person.setGender(sc.nextLine().charAt(0));
        
        System.out.println("Nhap email : ");
        person.setEmail(sc.nextLine());
        
        System.out.println("Nhap phone : ");
        person.setPhone(sc.nextLine());
        //dong scanner de khong loi 
        sc.close();
        
        System.out.println(person.toString());
    }
}
