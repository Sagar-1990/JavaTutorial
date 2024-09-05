interface itServices{
    public void getItServiceDetails();
}

interface hardwareServices{
    public void getHardwareServiceDetails();
}

interface allBranch{
    public void getallBranch();
}

class CompnayType implements itServices,hardwareServices, allBranch{
    public void getItServiceDetails(){
        System.out.println("get IT service Datails");
    }
    public void getHardwareServiceDetails(){
        System.out.println("get Hardware Service Details");
    }
    public void getallBranch(){
        System.out.println("get All Branch");
    }

}


public class MultipleInheritanceExample {
    public static void main(String[] args){

        CompnayType ct1 = new CompnayType();
        ct1.getallBranch();
        ct1.getHardwareServiceDetails();
        ct1.getItServiceDetails();

    }
}
