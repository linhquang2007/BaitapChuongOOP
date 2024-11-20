/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai8;

/**
 *
 * @author Admin
 */
public class Triangle extends Shape{
    private int base, height;
    
    public Triangle() {
        super();
    }

    public Triangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }
    
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.base * this.height / 2;
    }

    @Override
    public double getPerimeter() {
        return this.base + this.height;
    }

    @Override
    public String toString() {
        return "Triangle [base=" + base + ", height=" + height + ", toString()=" + super.toString() + "]";
    }
    
}