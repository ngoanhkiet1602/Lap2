/*
 * @(#) Rectangle.java    1.0     27/08/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved.
 */
 
package iuh.fit.se;


/*
 * @description:
 * @author: Ngo Anh Kiet
 * @date:   27/08/2024
 * @version:    1.0
 */
 
public class Rectangle {
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double newVal) throws Exception{
        if (newVal >= 0)
            this.length = length;
        else
            throw new Exception("Length must be greaterthan 0");
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double newVal) throws Exception{
        if (newVal >= 0)
            this.width = newVal;
        else
            throw new Exception("Width must be greaterthan 0");
    }

    public Rectangle(double length, double width) throws Exception {
        if(length < 0 || width < 0)
            throw new Exception("Length and width must be greater than 0");
        else {
            this.length = length;
            this.width = width;
        }
    }

    public Rectangle() {
    }
    
    public double getArea() {
        return length * width;
    }
    public double getPerimeter() {
        return (length + width) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
