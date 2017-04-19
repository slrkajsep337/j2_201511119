package headfirst.factory.pizzafm;

public class SMStylePotatoPizza extends Pizza {
  public SMStylePotatoPizza() { 
    name = "SM Style Sauce and Potato Pizza";
    dough = "Cheese Crust Dough";
    sauce = "Tomato Sauce";
    
    toppings.add("Potato");
  }
}
