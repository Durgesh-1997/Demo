//// Demonstrate an icon-based JButton.
//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
///*
//<applet code="JButtonDemo" width=250 height=450>
//</applet>
//*/
//public class JButtonDemo extends JApplet
//        implements ActionListener {
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
//// Add buttons to content pane.
//        ImageIcon france = new ImageIcon("france.gif");
//        JButton jb = new JButton(france);
//        jb.setActionCommand("France");
//        jb.addActionListener(this);
//        add(jb);
//        ImageIcon germany = new ImageIcon("germany.gif");
//        jb = new JButton(germany);
//        jb.setActionCommand("Germany");
//        jb.addActionListener(this);
//        add(jb);
//        ImageIcon italy = new ImageIcon("italy.gif");
//        jb = new JButton(italy);
//        jb.setActionCommand("Italy");
//        jb.addActionListener(this);
//        add(jb);
//        ImageIcon japan = new ImageIcon("japan.gif");
//        jb = new JButton(japan);
//        jb.setActionCommand("Japan");
//        jb.addActionListener(this);
//        add(jb);
//// Create and add the label to content pane.
//        jlab = new JLabel("Choose a Flag");
//        add(jlab);
//    }
//    // Handle button events.
//    public void actionPerformed(ActionEvent ae) {
//        jlab.setText("You selected " + ae.getActionCommand());
//    }
//}



//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
//
//public class JButtonDemo extends JFrame implements ActionListener {
//    JLabel jlab;
//
//    public JButtonDemo() {
//        makeGUI();
//    }
//
//    private void makeGUI() {
//        // Change to flow layout.
//        setLayout(new FlowLayout());
//
//        // Add buttons to content pane.
//        ImageIcon france = new ImageIcon("france.gif");
//        JButton jb = new JButton(france);
//        jb.setActionCommand("France");
//        jb.addActionListener(this);
//        add(jb);
//
//        ImageIcon germany = new ImageIcon("germany.gif");
//        jb = new JButton(germany);
//        jb.setActionCommand("Germany");
//        jb.addActionListener(this);
//        add(jb);
//
//        ImageIcon italy = new ImageIcon("italy.gif");
//        jb = new JButton(italy);
//        jb.setActionCommand("Italy");
//        jb.addActionListener(this);
//        add(jb);
//
//        ImageIcon japan = new ImageIcon("japan.gif");
//        jb = new JButton(japan);
//        jb.setActionCommand("Japan");
//        jb.addActionListener(this);
//        add(jb);
//
//        // Create and add the label to the content pane.
//        jlab = new JLabel("Choose a Flag");
//        add(jlab);
//    }
//
//    // Handle button events.
//    public void actionPerformed(ActionEvent ae) {
//        jlab.setText("You selected " + ae.getActionCommand());
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(new Runnable() {
//            public void run() {
//                JButtonDemo frame = new JButtonDemo();
//                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//                frame.setSize(250, 450);
//                frame.setVisible(true);
//            }
//        });
//    }
//}


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JButtonDemo extends JFrame implements ActionListener {
    JLabel jlab;

    public JButtonDemo() {
        makeGUI();
    }

    private void makeGUI() {
        // Change to flow layout.
        setLayout(new FlowLayout());

        // Add buttons to content pane.
        addButtonWithIcon("images/france.gif", "France");
        addButtonWithIcon("images/germany.gif", "Germany");
        addButtonWithIcon("images/italy.gif", "Italy");
        addButtonWithIcon("images/japan.gif", "Japan");

        // Create and add the label to the content pane.
        jlab = new JLabel("Choose a Flag");
        add(jlab);
    }

    private void addButtonWithIcon(String imagePath, String actionCommand) {
        ImageIcon icon = new ImageIcon(imagePath);
        JButton jb;

        // Check if the image was loaded successfully
        if (icon.getImageLoadStatus() == MediaTracker.ERRORED) {
            System.out.println("Image " + imagePath + " could not be loaded.");
            jb = new JButton(actionCommand); // Use text as a fallback
        } else {
            jb = new JButton(icon);
        }

        jb.setActionCommand(actionCommand);
        jb.addActionListener(this);
        add(jb);
    }

    // Handle button events.
    public void actionPerformed(ActionEvent ae) {
        jlab.setText("You selected " + ae.getActionCommand());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JButtonDemo frame = new JButtonDemo();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(1000, 1000);
                frame.setVisible(true);
            }
        });
    }
}

