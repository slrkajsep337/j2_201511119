package headfirst.singleton.stat;

public class Singleton {
////  private boolean empty;
////  private boolean boiled;
  private static Singleton uniqueInstance = new Singleton();
  private static int numCalled=0;

  //private���� ������ ����
  private Singleton() {
//    empty = true;
//    boiled = false;
  }
  
  //�����ڰ� private�̴ϱ� getInstance�� �̿�
  public static Singleton getInstance() {
//    if(uniqueInstance == null) {
//      uniqueInstance = new ChocolateBoiler();
//    } 
    System.out.println("number called"+numCalled++);
    return uniqueInstance;
  }
  
  
}
  