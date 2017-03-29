package headfirst.strategy;

public class MallardDuck extends Duck {
  
  //생성자(memory에 올리는 시점)
  public MallardDuck() {
    flyBehavior = new FlyWithWings();
    //flyBehavior = new FlyNoWay();
    setFlyBehavior(new FlyWithWings());
    //quackBehavior = new Quack();
    
    quackBehavior = new Quack();
    setQuackBehavior(new Quack());
  }

  public void display() {
    System.out.println("MallardDuck!");
  }

  
}