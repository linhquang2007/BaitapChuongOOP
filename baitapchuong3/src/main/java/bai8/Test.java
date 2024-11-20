/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai8;

/**
 *
 * @author Admin
 */
import java.util.*;
import java.util.Comparator;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        Shape[] arr = new Shape[n];
        for(int i = 0; i < 5; i++){
            boolean check = false;
            
            while(!check){
                try{
                    check = true;
                    char c =  sc.nextLine().charAt(0);
                    if(c == 'R'){
                        String color = sc.nextLine();
                        int length = sc.nextInt();
                        int width = sc.nextInt();
                        arr[i]= new Rectangle(color , length, width);
                    }else{
                        String color = sc.nextLine();
                        int base = sc.nextInt();
                        int height = sc.nextInt();
                        arr[i] = new Triangle(color, base, height);
                    }
                    sc.nextLine();
                }catch(Exception e){
                    check = false;
                    System.out.println("Nhap sai du lieu!");
                    System.out.println("Nhap lai du lieu");

                }
            }
        }
        // In ra cac hinh la hinh chu nhat

        for(int i = 0; i< 5; i++){
            if(arr[i] instanceof Rectangle){
                System.out.println(arr[i]);
            }
        }

    }
}
