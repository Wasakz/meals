package restaurant.dao.mappers;

import restaurant.domain.Menu;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MenuMapper implements IMapper<Menu> {
    public Menu map(ResultSet rs) throws SQLException {
        Menu m = new Menu();
        m.setId(rs.getInt("id"));
        m.setRestaurantId(rs.getInt("restaurantId"));
        m.setMenuType(rs.getString("type"));
        return m;
    }
}
