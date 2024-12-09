import Polymorphism.Animal;
import Polymorphism.Cat;
import Polymorphism.Dog;
import Abstracts.Circle;
import Abstracts.Rectangle;
import Abstracts.Shape;
import TypeCasting.ChildClass;
import TypeCasting.Parent;
import interfaces.Bike;
import interfaces.Vehicle;
import interfaces.car;

public class Main {
    public static void main(String[] args) {

        //task 1: Object Type casting
        Parent objParent = new Parent();
        objParent.greet();
        Parent objChild=new ChildClass();
        objChild.greet();
//        TypeCasting.Parent parent = new TypeCasting.ChildClass("juju", 23, "123 dallas dr, dallas 75098");
//        parent.displayInfo();
//        parent.greet();

        //Task 2 Polymorphism
        Animal objDog=new Dog();
        Animal objCat=new Cat();
        objDog.animalSound();
        objCat.animalSound();
        //
        //Task3 checking the instanceOf operator
        System.out.println(objDog instanceof Animal);
        System.out.println(objCat instanceof Animal);
        System.out.println(objDog instanceof Dog);
        System.out.println(objCat instanceof Cat);

        //Task 4 Abstraction
        Shape objCircl = new Circle(100);
        System.out.println(objCircl.getArea());
        System.out.println(objCircl.getPerimeter());
        Shape objRectangle = new Rectangle(12,24);
        System.out.println(objRectangle.getArea());
        System.out.println(objRectangle.getPerimeter());

        //Task3 interfaces

        Vehicle objCar = new car("zoom");
        objCar.start();
        objCar.stop();
        Vehicle objBike = new Bike();
        objBike.start();
        objBike.stop();
    }
    /**
     * **************************outputs**********************************
     * "C:\Program Files\J
     * boooo
     * na boo boo
     * woof woof
     * meow
     * true
     * true
     * true
     * true
     * 31415.926535897932
     * 628.3185307179587
     * 288.0
     * 72.0
     * zoom car is starting
     * zoom car is stopping
     * Bike is running
     * Bike is stopped
     *
     * Process finished with exit code 0
     */
}