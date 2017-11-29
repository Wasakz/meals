package restaurant.domain.checkers;
import restaurant.domain.Meals;

public class MealsChecker {
    public boolean validMealName(Meals meals) {
        return meals.getName() != null;
    }

    public boolean validDescription(Meals meals) {
        return meals.getDescription() != null;
    }

}
