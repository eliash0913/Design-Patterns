package Pizza_Example_Factory;

import javafx.util.Pair;

public class NYStyleCheesePizza extends OldPizza {
    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
