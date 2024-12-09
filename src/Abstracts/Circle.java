package Abstracts;

public class Circle extends Shape {
    protected double radius;
    private final double PI = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double height, double width) {
        super.height = height;
        super.width = width;

    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getPerimeter(){
        return 2 * PI * radius;
    }
}
