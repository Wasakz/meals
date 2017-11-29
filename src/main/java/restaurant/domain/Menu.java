package restaurant.domain;

public class Menu implements IHaveId {
    private int id;
    private int restaurantId;
    private String menuType;

    public Menu() {
        super();
    }

    public Menu(int restaurantId, String menuType) {
        this.restaurantId = restaurantId;
        this.menuType = menuType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }
}
