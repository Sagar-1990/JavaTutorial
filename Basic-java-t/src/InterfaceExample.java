interface driving{
    String name = "anyCar";
    void startEngine();
    void applyBreak();
}

class Car1 implements driving {
    public void startEngine(){
        System.out.println("Engine started");
    }
    public void applyBreak(){
        System.out.println("Break applied");
    }
}

public class InterfaceExample{
    public static void main(String[] args) {
        Car1 c1 = new Car1();
        c1.startEngine();
        System.out.println(c1.name);
        c1.applyBreak();

    }
}
