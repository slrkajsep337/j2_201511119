package headfirst.strategy;

public class MallardDuck extends Duck {
  
  //������(memory�� �ø��� ����)
  public MallardDuck() {
    //flyBehavior = new FlyWithWings();
    setFlyBehavior(new FlyWithWings());
    
  }

  public void display() {
    System.out.println("MallardDuck!");
  }

  
}