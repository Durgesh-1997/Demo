//// Demonstrate JCheckbox.
//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
///*
//<applet code="JCheckBoxDemo" width=270 height=50>
//</applet>
//*/
//public class JCheckBoxDemo extends JApplet
//        implements ItemListener {
//    JLabel jlab;
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
//// Add check boxes to the content pane.
//        JCheckBox cb = new JCheckBox("C");
//        cb.addItemListener(this);
//        add(cb);
//        cb = new JCheckBox("C++");
//        cb.addItemListener(this);
//        add(cb);
//        cb = new JCheckBox("Java");
//        cb.addItemListener(this);
//        add(cb);
//        cb = new JCheckBox("Perl");
//        cb.addItemListener(this);
//        add(cb);
//// Create the label and add it to the content pane.
//        jlab = new JLabel("Select languages");
//        add(jlab);
//    }
//    // Handle item events for the check boxes.
//    public void itemStateChanged(ItemEvent ie) {
//        JCheckBox cb = (JCheckBox)ie.getItem();
//        if(cb.isSelected())
//            jlab.setText(cb.getText() + " is selected");
//        else
//            jlab.setText(cb.getText() + " is cleared");
//    }
//}


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JCheckBoxDemo extends JFrame implements ItemListener {
    JLabel jlab;

    public JCheckBoxDemo() {
        makeGUI();
    }

    private void makeGUI() {
        // Change to flow layout.
        setLayout(new FlowLayout());

        // Add check boxes to the content pane.
        JCheckBox cb = new JCheckBox("C");
        cb.addItemListener(this);
        add(cb);

        cb = new JCheckBox("C++");
        cb.addItemListener(this);
        add(cb);

        cb = new JCheckBox("Java");
        cb.addItemListener(this);
        add(cb);

        cb = new JCheckBox("Perl");
        cb.addItemListener(this);
        add(cb);

        // Create the label and add it to the content pane.
        jlab = new JLabel("Select languages");
        add(jlab);
    }

    // Handle item events for the check boxes.
    public void itemStateChanged(ItemEvent ie) {
        JCheckBox cb = (JCheckBox) ie.getItem();
        if (cb.isSelected())
            jlab.setText(cb.getText() + " is selected");
        else
            jlab.setText(cb.getText() + " is cleared");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JCheckBoxDemo frame = new JCheckBoxDemo();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(270, 100);
                frame.setVisible(true);
            }
        });
    }
}
