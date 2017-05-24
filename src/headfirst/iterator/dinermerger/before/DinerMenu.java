package headfirst.iterator.dinermerger.before;

public class DinerMenu {
  MenuItem[] menuItems;
  final int MAX_ITEMS = 3;
  int numberOfItems=0;
  
  public void DinerMenu() {
    menuItems=new MenuItem[MAX_ITEMS];
    addItem("BLT", "Bacon, Lettus, Tomato", true, 2.99);
    addItem("BLT2", "Bacon2, Lettus2, Tomato2", true, 2.99);
  }
  
  public void addItem(String n, String d, boolean v, double p) {
    MenuItem m = new MenuItem(n, d, v, p);
    menuItems[numberOfItems] = m;
    numberOfItems++;
  }
  
  public MenuItem[] getMenuItems() {
    return menuItems;
  }
}
  
  
  
  