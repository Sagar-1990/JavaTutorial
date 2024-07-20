public class BreakAndContinue {
    public static void main(String[] args){
        System.out.println("BreakAndContinue");

        int val = 7;
        for(int x=1;x<=10;x++){
            if(x==val){
                break;       // Exit the loop when i is 7
            }
            System.out.println("x: "+x);
        }
        System.out.println("Loop exited.");

        for(int y=0;y<=10;y++){
            if(y==val){
                continue;   // Skip the iteration when i is 7
            }
            System.out.println("y: "+y);
        }
        System.out.println("Loop completed.");
    }
}
