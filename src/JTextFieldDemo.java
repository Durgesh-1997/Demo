//// Demonstrate JTextField.
//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
///*
//<applet code="JTextFieldDemo" width=300 height=50>
//</applet>
//*/
//public class JTextFieldDemo extends JApplet {
//    JTextField jtf;
//    public void init() {
//        try {
//            SwingUtilities.invokeAndWait(
//                    new Runnable() {
//                        public void run() {
//                            makeGUI();
//                        }
//                    }
//            );
//        } catch (Exception exc) {
//            System.out.println("Can't create because of " + exc);
//        }
//    }
//    private void makeGUI() {
//// Change to flow layout.
//        setLayout(new FlowLayout());
//// Add text field to content pane.
//        jtf = new JTextField(15);
//        add(jtf);
//        jtf.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent ae) {
//// Show text when user presses ENTER.
//                showStatus(jtf.getText());
//            }
//        });
//    }
//}


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JTextFieldDemo extends JFrame {
    JTextField jtf;
    JLabel statusLabel;

    public JTextFieldDemo() {
        makeGUI();
    }

    private void makeGUI() {
        // Change to flow layout.
        setLayout(new FlowLayout());

        // Add text field to the frame.
        jtf = new JTextField(15);
        add(jtf);

        // Add a label to show the status.
        statusLabel = new JLabel("");
        add(statusLabel);

        jtf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                // Show text when user presses ENTER.
                statusLabel.setText(jtf.getText());
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JTextFieldDemo frame = new JTextFieldDemo();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(300, 100);
                frame.setVisible(true);
            }
        });
    }
}
