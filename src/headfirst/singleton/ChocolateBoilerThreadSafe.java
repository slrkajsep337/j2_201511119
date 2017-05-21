package headfirst.singleton.chocolatethreadsafe;

public class ChocolateBoilerThreadSafe {
//  private boolean empty;
//  private boolean boiled;
  private static ChocolateBoiler uniqueInstance = new ChocolateBoiler;
  private static int numCalled=0;

  //private���� ������ ����
  private ChocolateBoiler() {
//    empty = true;
//    boiled = false;
  }
  
  //�����ڰ� private�̴ϱ� getInstance�� �̿�
  public static ChocolateBoiler getInstance() {
    if(uniqueInstance == null) {
      System.out.println("creating...");
      uniqueInstance = new ChocolateBoiler();
    } 
    System.out.println("number called"+numCalled++);
    return uniqueInstance;
  }
}
  