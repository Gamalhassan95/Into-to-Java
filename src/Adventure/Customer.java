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
        if(getMoney() >= item.getPrice()) {
            this.Groceries.add(item);
            this.Groceries.get(0);
            System.out.println(item.getName() + " added");
            ReduceMoney(item.getPrice());
        }
        else {
            System.out.printf("You do not have enough money, you only have, %.2f\n", getMoney());
        }

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

    public void getGroceries()
    {
        System.out.print("Cart contains : ----\n");
        for( Item i : this.Groceries)
        {
            i.toString();
        }
        System.out.print("-----:\n");
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
        return String.format("Name of Customer: %s, He has this amount: %.2f, His e-mail is: , %s /*He has these groceries %s*/"
                , getName(), getMoney(), getEmail() );
    }
}
