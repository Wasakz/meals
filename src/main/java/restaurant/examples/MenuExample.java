package restaurant.examples;

import restaurant.dao.repositories.IDatabaseCatalog;

import java.sql.Connection;
import restaurant.domain.Menu;

public class MenuExample {
    public static void execute(Connection connection, IDatabaseCatalog catalog){
        catalog.menus().createTable();
        Menu menu = new Menu(0, "Soups");
        Menu menu2 = new Menu (1, "Salads");

        catalog.menus().add(menu);
        catalog.menus().add(menu2);

        System.out.println("Count : "+ catalog.restaurants().count());
        System.out.println("Last id : "+ catalog.restaurants().lastId());

    }
}
