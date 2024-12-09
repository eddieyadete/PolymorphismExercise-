package interfaces;

public class car implements Vehicle{
    private String name;

    public car(String name) {
        this.name = name;
    }
        public String getName() {
        return name;
        }
        public void setName(String name) {
        this.name = name;
        }

    @Override
    public void start() {
        System.out.println(getName() + " car is starting");
    }

    @Override
    public void stop() {
        System.out.println(getName() + " car is stopping");
    }
}
