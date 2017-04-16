package com.sd.address.V0;

public interface Subject {
  
 public void registerObserver(Observer o);
 public void removeObserver(Observer o);
 public void notifyObservers();
 
}