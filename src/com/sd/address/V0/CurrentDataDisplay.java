package com.sd.address.V0;

import java.util.*;

public class CurrentDataDisplay implements Observer, DisplayElement {
 private String name;
 private String number;
 //private String mail;
 private Subject addressData;
 
 public CurrentDataDisplay(Subject addressData) {
  this.addressData = addressData;
  addressData.registerObserver(this);
 }
 
 public void update(String name, String number, String mail) {
  this.name = name;
  this.number = number;
//  this.mail = mail;
  display();
 }
 
 public void display() {
  System.out.println("name: " + name 
   + "phone-number: " + number);
 }
}