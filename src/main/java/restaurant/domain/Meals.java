package restaurant.domain;

public class Meals implements IHaveId {
    private int id;
    private int menuId;
    private String description;
    private int price;

    public Meals() {
        super();
    }

    public Meals(int menuId, String description, int price) {
        this.menuId = menuId;
        this.description = description;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
