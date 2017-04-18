package headfirst.factory.pizzas;

import java.util.ArrayList;

public class Pizza {  //abstract이 없어서 일단 빼고 짜봄
  String name;
  String dough;
  String sauce;
  ArrayList<String> toppings = new ArrayList<String>();
  
  public String getName() {
    return name;
  }
  public void prepare() { //재료준비
    System.out.println("preparing "+name);
  }
  public void bake() { //굽기
    System.out.println("baking "+name);
  }
  public void cut() { //자르기
    System.out.println("cutting "+name);
  }
  public void box() { //포장하기
    System.out.println("boxing "+name);
  }
}
  
  
    
  