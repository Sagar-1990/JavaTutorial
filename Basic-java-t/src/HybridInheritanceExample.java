interface itServic{
    public void getItServicesDetails();
}

interface hardwareService{
    public void gethardwareServicesDetails();
}

class BaseCompany{
    void getBaseCompanyDetails(){
        System.out.println("Base company details printed");
    }
    public void getItServicesDetails(){
        System.out.println("get It Services Details");
    }
    public void gethardwareServicesDetails(){
        System.out.println("get It Services Details");
    }

}

class ChildCompany extends BaseCompany{

}

class LocalCompany extends ChildCompany{

}

class ShredCompany extends BaseCompany{

}


public class HybridInheritanceExample {
    public static void main(String[] args) {

        LocalCompany lc = new LocalCompany();
        ShredCompany sc = new ShredCompany();
        lc.getBaseCompanyDetails();
        sc.getBaseCompanyDetails();
        sc.getItServicesDetails();
        sc.gethardwareServicesDetails();

    }
}
