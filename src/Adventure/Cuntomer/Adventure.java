package Adventure.Cuntomer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Adventure {

    public static void main(String[] args) {

        //CRUD : Create Read Update Delete
        ArrayList<Customer> customers = new ArrayList<>(); // this can several customers
        ArrayList<Item> items = new ArrayList<>();

        Customer a = new Customer("Weber", 200.00, "weberkanga77@ŋmail.com"); // Customers is a compisite datatype,
        Customer b = new Customer("jane", 250.00, "janiie@j.com");
        Customer ca = new Customer("Yin", 200.00, "weberkanga77@ŋmail.com"); // Customers is a compisite datatype,
        Customer cb = new Customer("Vlad", 250.00, "janiie@j.com");


        Item One = new Item("Apples", 50.00, true ,"Red");
        Item Two = new Item("Oranges", 75.00, false, "Orange");
        Item Three = new Item("Strawberries", 100.00, false, "Red");

        customers.addAll(Arrays.asList(a, b , ca, cb));
        List<Item> itemsList = Arrays.asList(One, Two, Three);

        a.addToCart(One); // this simu a purchase
        a.addToCart(Two);
        a.addToCart(Three);
        a.getGroceries();

        //System.out.println(a);

    }


}


/*  define an object item with the attributes (Store) */