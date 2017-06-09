package com.sd.address.V0;

//id, name, number, mail

public class Person {
    private int id;
    private String name;
    private String number;
    private String mail;
    Person(){
//        this.id=id;
//        this.name=name;
//        this.number=number;
//        this.mail=mail;
    }
    
    public int getId() {
      return id;
    }
    public void setId(int id) {
      this.id=id;
    }
    public String getName() {
      return name;
    }
    public void setName(String name) {
      this.name=name;
    }
     public String getNum() {
        return number;
    }
    public void setNum(String number) {
        this.number=number;
    }
    public String getMail() {
      return mail;
    }
    public void setMail(String mail) {
      this.mail=mail;
    }
    
    public String toString() {
      return id+".이름:"+name+"\n  번호:"+number+"\n  메일:"+mail;
    }
    
    
}