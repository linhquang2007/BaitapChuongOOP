/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai7;

/**
 *
 * @author Admin
 */
public class ResizableCircle  extends Circle implements Resizable {
    public ResizableCircle(double radius){
        super(radius);
    }
    
    @Override
    public void resize(int percent) {
        System.out.println(percent);
        
    }
    public String toString(){
        return "\nRadius: " + radius + "\nPerimeter: " + getPerimeter() + "\nArea: " + getArea();
    }
    
    
    
    
    
}