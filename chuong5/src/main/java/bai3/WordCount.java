/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

/**
 *
 * @author Admin
 */
import java.util.HashMap;

class WordCount {
    public static void main(String[] args) {
        String text = "learn java by example guide to advance java example of distributed in java";
        String[] words = text.split(" ");
        HashMap<String, Integer> wordMap = new HashMap<>();

        for (String word : words) {
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }

        int totalWords = 0;
        for (String word : wordMap.keySet()) {
            System.out.println(word + ": " + wordMap.get(word));
            totalWords += wordMap.get(word);
        }

        System.out.println("Total words: " + totalWords);
    }
}
