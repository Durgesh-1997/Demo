//// Demonstrate JComboBox.
//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
///*
//<applet code="JComboBoxDemo" width=300 height=100>
//</applet>
//*/
//public class JComboBoxDemo extends JApplet {
//    JLabel jlab;
//    ImageIcon france, germany, italy, japan;
//    JComboBox jcb;
//    String flags[] = { "France", "Germany", "Italy", "Japan" };
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
//// Instantiate a combo box and add it to the content pane.
//        jcb = new JComboBox(flags);
//        add(jcb);
//// Handle selections.
//        jcb.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent ae) {
//                String s = (String) jcb.getSelectedItem();
//                jlab.setIcon(new ImageIcon(s + ".gif"));
//            }
//        });
//// Create a label and add it to the content pane.
//        jlab = new JLabel(new ImageIcon("france.gif"));
//        add(jlab);
//    }
//}



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JComboBoxDemo extends JFrame {
    JLabel jlab;
    JComboBox<String> jcb;
    String flags[] = { "France", "Germany", "Italy", "Japan" };

    public JComboBoxDemo() {
        makeGUI();
    }

    private void makeGUI() {
        // Change to flow layout.
        setLayout(new FlowLayout());

        // Instantiate a combo box and add it to the content pane.
        jcb = new JComboBox<>(flags);
        add(jcb);

        // Handle selections.
        jcb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String selectedFlag = (String) jcb.getSelectedItem();
                jlab.setIcon(new ImageIcon(selectedFlag.toLowerCase() + ".gif"));
            }
        });

        // Create a label and add it to the content pane.
        jlab = new JLabel(new ImageIcon("france.gif"));
        add(jlab);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JComboBoxDemo frame = new JComboBoxDemo();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(300, 150);
                frame.setVisible(true);
            }
        });
    }
}
