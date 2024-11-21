/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4;

/**
 *
 * @author Admin
 */
import java.util.HashMap;
import java.util.Scanner;

class Dictionary {
    private HashMap<String, String> dict = new HashMap<>();

    public Dictionary() {
        dict.put("apple", "quả táo");
        dict.put("ball", "quả bóng");
        dict.put("cat", "con mèo");
        dict.put("dog", "con chó");
        dict.put("elephant", "con voi");
        dict.put("fish", "con cá");
        dict.put("gift", "món quà");
        dict.put("home", "nhà");
    }

    public String lookup(String word) {
        return dict.getOrDefault(word, "không tìm thấy");
    }
}

class TestDictionary {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Mời nhập từ cần tra: ");
            String word = scanner.nextLine();
            if (word.isEmpty()) break;

            System.out.println("Nghĩa của từ là: " + dictionary.lookup(word));
        }
    }
}
