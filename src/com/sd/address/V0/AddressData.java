package com.sd.address.V0;


import java.util.*;

public class AddressData implements Subject {
 public ArrayList<Observer> observers = new ArrayList<Observer>();
 private String name;
 private String number;
 private String mail;
 
 public AddressData() {
  observers = new ArrayList<Observer>();
 }
 
 public void registerObserver(Observer o) {
  observers.add(o);
 }
 
 public void removeObserver(Observer o) {
  int i = observers.indexOf(o);
  if (i >= 0) {
   observers.remove(i);
  }
 }
 
 public void notifyObservers() {
  for (int i = 0; i < observers.size(); i++) {
   Observer observer = (Observer)observers.get(i);
   observer.update(name, number, mail);
  }
 }
 
 public void dataChanged() {
  notifyObservers();
 }
 
 public void setData(String name, String number, String mail) {
  this.name = name;
  this.number = number;
  this.mail = mail;
  dataChanged();
 }
 
 public String getName() {
  return name;
 }
 
 public String getNumber() {
  return number;
 }
 
 public String getMail() {
  return mail;
 }
}