import java.util.LinkedList;

class LinkedLImport{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);
        list.addFirst("this");
        list.addLast("list");
        System.out.println(list);

        System.out.println(list.size());

        for(int i=0; i<list.size(); i++){
//            if(list.get(1)=="iso") {
//                System.out.println("found");
//                break;
//            }else {
//                System.out.print("not found");
//                break;
//            }
            System.out.print(list.get(i)+" -> ");
        }
        System.out.println("null");

        list.removeFirst();
        System.out.println(list);

    }

}
