package com.sd.gui;
import java.awt.*;
import javax.swing.*;

public class CalcAreaGUIMain {
  public static void main(String[] args) {
    JFrame f=new JFrame();  //JFrame이라는 공간을 생성 
    JPanel panel=new JPanel(new GridLayout(3,2));  //3by2로 총 6개의 공간으로 레이아웃을 나눔 
    f.getContentPane().add(panel);  //add하여 panel을 추가한다 
    JLabel label1=new JLabel("반지름");
    JLabel label2=new JLabel("면적");  //JLabel 두개
    JTextField radiusTf1=new JTextField(20);
    JTextField areaTf2=new JTextField(20);  //JTextField 두개
    JButton b1=new JButton("계산");
    JButton b2=new JButton("취소");  //JButton 두개 해서 총 6개의 공간을 채움
    //b1.setPreferredSize(new Dimension(40, 40));
    b1.addActionListener(new CalcAreaListener());  //구독자를 등록한다, 등록된 listener만 확인할 수 있게
    b2.addActionListener(new CalcAreaListener());
    panel.add(label1);
    panel.add(radiusTf1);
    panel.add(label2);
    panel.add(areaTf2);
    panel.add(b1);
    panel.add(b2);
    //f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    f.pack();
    f.setVisible(true);
  }
}