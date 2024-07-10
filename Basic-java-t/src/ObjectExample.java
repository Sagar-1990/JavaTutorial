public class ObjectExample {
    
    public static void main(String[] args){

        System.out.println("ObjectExample");
        Student s1 = new Student();
        System.out.println(s1.getName());
        s1.displayNmae();
        System.out.println(s1.dafaultAge);

        Teacher t1 = new Teacher();
        String tName = "Sagar";
        t1.displayNmae(tName);


    }
}

class Student{
    int dafaultAge=18;
    String getName(){
        return "Anil Sidhu";
    }
    void displayNmae(){
        System.out.println("Anil sidhu in display function");
    }
}

class Teacher{
    void displayNmae(String name){
        System.out.println(name);
    }
}
