public class PrintVsReturn {
    public static void main(String[] args){

        int data = getData();
        System.out.println(data);
        String name = getName();
        System.out.println(name);
    }
    public static int getData(){
        return 100;
    }

    public static String getName(){
        return "Abhishek Sagar";
    }
}
