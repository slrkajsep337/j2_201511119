package headfirst.strategy;

public class ModelDuck extends Duck {
  public ModelDuck() {
    flyBehavior = new FlyWithWings();
    //flyBehavior = new FlyNoWay();
    setFlyBehavior(new FlyWithWings());
    //quackBehavior = new Quack();
    
    quackBehavior = new Quack();
    setQuackBehavior(new Quack());
  }

  public void display() {
    System.out.println("Model duck!!");
  }
}