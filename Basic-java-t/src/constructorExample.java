class Person{
   // String name = "Anil Sidhu";
    String name;
    Person(String data){
        //System.out.println(name);
        this.name=data;
        System.out.println(data);
    }
}


public class constructorExample {
    public static void main(String[] args){

        //String name = "Sagar";
        //Person person1=new Person(name);
        Person person1=new Person("Sagar");
        Person person2=new Person("Mohan");
        Person person3=new Person("Rohan");
        //System.out.println(person1.name);

    }
}
