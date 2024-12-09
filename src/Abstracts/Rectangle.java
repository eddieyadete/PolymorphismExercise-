package Abstracts;

public class Rectangle extends Shape {

    public Rectangle() {}
    public Rectangle(double height, double width) {
        super.height = height;
        super.width = width;
    }

    public double getArea(){
        return height * width;
    }
    public double getPerimeter(){
        return 2 * (height + width);

    }
}
