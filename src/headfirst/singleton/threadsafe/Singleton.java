package headfirst.singleton.threadsafe;

public class Singleton {
  private static Singleton uniqueInstance = new Singleton();
  private static int numCalled=0;

  //private으로 생성자 만듦
  private Singleton(){
  }
  
  //생성자가 private이니까 getInstance를 이용
  public static synchronized Singleton getInstance() {
    if(uniqueInstance == null) {
      System.out.println("creating...");
      uniqueInstance = new Singleton();
    } 
    System.out.println("number called"+numCalled++);
    return uniqueInstance;
  }
  
  
}
  