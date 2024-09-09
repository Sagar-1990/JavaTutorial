class User3{
    User3 login(){
        System.out.println("Login in User");
        return this;
    }
}

class Client extends User3{

    @Override
    Client login(){
        System.out.println("Client Login");
        return this;
    }
}


public class CovariantExample {
    public static void main(String[] args) {
    Client c1 = new Client();
    c1.login();
    User3 u1 = new User3();
    u1.login();

    }
}
