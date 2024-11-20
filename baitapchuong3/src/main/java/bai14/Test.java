/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai14;

/**
 *
 * @author Admin
 */
import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Nhap so luong cong nhan
        int n = sc.nextInt();
        CongNhan[]  arr = new CongNhan[n];
        for(int i = 0; i < n; i++){
            
            String name="", ns="", place="" , loaiCN="";
            int soSP= 0, donGia=0, luongCB=0, heSL=0, soNC=0;
            boolean check = false;
            
            while(!check){
                try{
                    check = true;
                    sc.nextLine();
                    name = sc.nextLine();
                    ns = sc.nextLine();
                    place = sc.nextLine();
                    loaiCN = sc.nextLine();
                    if(loaiCN.equals("CNKSP")){
                        soSP = sc.nextInt();
                        donGia = sc.nextInt();
                        
                    }else{
                        luongCB = sc.nextInt();
                        heSL = sc.nextInt();
                        soNC = sc.nextInt();
                    }
                    
                }catch(Exception e){
                    check = false;
                    System.out.println("Nhap sai du lieu!");
                    System.out.println("Nhap lai du lieu!");
                }
            }
            if(loaiCN.equals("CNKSP")){
                CNKSP x = new CNKSP(name, ns, place, loaiCN, soSP, donGia);
                arr[i] = x;
            }else{
                CNTCN x = new CNTCN(name, ns, place, loaiCN, luongCB, heSL, soNC);
                arr[i] = x;
            }
        }
        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
    }
}
