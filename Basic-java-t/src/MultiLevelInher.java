class  Company{
    void getTotalEmployee(){
        System.out.println("Total Employees are 1000");
    }
}

class CountryBranch extends Company{
    void totalEmpInCountry(){
        System.out.println("Ttotal employees are 500");
    }
}

class LocalBranch extends CountryBranch{

    void totalLocalEmp(){
        System.out.println("Total employees are 100");
    }
}




public class MultiLevelInher {

    public static void main(String[] args){
        LocalBranch lb = new LocalBranch();
//        lb.totalLocalEmp();
//        lb.totalEmpInCountry();
//        lb.getTotalEmployee();

        CountryBranch cb = new CountryBranch();
        cb.totalEmpInCountry();
        cb.getTotalEmployee();

    }
}
