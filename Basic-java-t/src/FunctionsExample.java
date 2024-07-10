public class FunctionsExample {
    public static void main(String[] args){
        //System.out.println("Hello");
        FunctionsExample fe=new FunctionsExample();
        fe.SayHello();

        Welcome();      // No need to define function variable if function in same class

        int anil =20;
        int sam =30;
         getDaysFromAge(anil);
         getDaysFromAge(sam);

    }

    public void SayHello(){
        System.out.println("Hello from Sagar");

    }

    public static void Welcome(){
        System.out.println("welcome Abhishek");
    }

    public static void getDaysFromAge(int age) {
        int totalNumberofDays = age*365;
        System.out.println("User age in days is = " +totalNumberofDays);
    }
}
