class User2{
    void getLogin(){
        System.out.println("User Login");
    }
}

class Emp1 extends User2{
    void getLogin(String name){
        System.out.println(name +" "+"Emp Login");
    }
}


public class MethodOverridingExample2{
    public static void main(String[] args){
        Emp1 e1 = new Emp1();
        e1.getLogin("Rohan");
    }

}
