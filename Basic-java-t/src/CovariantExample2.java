class Animal1 {
    // Method with a general return type (Animal)
    Animal1 getAnimal() {
        System.out.println("Returning an Animal");
        return new Animal1();
    }
}
class Dog2 extends Animal1 {
    // Overridden method with a covariant return type (Dog)
    @Override
    Dog2 getAnimal() {
        System.out.println("Returning a Dog");
        return new Dog2();
    }
}

public class CovariantExample2{
    public static void main(String[] args) {
        Animal1 animal = new Animal1();
        animal.getAnimal();  // Calls the parent class method

        Dog2 dog = new Dog2();
        dog.getAnimal();      // Calls the child class method with covariant return type
    }
}

