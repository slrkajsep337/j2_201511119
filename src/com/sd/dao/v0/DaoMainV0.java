package com.sd.dao.v0;

import java.sql.*;
import java.io.FileInputStream;
import java.util.Properties;

public class DaoMainV0 {
  public static void main(String[] args) {
    Connection conn=null;
    Statement stmt=null;
    try {
      String path=System.getProperty("user.dir");
      path+="/src/mysql.properties";
      Properties prob=new Properties();
      prob.load(new FileInputStream(path));
      Class.forName("com.mysql.jdbc.Driver");
      conn=DriverManager.getConnection(
           prob.getProperty("URL"),
           prob.getProperty("USER"),
           prob.getProperty("PASSWORD")
      );
      //String mySql="CREATE TABLE persons(id int(64) NOT NULL AUTO_INCREMENT,";
      //mySql+="name varchar(255) NOT NULL, address varchar(255) NOT NULL, UNIQUE (id))";
      //conn.createStatement().execute(mySql);
      String mySql="INSERT INTO persons(name,address) VALUES('v0-1','1 Hongji Dong')";
      conn.createStatement().execute(mySql);
      mySql="INSERT INTO persons(name,address) VALUES('v0-2','2 Hongji Dong')";
      conn.createStatement().execute(mySql);
      mySql="INSERT INTO persons(name,address) VALUES('v0-3','3 Hongji Dong')";
      conn.createStatement().execute(mySql);
      mySql="DELETE FROM persons WHERE id=3 LIMIT 1";
      conn.createStatement().execute(mySql);
      
      //stmt = conn.createStatement();
      //stmt.execute(mySql);  
    } catch(Exception e) {
      e.printStackTrace();
    } finally {
       
      try {
        if(stmt != null) stmt.close();
      } catch (Exception e) {};
      try {
        if (conn != null) conn.close();
      } catch (Exception e) {};
    }
  }
}

                
                