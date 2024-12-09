package Abstracts;

public abstract class Shape {
    protected double height;
    protected double width;
    protected double area;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public abstract double getArea();
    public abstract double getPerimeter();




}
