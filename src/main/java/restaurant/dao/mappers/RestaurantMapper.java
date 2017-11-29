package restaurant.dao.mappers;
import restaurant.domain.Restaurant;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RestaurantMapper implements IMapper<Restaurant> {

    public Restaurant map(ResultSet rs) throws SQLException {
        Restaurant r = new Restaurant();
        r.setId(rs.getInt("id"));
        r.setAddress(rs.getString("address"));
        r.setName(rs.getString("name"));
        r.setPhoneNumber(rs.getString("phoneNumber"));
        return r;
    }
}
