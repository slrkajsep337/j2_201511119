package headfirst.strategy;

public class MallardDuck extends Duck {
  
  //생성자(memory에 올리는 시점)
  public MallardDuck() {
    //flyBehavior = new FlyWithWings();
    setFlyBehavior(new FlyWithWings());
    
  }

  public void display() {
    System.out.println("MallardDuck!");
  }

  
}