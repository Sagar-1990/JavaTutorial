public class ThrowThrowsExample {
    public static void main(String[] args){
//        try{
//            int a = 10;
//            System.out.println(10 / 0.5);
//            if (a==10) {
//                System.out.println("Hello");
//                throw new ArithmeticException("test");
//            }
//        }  catch (ArithmeticException e){
//            System.out.println("some error" + e);
//        }

        try {
            checkage();
        } catch (ArithmeticException e){
            System.out.println("Some error" + e);
        }
    }
    public static void checkage() throws ArithmeticException{
        System.out.println(18/0);
    }
}
