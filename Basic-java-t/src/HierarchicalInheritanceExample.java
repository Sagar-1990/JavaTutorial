class Users{
    void getLogin(){
        System.out.println("user Logged in");
    }

}

class StudentUsers extends Users{
    String name="Peter";
    void getMarks(){
        System.out.println("all marks printed");
    }
    void getLogin(){
        System.out.println("User Logged In");
    }
}


class TeacherUsers extends Users{
    String name="Bruce";
    void getSkill(){
        System.out.println("All skills printed");
    }
    void getLogin(){
        System.out.println("User Logged In");
    }
}

public class HierarchicalInheritanceExample {
    public static void main(String[] args) {
        TeacherUsers tu = new TeacherUsers();
        StudentUsers Su = new StudentUsers();
        tu.getLogin();
        Su.getLogin();
    }

}
