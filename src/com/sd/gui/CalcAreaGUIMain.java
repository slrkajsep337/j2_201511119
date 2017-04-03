package com.sd.gui;
import java.awt.*;
import javax.swing.*;

public class CalcAreaGUIMain {
  public static void main(String[] args) {
    JFrame f=new JFrame();  //JFrame�̶�� ������ ���� 
    JPanel panel=new JPanel(new GridLayout(3,2));  //3by2�� �� 6���� �������� ���̾ƿ��� ���� 
    f.getContentPane().add(panel);  //add�Ͽ� panel�� �߰��Ѵ� 
    JLabel label1=new JLabel("������");
    JLabel label2=new JLabel("����");  //JLabel �ΰ�
    JTextField radiusTf1=new JTextField(20);
    JTextField areaTf2=new JTextField(20);  //JTextField �ΰ�
    JButton b1=new JButton("���");
    JButton b2=new JButton("���");  //JButton �ΰ� �ؼ� �� 6���� ������ ä��
    //b1.setPreferredSize(new Dimension(40, 40));
    b1.addActionListener(new CalcAreaListener());  //�����ڸ� ����Ѵ�, ��ϵ� listener�� Ȯ���� �� �ְ�
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