class UserParent{
    final void getName(){
        System.out.println("Name is anil");
    }
}

class Userss extends UserParent{
    final String name = "anil";

//    void getName(){
//        System.out.println("Name is sidhu");
//    }
}

public class finalkeywordExample {
    public static void main(String[] args){
        Userss U1 = new Userss();
        U1.getName();
//        System.out.println(U1.name);

    }
}
