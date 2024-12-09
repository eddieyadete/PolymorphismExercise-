package Polymorphism;

public class Cat extends Animal {
    private String name;

    public Cat(){}
    public Cat(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(){
        this.name = name;
    }
    @Override
    public void animalSound(){
        System.out.println("meow");
    }
}
