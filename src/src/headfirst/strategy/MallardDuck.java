package headfirst.strategy;

public class MallardDuck extends Duck {
  
  //������(memory�� �ø��� ����)
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