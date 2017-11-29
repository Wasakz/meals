package restaurant.domain.checkers;

import restaurant.domain.Menu;

public class MenuChecker {
    public boolean validMenuType(Menu menu) {
        return menu.getMenuType() != null;
    }

}
