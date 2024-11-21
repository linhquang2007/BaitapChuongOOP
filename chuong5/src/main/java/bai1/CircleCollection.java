/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author Admin
 */
import java.util.ArrayList;

class CircleCollection {
    private ArrayList<Circle> al = new ArrayList<>();

    public void addCircle(Circle c) {
        al.add(c);
    }

    public Circle getCircle(int pos) {
        return al.get(pos);
    }

    public void setCircle(int pos, Circle c) {
        al.set(pos, c);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Circles in Collection:\n");
        for (Circle c : al) {
            sb.append(c).append("\n");
        }
        return sb.toString();
    }

    public double calcSumArea() {
        double sum = 0;
        for (Circle c : al) {
            sum += c.getArea();
        }
        return sum;
    }

    public double findMinArea() {
        double min = Double.MAX_VALUE;
        for (Circle c : al) {
            min = Math.min(min, c.getArea());
        }
        return min;
    }

    public double findMaxArea() {
        double max = Double.MIN_VALUE;
        for (Circle c : al) {
            max = Math.max(max, c.getArea());
        }
        return max;
    }
}
