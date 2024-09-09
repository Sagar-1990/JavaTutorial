class Emp{
    void getName(){
        System.out.println("Get Name method without argument");
    }
    void getName(String name){
        System.out.println(name);
    }
    void getName(String fName, String lName){
        System.out.println(fName +" "+ lName);
    }
    void getAge(int age){
        System.out.println("int age: " +age);
    }
    void getAge(String age){
        System.out.println("String age: " + age);
    }
}




public class OverloadingExample {
    public static void main(String[] args){
        Emp e1 = new Emp();
//        e1.getName();
        e1.getName("Rohan");
        e1.getName("rohan","kumar" );
//        e1.getAge(25);
        e1.getAge("25");
    }
}
