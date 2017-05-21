package headfirst.singleton.threadsafe;

public class Singleton {
  private static Singleton uniqueInstance = new Singleton();
  private static int numCalled=0;

  //private���� ������ ����
  private Singleton(){
  }
  
  //�����ڰ� private�̴ϱ� getInstance�� �̿�
  public static synchronized Singleton getInstance() {
    if(uniqueInstance == null) {
      System.out.println("creating...");
      uniqueInstance = new Singleton();
    } 
    System.out.println("number called"+numCalled++);
    return uniqueInstance;
  }
  
  
}
  