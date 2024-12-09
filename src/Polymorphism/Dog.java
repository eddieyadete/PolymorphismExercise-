package Polymorphism;

public class Dog extends Animal {
    private String name;
    public Dog(String name) {
        this.name = name;
    }
    public Dog(){    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void animalSound(){
        System.out.println("woof woof");
    }
}
