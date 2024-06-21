//// Demonstrate JToggleButton.
//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
///*
//<applet code="JToggleButtonDemo" width=200 height=80>
//</applet>
//*/
//public class JToggleButtonDemo extends JApplet {
//    JLabel jlab;
//    JToggleButton jtbn;
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
//// Create a label.
//        jlab = new JLabel("Button is off.");
//// Make a toggle button.
//        jtbn = new JToggleButton("On/Off");
//// Add an item listener for the toggle button.
//        jtbn.addItemListener(new ItemListener() {
//            public void itemStateChanged(ItemEvent ie) {
//                if(jtbn.isSelected())
//                    jlab.setText("Button is on.");
//                else
//                    jlab.setText("Button is off.");
//            }
//        });
//// Add the toggle button and label to the content pane.
//        add(jtbn);
//        add(jlab);
//    }
//}



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JToggleButtonDemo extends JFrame {
    JLabel jlab;
    JToggleButton jtbn;

    public JToggleButtonDemo() {
        makeGUI();
    }

    private void makeGUI() {
        // Change to flow layout.
        setLayout(new FlowLayout());

        // Create a label.
        jlab = new JLabel("Button is off.");

        // Make a toggle button.
        jtbn = new JToggleButton("On/Off");

        // Add an item listener for the toggle button.
        jtbn.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent ie) {
                if (jtbn.isSelected())
                    jlab.setText("Button is on.");
                else
                    jlab.setText("Button is off.");
            }
        });

        // Add the toggle button and label to the content pane.
        add(jtbn);
        add(jlab);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JToggleButtonDemo frame = new JToggleButtonDemo();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(200, 80);
                frame.setVisible(true);
            }
        });
    }
}
