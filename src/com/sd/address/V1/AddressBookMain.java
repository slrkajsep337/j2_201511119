package com.sd.address.V0;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;
import java.util.*;
import java.util.List;


//dao pattern해결되면 같은방식으로 데이터 넣기 

public class AddressBookMain implements ActionListener {
  
  PersonDAOImpl pDI = new PersonDAOImpl();
  Person p = new Person();
  
  JTextField nameTf=new JTextField(20);
  JTextField numTf=new JTextField(20);
  JTextField mailTf=new JTextField(20);  //JTextField 3개
  
  JTextField findTf=new JTextField(20);  //검색하는 textField
  
  static String strName;
  static String strNum;
  static String strMail; 
    //= mailTf.getText();  
  
  int idx;
  int id;
//  String ipName;
//  String ipNum;
//  String ipMail;
  
    
  public void GUI() {
    JFrame f = new JFrame();  //JFrame이라는 공간을 생성 
    JPanel panel = new JPanel(new GridLayout(3,4));  //3by2로 총 6개의 공간으로 레이아웃을 나눔 
    f.getContentPane().add(panel);  //panel을 추가한다 
    
    JLabel label1=new JLabel("name");
    JLabel label2=new JLabel("phone number");  
    JLabel label3=new JLabel("e-mail"); //JLabel 3개
    
    JButton b1=new JButton("save");
    JButton b2=new JButton("delete");
    JButton b3=new JButton("print");
    
    JButton b4=new JButton("search(name)");
    JButton b5=new JButton("print sorting");
    
    
    //b1.setPreferredSize(new Dimension(40, 40));
    b1.addActionListener(this);  //구독자를 등록한다, 등록된 listener만 확인할 수 있게
    b2.addActionListener(this);
    b3.addActionListener(this);
    
    panel.add(label1); //name
    panel.add(nameTf);
    panel.add(b1); //save
    panel.add(b4); 
    
    panel.add(label2); //number
    panel.add(numTf);
    panel.add(b2); //delete 
    panel.add(findTf);
    
    panel.add(label3); //email 
    panel.add(mailTf);
    panel.add(b3); //print 
    panel.add(b5);
    
    //f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    f.pack();
    f.setVisible(true);
  }
  
  
  public String getName(){
    strName = nameTf.getText();
    return strName;
  }
  
  public String getNum(){
    strNum = numTf.getText();
    return strNum;
  }
  
  public String getMail(){
    strMail = mailTf.getText();
    return strMail;
  }
  
  public void actionPerformed(ActionEvent e) {  
    JButton b = (JButton)e.getSource();  //getSoruce();어디서 event가 발생했는지 확인 
    String cmd=e.getActionCommand();  //ActionCommand();어떤 button을 눌렀는지 확인 
    if (cmd.equals("save")) {
      strName=getName();
      if(strName.equals("")) {
        System.out.println("다시 입력해주세요");
      }
      else {
        idx = pDI.getId() + 1;
        p.setName(strName);
        p.setId(idx);
        strNum = getNum();
        p.setNum(strNum);
        strMail = getMail();
        p.setMail(strMail);
        pDI.insert(p);
        //dataSetnull();
        //CurrentInpDisplay.display();
      }
      System.out.println("저장되었습니다!"); //cmd에 출력
      b.setText("save complete!"); //버튼 이름이 바뀜      
      
      
    } else if (cmd.equals("delete")) {
      id=pDI.getId();
      pDI.delete(id);
      b.setText("delete complete!");
    } else if (cmd.equals("print")) {
      System.out.println("출력했습니다!");
      pDI.findAll();
      b.setText("printing address!");
      
      //Sorter.sort(arr, stringComp);
      
    } else if (cmd.equals("search(name)")) {
      pDI.findByName(strName);
      b.setText("search complete!");
      
    } else if (cmd.equals("prit sorting")) {
      pDI.findAll();
      b.setText("printing sorted address!");
      
    }else {
      System.out.println("이미 작업이 실행되었습니다.");
    }
  }
  
//  public void sort(Object[] data, Comparator comp) {
//    ArrayList<ArrayList> arr = new ArrayList<ArrayList>(); //큰배열
//    ArrayList a = new ArrayList(); //작은배열 
//    
//    for(int i=0; i<10; i++) {
//      array.append(a); 
//    } //배열 10개 추가
//    
//    Comparator stringComp=new StringComparator();
//    //Sorter.sort(B, stringComp);
//    
//    for(int i=0; i<a.length; i++)
//      System.out.println("a["+i+"]="+a[i]);
//    
//    for(int i=data.length-1; i>=1; i--) {
//      int indexOfMax=0;
//      for(int j=1; j<=i; j++) {
//        if(comp.compare(data[j], data[indexOfMax]) > 0)
//          indexOfMax=j;
//      }
//      Object temp=data[i];
//      data[i]=data[indexOfMax];
//      data[indexOfMax]=temp;
//    }
//  }

  public static void main(String[] args) {
    AddressBookMain ab = new AddressBookMain();
    ab.GUI();
  } 
}
