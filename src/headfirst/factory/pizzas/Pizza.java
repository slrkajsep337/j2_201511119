package headfirst.factory.pizzas;

import java.util.ArrayList;

public class Pizza {  //abstract�� ��� �ϴ� ���� ¥��
  String name;
  String dough;
  String sauce;
  ArrayList<String> toppings = new ArrayList<String>();
  
  public String getName() {
    return name;
  }
  public void prepare() { //����غ�
    System.out.println("preparing "+name);
  }
  public void bake() { //����
    System.out.println("baking "+name);
  }
  public void cut() { //�ڸ���
    System.out.println("cutting "+name);
  }
  public void box() { //�����ϱ�
    System.out.println("boxing "+name);
  }
}
  
  
    
  