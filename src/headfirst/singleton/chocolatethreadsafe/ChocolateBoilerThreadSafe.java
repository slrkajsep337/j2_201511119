package headfirst.singleton.chocolatethreadsafe;

public class ChocolateBoilerThreadSafe {
//  private boolean empty;
//  private boolean boiled;
  private static ChocolateBoiler uniqueInstance = new ChocolateBoiler;
  private static int numCalled=0;

  //private으로 생성자 만듦
  private ChocolateBoiler() {
//    empty = true;
//    boiled = false;
  }
  
  //생성자가 private이니까 getInstance를 이용
  public static ChocolateBoiler getInstance() {
    if(uniqueInstance == null) {
      System.out.println("creating...");
      uniqueInstance = new ChocolateBoiler();
    } 
    System.out.println("number called"+numCalled++);
    return uniqueInstance;
  }
}
  