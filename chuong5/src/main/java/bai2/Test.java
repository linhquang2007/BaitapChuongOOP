/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        String[] MonArr = {
            "USD;VND;17000",
            "EUR;USD;1.2",
            "USD;IDN;15789",
            "USD;EUR;0.83",
            "CAD;IDN;16869"
        };

        Exchange exchange = new Exchange();
        for (String rateStr : MonArr) {
            String[] parts = rateStr.split(";");
            exchange.addRate(new Rate(parts[0], parts[1], Double.parseDouble(parts[2])));
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Mời nhập mã tiền tệ thứ nhất: ");
        String code1 = scanner.nextLine();
        System.out.print("Mời nhập mã tiền tệ thứ hai: ");
        String code2 = scanner.nextLine();
        System.out.print("Mời nhập lượng tiền cần chuyển đổi: ");
        double amount = scanner.nextDouble();

        double result = exchange.convert(code1, code2, amount);
        if (result != -1) {
            System.out.println("Lượng tiền sau khi đổi: " + result);
        } else {
            System.out.println("Không tìm thấy tỉ giá.");
        }
    }
}
