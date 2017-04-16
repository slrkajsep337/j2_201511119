package com.sd.address.V0;
import java.awt.event.*;
import javax.swing.*;

class AddressListener implements ActionListener {
  public void actionPerformed(ActionEvent e) {
    JButton b = (JButton)e.getSource();  //getSoruce();어디서 event가 발생했는지 확인 
    String cmd=e.getActionCommand();  //ActionCommand();어떤 button을 눌렀는지 확인 
    if (cmd.equals("save")) {
      System.out.println("저장버튼이 눌렸습니다");
      b.setText("저장했습니다!");
      
    } else if (cmd.equals("delete")) {
      System.out.println("삭제버튼이 눌렸습니다");
      b.setText("삭제했습니다!");
    } else {
      System.out.println("이미실행되었습니다");
    }
  }

}