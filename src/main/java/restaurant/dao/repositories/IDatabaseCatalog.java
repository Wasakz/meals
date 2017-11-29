package restaurant.dao.repositories;

public interface IDatabaseCatalog {

    public IMealsRepository meals();
    public IMenuRepository menus();
    public IRestaurantRepository restaurants();


    public void saveChanges();
}
