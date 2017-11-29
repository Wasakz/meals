package restaurant.domain.checkers;

import restaurant.domain.Restaurant;

public class RestaurantChecker {
    public boolean validRestaurantName(Restaurant restaurant) {
        return restaurant.getName() != null;
    }

    public boolean validRestaurantAddress(Restaurant restaurant) {
        return restaurant.getAddress() != null;
    }

    public boolean validPhoneNumber(Restaurant restaurant) {
        return restaurant.getPhoneNumber() != null;
    }


}
