package headfirst.decorator.starbuzz;

public class Espresso extends Beverage {  //abstract구현
//  
//  String description="Espresso";
//  String description;  상속받았으니까 생략
  public Espresso() {
    description="Espresso";
  }
//  public String getDescription () {
//    return description;
//  }   overriding 안함
  public double cost() {
    return 1.99;
  }
}
    