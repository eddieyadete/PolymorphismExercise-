package TypeCasting;

public class ChildClass extends Parent {
    private String address;

    public ChildClass() {
    }


    public ChildClass(String name, int age, String address) {
        super(name, age);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public void greet(){
        System.out.println("na boo boo");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("\nname: %s, \nage: %d, \naddress: %s%n", this.getName(), this.getAge(), this.getAddress());
    }
}
