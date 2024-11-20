/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai8;

/**
 *
 * @author Admin
 */
public class Rectangle extends Shape {
    private int length, width;

    public Rectangle() {
        super();
    }

    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }
    
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public double getPerimeter() {
       return 2 * ( this.length + this.width);
    }

    @Override
    public String toString() {
        return "Rectangle [length=" + length + ", width=" + width + ", toString()=" + super.toString() + "]";
    }
    
    
}
