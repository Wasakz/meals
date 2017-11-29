package restaurant.dao.repositories.impl;

import restaurant.dao.repositories.IDatabaseCatalog;
import restaurant.dao.uow.IUnitOfWork;

import restaurant.dao.repositories.*;
import restaurant.dao.mappers.*;

import java.sql.Connection;
import java.sql.SQLException;

public class DatabaseCatalog implements IDatabaseCatalog {
    private Connection connection;
    IUnitOfWork uow;

    public DatabaseCatalog(Connection connection, IUnitOfWork uow) {
        this.connection = connection;
        this.uow = uow;
    }

    public IRestaurantRepository restaurants() {
        try {
            return new RestaurantRepository(connection, new RestaurantMapper(), uow);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    public IMenuRepository menus() {
        try {
            return new MenuRepository(connection, new MenuMapper(), uow);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public IMealsRepository meals() {
        try {
            return new MealsRepository(connection, new MealsMapper(), uow);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void saveChanges() {
        uow.saveChanges();
    }

}