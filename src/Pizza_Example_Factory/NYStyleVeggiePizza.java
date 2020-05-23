package Pizza_Example_Factory;

public class NYStyleVeggiePizza extends OldPizza{
    public NYStyleVeggiePizza() {
        name = "NY Style Sauce and Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Veggies");
    }
}
