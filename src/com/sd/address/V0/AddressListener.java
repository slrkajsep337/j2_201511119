package com.sd.address.V0;
import java.awt.event.*;
import javax.swing.*;

class AddressListener implements ActionListener {
  public void actionPerformed(ActionEvent e) {
    JButton b = (JButton)e.getSource();  //getSoruce();��� event�� �߻��ߴ��� Ȯ�� 
    String cmd=e.getActionCommand();  //ActionCommand();� button�� �������� Ȯ�� 
    if (cmd.equals("save")) {
      System.out.println("�����ư�� ���Ƚ��ϴ�");
      b.setText("�����߽��ϴ�!");
      
    } else if (cmd.equals("delete")) {
      System.out.println("������ư�� ���Ƚ��ϴ�");
      b.setText("�����߽��ϴ�!");
    } else {
      System.out.println("�̹̽���Ǿ����ϴ�");
    }
  }

}