package Questions;

public class Customer
{
    String customerID = "customerID";
    String customerName = "CustomerName";
    Long contactNumber = 44444442111L;
    String address = "";


    public Customer(String customerID, String customerName, Long contactNumber, String address) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.contactNumber = contactNumber;
        this.address = address;
    }



    public void displayCustomerName(){
        System.out.println("The customer name is "+this.customerName);
    }

    public void displayCustomerDetails(){
        System.out.println("His address is"+ this.address +" his ID is %s, and his number is %s");
    }
}
