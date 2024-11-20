/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai10;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
import java.util.*;


public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        HocVien arr[] = new HocVien[1];
        for(int i = 0; i < n; i++){
            boolean check = false;
            String name = "", diaChi= "", loaiUuTien = "", loaiChuongTrinh = "";
            double buoi = 0.0, donGia = 0.0;
            while(!check){
                try{
                    check = true;
                    name = sc.nextLine();
                    diaChi = sc.nextLine();
                    loaiUuTien= sc.nextLine();
                    loaiChuongTrinh = sc.nextLine();
                    buoi = sc.nextDouble();
                    donGia = sc.nextDouble();
                    sc.nextLine();
                    
                }catch(Exception e){
                    System.out.println("Thong tin nhap vao bi loi!");
                    System.out.println("Nhap lai thong tin");
                    check = false;
                }
            }
            if(loaiChuongTrinh.equals("Lap Trinh")){
                arr[i] = new HocVienLT(name, diaChi, loaiUuTien, loaiChuongTrinh, buoi, donGia );
            }else{
                arr[i] =new HocVienDH(name, diaChi, loaiUuTien, loaiChuongTrinh, buoi, donGia );
            }
        }
        // In ra thong tin cua hoc vien lap trinh
        for(int i = 0; i < n; i++){
            if(arr[i] instanceof HocVienLT){
                System.out.println(arr[i]);
            }
        }
    }
}
