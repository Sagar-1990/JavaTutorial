import javax.sound.midi.Soundbank;

class Animal{
    int age = 5;

    void sleep(){
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal{
    void doSomething1(){
        super.sleep();
        System.out.println(super.age);
    }
}

public class SuperExample {
    public static void main(String[] args) {


    Dog d1 = new Dog();
    d1.doSomething1();
}
}
