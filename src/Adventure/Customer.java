package Adventure;

import java.util.ArrayList;
import java.util.Arrays;

public class Customer {

    //intialize

    private String name;
    private Double money;
    private String email;
    private ArrayList<Item>  Groceries = new ArrayList<>();
    //constructor

    public Customer(String name, Double money, String email) {
        this.name = name;
        this.money = money;
        this.email = email;
    }

    //setter

    public void setName(String name) {
        this.name = name;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void addToCart(Item item) {
        this.Groceries.add(item);
        this.Groceries.get(0);
        System.out.println(item.getName() + " added");
    }

//getter

    public String getName() {
        return name;
    }

    public Double getMoney() {
        return money;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Item> deleteFromCart(Item item) {
        this.Groceries.remove(item);
        return this.Groceries;
    }

    public String getGroceries() {

        StringBuffer sb = new StringBuffer();

        for ( Item i : this.Groceries) {
            i.toString();

        }

        String str =  sb.toString();
        System.out.print(str + "iii");
        return str;
    }

    public  double ReduceMoney(Double deficit){
        this.money = this.money - deficit;
        return this.money;
    }

    public void Invoice(String message, Double deficit, String email){
        System.out.printf("\n You have been charged this amount: %.2f", deficit);
        System.out.printf("\n The Invoice has been sent to your email on file: %s ", email);
    }
    public String toString(){
        return String.format("Name of Customer: %s, He has this amount: %.2f, His e-mail is: , %s He has these groceries %s"
                , getName(), getMoney(), getEmail(), getGroceries() );
    }
}
