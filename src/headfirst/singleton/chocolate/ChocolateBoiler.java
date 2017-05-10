package headfirst.singleton.chocolate;

public class ChocolateBoiler {
  private boolean empty;
  private boolean boiled;
  private static ChocolateBoiler uniqueInstance;
  private static int numCalled=0;

  //private으로 생성자 만듦
  private ChocolateBoiler() {
    empty = true;
    boiled = false;
  }
  
  //생성자가 private이니까 getInstance를 이용
  public static ChocolateBoiler getInstance() {
    if(uniqueInstance == null) {
      uniqueInstance = new ChocolateBoiler();
    } 
    System.out.println("number called"+numCalled++);
    return uniqueInstance;
  }
  
  public void fill() {
    if(isEmpty()) {
      System.out.println("It is now empty and is being filled...");
      empty = false;
      boiled = false;
    }
  }
  
  public void drain() {
    if (!isEmpty() && isBoiled()) {
      empty = true;
    }
  }
  
  public void boil() {
    if (!isEmpty() && !isBoiled()) {
      boiled = true;
    }
  }
  
 public boolean isEmpty() {
   return empty;
 }
 
 public boolean isBoiled() {
   return boiled;
 }
}
  