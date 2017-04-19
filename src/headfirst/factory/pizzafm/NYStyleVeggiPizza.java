package headfirst.factory.pizzafm;

public class NYStyleVeggiPizza extends Pizza {
  public NYStyleVeggiPizza() { 
    name = "NY Style Sauce and Vegitable Pizza";
    dough = "Thin Crust Dough";
    sauce = "Marinara Sauce";
    
    toppings.add("Vegitable");
  }
}
