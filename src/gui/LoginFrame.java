package gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LoginFrame extends JFrame {
  private List<JButton> buttons;

  public LoginFrame() {
    super("What kind of user are you?");
    setLayout(new FlowLayout());
    ButtonHandler handler = new ButtonHandler();

  }

  public LinkedList<JButton> getButtons() {
    return (LinkedList<JButton>) Collections.unmodifiableList(this.buttons);
  }

  private class ButtonHandler implements ActionListener {
    // handle button event
    @Override
    public void actionPerformed(ActionEvent event) {
      JOptionPane.showMessageDialog(LoginFrame.this,
          String.format("You pressed: %s", event.getActionCommand()));
    }
  }

}
