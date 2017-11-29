package restaurant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import restaurant.dao.uow.IUnitOfWork;
import restaurant.dao.uow.UnitOfWork;
import restaurant.dao.repositories.IDatabaseCatalog;
import restaurant.dao.repositories.impl.DatabaseCatalog;
import restaurant.examples.RestaurantRepositoryExample;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/workdb", "SA", "");

        IUnitOfWork uow = new UnitOfWork(connection);
        IDatabaseCatalog catalog = new DatabaseCatalog(connection, uow);

        RestaurantRepositoryExample.execute(connection, catalog);

        uow.saveChanges();
        connection.close();


    }
}
