abstract class Android{
    void goodFeature(){
        System.out.println("Android OS provides a lot of good features");
    }

    abstract void makeYourUI();
}

class AnySmartPhone extends Android{

    void makeYourUI(){
        System.out.println("Smartphone company has own UI");
    }
}

public class AbstractClassExmple {
    public static void main(String[] args) {
        AnySmartPhone a1 = new AnySmartPhone();
        a1.makeYourUI();
        a1.goodFeature();

    }
}
