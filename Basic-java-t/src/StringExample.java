public class StringExample {
    public static void main(String[] args){

        String str = "Hello How are you Sagar";
        System.out.println(str.length());
        System.out.println(str.substring(10));
        System.out.println(str.substring(5,11));
        System.out.println(str.replace("Hello","Hi"));
        System.out.println(str.isEmpty());

        char[] chArray={'S','A','G','A','R'};
        String str2 = new String(chArray);
        System.out.println(str2);
    }
}
