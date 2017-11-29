package restaurant.examples;

import java.sql.Connection;
import restaurant.dao.repositories.IDatabaseCatalog;
import restaurant.domain.Restaurant;

public class RestaurantRepositoryExample {
    public static void execute(Connection connection, IDatabaseCatalog catalog){
    catalog.restaurants().createTable();
    Restaurant restaurant = new Restaurant("Pueblo", "Wladyslawa", "6425321");
    Restaurant restaurant2 = new Restaurant("Malika", "Swietojanska", "5325314");

    catalog.restaurants().add(restaurant);
    catalog.restaurants().add(restaurant2);
    catalog.saveChanges();

    System.out.println("Count : "+ catalog.restaurants().count());
    System.out.println("Last id : "+ catalog.restaurants().lastId());



    }
}
