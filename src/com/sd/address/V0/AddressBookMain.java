package com.sd.address.V0;

import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;
import java.util.*;

public class AddressBookMain {
  public static void main(String[] args) {
    
      AddressData AddressData = new AddressData();
 
      CurrentDataDisplay currentDisplay = new CurrentDataDisplay(AddressData);
      //StatisticsDisplay statisticsDisplay = new StatisticsDisplay(AddressData);
      //ForecastDisplay forecastDisplay = new ForecastDisplay(AddressData);
      
      AddressData.setData("80", "65", "30.4f");
      AddressData.setData("82", "70", "29.2f");
      AddressData.setData("78", "90", "29.2f");
    
    
    
    
    JFrame f = new JFrame();  //JFrame�̶�� ������ ���� 
    JPanel panel = new JPanel(new GridLayout(4,3));  //3by2�� �� 6���� �������� ���̾ƿ��� ���� 
    f.getContentPane().add(panel);  //add�Ͽ� panel�� �߰��Ѵ� 
    
    JLabel label1=new JLabel("name");
    JLabel label2=new JLabel("phone number");  
    JLabel label3=new JLabel("e-mail"); //JLabel 3��
    
    JTextField nameTf=new JTextField(20);
    JTextField numTf=new JTextField(20);
    JTextField mailTf=new JTextField(20);  //JTextField 3��
    
    String strName = nameTf.getText();  //string type���� ���� 
    String strNum = numTf.getText();
    String strMail = mailTf.getText();
    
    JButton b1=new JButton("save");
    JButton b2=new JButton("sort");
    JButton b3=new JButton("delete"); 
    
    //b1.setPreferredSize(new Dimension(40, 40));
    b1.addActionListener(new AddressListener());  //�����ڸ� ����Ѵ�, ��ϵ� listener�� Ȯ���� �� �ְ�
    b2.addActionListener(new AddressListener());
    
    panel.add(label1);
    panel.add(nameTf);
    panel.add(label2);
    panel.add(numTf);
    panel.add(label3);
    panel.add(mailTf);
    panel.add(b1);
    panel.add(b2);
    //f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    f.pack();
    f.setVisible(true);
  }
}