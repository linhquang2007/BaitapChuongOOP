/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package bai1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try{
            System.out.println("Nhap so nguyen thu nhat : ");
            int a = sc.nextInt();
            System.out.println("Nhap so nguyen thu hai : ");
            int b = sc.nextInt();
            System.out.println("Nhap so nguyen thu ba : ");
            int c = sc.nextInt();
        }catch(ArithmeticException e){
            System.out.println("Loi : Khong the chia cho 0!");
        }catch(Exception e){
            System.out.println("Loi : Nhap vao du lieu!");
        }finally{
            sc.close();
        }
    }
}
