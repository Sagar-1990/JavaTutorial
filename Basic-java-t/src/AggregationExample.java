class Address{
String houseNo;
String city;
String country;

public Address(String houseNo, String city, String country){
    this.houseNo = houseNo;
    this.city = city;
    this.country = country;
}
public void displayAddress(){
    System.out.println(this.houseNo +" "+ this.city +" "+ this.country);
}
}

class Customer{
String name;

public Customer(String name){
this.name = name;

}

public void displayDetails(){
System.out.println(this.name);

}
}



public class AggregationExample {
    public static void main(String[] args){
        Address a1 = new Address("House no.123", "Gurgaon", "India");
        Customer e1 = new Customer("Sagar");
        e1.displayDetails();
        a1.displayAddress();
    }
}
