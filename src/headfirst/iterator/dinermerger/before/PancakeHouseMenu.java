package headfirst.iterator.dinermerger.before;

import java.util.ArrayList;

//pattern 적용 전 code, ArrayList/Array 비교 
public class PancakeHouseMenu {
  ArrayList menuItems;
  
  //MenuItem[] menuItems;
  //final int MAX_ITEMS = 3;
  //int numberOfItems=0;
  
  public PancakeHouseMenu() {
    //menuItems=new MenuItem[MAX_ITEMS];
    menuItems = new ArrayList();
    addItem("BLT", "Bacon, Lettus, Tomato", true, 2.99);
    addItem("BLT2", "Bacon2, Lettus2, Tomato2", true, 2.99);
  }
  
  public void addItem(String n, String d, boolean v, double p) {
    MenuItem m = new MenuItem(n, d, v, p);
    //menuItems[numberOfItems] = m;
    //numberOfItems++;
    menuItems.add(m);
  }
  
  //public MenuItem[] getMenuItems() 
  public ArrayList<MenuItem> getMenuItems() {
    return menuItems;
  }
}