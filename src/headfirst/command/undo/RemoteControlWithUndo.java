package headfirst.command.undo;

import java.util.*;

public class RemoteControlWithUndo {
  Command[] slots;
  public SimpleRemoteControl() {
    slots=new Command[7];
    //Null Object Pattern 
    Command noCommand = new NoCommand();
    for(int i=0; i<7; i++) {
      slots[i]=noCommand;
    }
  }
  public void setCommand(Command command) {
    slots[slot]=command;
  }
  public void buttonWasPressed(int slot) {
    slots[slot].execute();
  }
}
    