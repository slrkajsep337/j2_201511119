package headfirst.iterator.dinermerger.before;

import java.util.*;

public class MenuMain {
  
  public static void printMenu() {
    PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
    DinerMenu dinerMenu = new DinerMenu();
    
    ArrayList breakfast = pancakeHouseMenu.getMenuItems();
    
    for(int i=0; i<breakfast.size(); i++) {
      MenuItem menuItem = (MenuItem)breakfast.get(i);
      System.out.println(menuItem.getName());
      System.out.println(menuItem.getPrice());
      System.out.println(menuItem.getDescription());
    }
    
    MenuItem[] lunch = dinerMenu.getMenuItems();
    
    for(int i=0; i<lunch.length; i++) {
      MenuItem menuItem = lunch[i];
      System.out.println(menuItem.getName());
      System.out.println(menuItem.getPrice());
      System.out.println(menuItem.getDescription());
    }
  }
}