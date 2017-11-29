package restaurant.dao.repositories;

import restaurant.domain.Menu;

import java.util.List;

public interface IMenuRepository extends IRepository<Menu>  {

    public List<Menu> withMenuType (String menuType);
    public List<Menu> withMenuId (int id);
    public List <Menu> withRestaurantId (int id);
}
