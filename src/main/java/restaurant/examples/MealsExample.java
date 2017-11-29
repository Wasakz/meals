package restaurant.examples;

import restaurant.dao.repositories.IDatabaseCatalog;
import restaurant.domain.Meals;

import java.sql.Connection;

public class MealsExample {
    public static void execute(Connection connection, IDatabaseCatalog catalog){
        catalog.meals().createTable();

        Meals meal1 = new Meals(0, "Corn Soup", "Delicious soup", 15);
        Meals meal2 = new Meals(1, "Chicken Salad", "Delicious salad", 20);

        catalog.meals().add(meal1);
        catalog.meals().add(meal2);




    }
}
