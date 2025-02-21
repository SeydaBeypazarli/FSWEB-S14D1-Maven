package com.workintech.pool;

public class Rectangle {
    private double width;
    private double length;

    // Constructor
    public Rectangle(double width, double length) {
        setWidth(width);
        setLength(length);
    }

    // Setter for width
    public void setWidth(double width) {
        this.width = (width < 0) ? 0 : width;
    }

    // Setter for length
    public void setLength(double length) {
        this.length = (length < 0) ? 0 : length;
    }

    // Getter for width
    public double getWidth() {
        return width;
    }

    // Getter for length
    public double getLength() {
        return length;
    }

    // Method to calculate area
    public double getArea() {
        return width * length;
    }
}
