package restaurant.dao.repositories.impl;

import restaurant.dao.mappers.IMapper;
import restaurant.dao.repositories.IRestaurantRepository;
import restaurant.dao.uow.IUnitOfWork;
import restaurant.domain.Restaurant;

import java.sql.Connection;
import java.sql.SQLException;

public class RestaurantRepository extends RepositoryBase<Restaurant> implements IRestaurantRepository {

    public RestaurantRepository(Connection connection, IMapper<Restaurant> mapper, IUnitOfWork uow) throws SQLException {
        super(connection, mapper, uow);
    }
    @Override
    protected String createTableSql() {
        return "CREATE TABLE IF NOT EXISTS restaurants("
                + "id bigint GENERATED BY DEFAULT AS IDENTITY,"
                + "name VARCHAR(64),"
                + "address VARCHAR(64),"
                + "phoneNumber VARCHAR(90),"
                + ")";
    }

    @Override
    protected String getTableName() {
        return "restaurants";
    }

    @Override
    protected String getUpdateSql() {
        return "UPDATE restaurants SET (name, address, phoneNumber)=(?,?,?) WHERE id=?";
    }

    @Override
    protected String getInsertSql() {
        return "INSERT INTO restaurants (name, address, phoneNumber) VALUES(?,?,?)";
    }

    @Override
    protected void setInsert(Restaurant restaurant) throws SQLException {
        insert.setString(1, restaurant.getName());
        insert.setString(2, restaurant.getAddress());
        insert.setString(3, restaurant.getPhoneNumber());
    }

    @Override
    protected void setUpdate(Restaurant restaurant) throws SQLException {
        update.setString(1, restaurant.getName());
        update.setString(2, restaurant.getAddress());
        update.setString(3, restaurant.getPhoneNumber());
    }

}

