class Vehicle {
    int maxSpeed;

    // Constructor of the parent class
    Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        System.out.println("Vehicle constructor called. Max Speed: " + maxSpeed);
    }
}

class Car extends Vehicle {
    String model;

    // Constructor of the child class
    Car(String model, int maxSpeed) {
        super(maxSpeed);  // Call to parent class constructor
        this.model = model;
    }

    public void display() {
        System.out.println("Car model: " + model);
        System.out.println("Car max speed: " + maxSpeed);
    }
}


public class SuperExample2 {
    public static void main(String[] args) {
        Car car = new Car("Sedan", 180);  // Calls Car constructor, which in turn calls Vehicle constructor
        car.display();
    }
}

