package com.sd.address.V0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PersonDAOImpl implements PersonDao {
    Connection conn=ConnectionFactory.getConnection();
    PreparedStatement pstmt=null;
    ResultSet rs=null;
     
//    public void print() {
//      try { 
//        while(rs.next()) {
//          /*rs.getString("id") 식으로 필드명을 바로 적을 수 있음*/
//          System.out.println(rs.getInt(1));
//        }
//      } catch (SQLException e) {
//        e.printStackTrace();
//      }
//    }
      
    public void insert(Person p) {
        try {
            pstmt = conn.prepareStatement("INSERT INTO persons(id,name,num,mail) VALUES(?,?,?,?)");
            pstmt.setInt(1, p.getId());
            pstmt.setString(2, p.getName());
            pstmt.setString(3, p.getNum());
            pstmt.setString(4, p.getMail());
            System.out.println(p.getName()+"의 정보가 입력되었습니다.");
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public Person findByName(String name) {
        Person p=null;
        try {
            pstmt = conn.prepareStatement("SELECT * FROM persons WHERE name=?");
            pstmt.setString(2, name);
            //System.out.println("* finding by id..."+id);
            rs = pstmt.executeQuery();
            if(rs.next()==true) {
                p = new Person();
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("name"));
                p.setNum(rs.getString("number"));
                p.setMail(rs.getString("mail"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return p;
    }
    public List<Person> findAll() {
        Statement stmt=null;
        List<Person> persons = new ArrayList<Person>();
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM persons");
            Person p = null;
            while(rs.next()){
                p = new Person();
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("name"));
                p.setNum(rs.getString("number"));
                p.setMail(rs.getString("mail"));
                persons.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if(stmt != null) stmt.close();
            } catch (Exception e) {};
 }
        System.out.println("주소록 전체를 출력합니다!");
        return persons;
    }
    public void update(Person p) {
        try {
            pstmt = conn.prepareStatement("UPDATE persons SET name=?,number=?,mail=? WHERE id=?"); 
            pstmt.setInt(1, p.getId());
            pstmt.setString(2, p.getName());
            pstmt.setString(3, p.getNum());
            pstmt.setString(4, p.getMail());
            
            //System.out.println("* updating..."+person.getName());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void delete(int id) {
      try {
        pstmt = conn.prepareStatement("DELETE FROM persons WHERE id=?");
        pstmt.setInt(1, id);
        int rows=pstmt.executeUpdate();
        if (rows == 0) {  
          System.out.println("삭제할 정보가 없습니다");
        } else if (rows > 0) {  
          System.out.println(id+"가 삭제되었습니다. print를 누르세요");
        } 
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
    
    public int getId(){
    int id = 0;
    try{
      pstmt = conn.prepareStatement("select * from persons");
      rs = pstmt.executeQuery();
      while(rs.next()){
        id = rs.getInt("id");
      }
    } catch(Exception e){
      e.printStackTrace();
    }
    return id;
    }
    
    public void close() {
      System.out.println("close");
      try {
        if (rs != null) rs.close();
        if (pstmt != null) pstmt.close();
            if (conn != null) conn.close();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
}