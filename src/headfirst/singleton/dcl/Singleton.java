package headfirst.singleton.dcl;

public class Singleton {
  //private static Singleton uniqueInstance;
  private volatile static Singleton uniqueInstance;
  private static int numCalled=0;

  //private으로 생성자 만듦
  private Singleton(){
  }
  
  //생성자가 private이니까 getInstance를 이용
  //public static synchronized Singleton getInstance() {
  public static Singleton getInstance() {
    if(uniqueInstance == null) {
      synchronized(Singleton.class) {
        if(uniqueInstance == null) {
          System.out.println("creating...");
          uniqueInstance = new Singleton();
        }
      }
    } //공유하는 대상을  클래스로 옮겨온다. 
    System.out.println("number called"+numCalled++);
    return uniqueInstance;
  }
  
  
}
  