package headfirst.decorator.starbuzz;

public class Espresso extends Beverage {  //abstract����
//  
//  String description="Espresso";
//  String description;  ��ӹ޾����ϱ� ����
  public Espresso() {
    description="Espresso";
  }
//  public String getDescription () {
//    return description;
//  }   overriding ����
  public double cost() {
    return 1.99;
  }
}
    