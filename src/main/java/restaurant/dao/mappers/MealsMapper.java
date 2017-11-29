package restaurant.dao.mappers;

import restaurant.domain.Meals;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MealsMapper implements IMapper<Meals> {
    public Meals map(ResultSet rs) throws SQLException {
        Meals m = new Meals();
        m.setId(rs.getInt("id"));
        m.setMenuId(rs.getInt("menuId"));
        m.setDescription(rs.getString("description"));
        m.setPrice(rs.getInt("price"));
        return m;
    }
}
