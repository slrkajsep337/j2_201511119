package headfirst.singleton.stat;

public class Singleton {
////  private boolean empty;
////  private boolean boiled;
  private static Singleton uniqueInstance = new Singleton();
  private static int numCalled=0;

  //private으로 생성자 만듦
  private Singleton() {
//    empty = true;
//    boiled = false;
  }
  
  //생성자가 private이니까 getInstance를 이용
  public static Singleton getInstance() {
//    if(uniqueInstance == null) {
//      uniqueInstance = new ChocolateBoiler();
//    } 
    System.out.println("number called"+numCalled++);
    return uniqueInstance;
  }
  
  
}
  