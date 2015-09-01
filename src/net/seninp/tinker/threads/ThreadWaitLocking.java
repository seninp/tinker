package net.seninp.tinker.threads;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ThreadWaitLocking extends JDialog implements ActionListener {

  private static final long serialVersionUID = -1120695563033507771L;

  public ThreadWaitLocking(JFrame parent, String title, String message) {

    super(parent, title, true);

    if (parent != null) {
      Dimension parentSize = parent.getSize();
      Point p = parent.getLocation();
      setLocation(p.x + parentSize.width / 4, p.y + parentSize.height / 4);
    }

    JPanel messagePane = new JPanel();
    messagePane.add(new JLabel(message));
    getContentPane().add(messagePane);
    JPanel buttonPane = new JPanel();
    JButton button = new JButton("OK");
    buttonPane.add(button);
    button.addActionListener(this);
    getContentPane().add(buttonPane, BorderLayout.SOUTH);
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    pack();
    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    setVisible(false);
    dispose();
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setLocation(100, 100);
    frame.setSize(new Dimension(200, 100));
    ThreadWaitLocking dlg = new ThreadWaitLocking(frame, "title", "message");
  }

}
