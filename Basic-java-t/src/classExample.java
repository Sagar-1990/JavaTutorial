public class classExample {
    
    public static void main(String[] args){

        System.out.println("Hello");
        User u1 = new User();
        u1.getData();
        u1.name="Sam";

        
    }
}

class User{
    public int data=10;
    public String name="Anil";
    public void getData(){
        System.err.println("get data");
    }
}

