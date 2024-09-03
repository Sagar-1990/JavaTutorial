interface driving{
    String name = "anyCar";
    void startEngine();
    void applyBreak();
}

class Car implements driving {
    public void startEngine(){
        System.out.println("Engine started");
    }
    public void applyBreak(){
        System.out.println("Break applied");
    }
}

public class InterfaceExample{
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.startEngine();
        System.out.println(c1.name);
        c1.applyBreak();

    }
}
