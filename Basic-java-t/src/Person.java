public class Person {
    // Properties (attributes)
    String name;
    int age;

    // Method to display person's details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Method to set person's details
    public void setDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        // Creating an object of the Person class
        Person person1 = new Person();

        // Setting the details of the person
        person1.setDetails("Alice", 30);

        // Displaying the details of the person
        person1.displayDetails(); // Output: Name: Alice, Age: 30
    }
}
