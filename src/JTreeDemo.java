//// Demonstrate JTree.
//import java.awt.*;
//import javax.swing.event.*;
//import javax.swing.*;
//import javax.swing.tree.*;
///*
//<applet code="JTreeDemo" width=400 height=200>
//</applet>
//*/
//public class JTreeDemo extends JApplet {
//    JTree tree;
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
//// Create top node of tree.
//        DefaultMutableTreeNode top = new DefaultMutableTreeNode("Options");
//// Create subtree of "A".
//        DefaultMutableTreeNode a = new DefaultMutableTreeNode("A");
//        top.add(a);
//        DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("A1");
//        a.add(a1);
//        DefaultMutableTreeNode a2 = new DefaultMutableTreeNode("A2");
//        a.add(a2);
//// Create subtree of "B".
//        DefaultMutableTreeNode b = new DefaultMutableTreeNode("B");
//        top.add(b);
//        DefaultMutableTreeNode b1 = new DefaultMutableTreeNode("B1");
//        b.add(b1);
//        DefaultMutableTreeNode b2 = new DefaultMutableTreeNode("B2");
//        b.add(b2);
//        DefaultMutableTreeNode b3 = new DefaultMutableTreeNode("B3");
//        b.add(b3);
//// Create the tree.
//        tree = new JTree(top);
//// Add the tree to a scroll pane.
//        JScrollPane jsp = new JScrollPane(tree);
//// Add the scroll pane to the content pane.
//        add(jsp);
//// Add the label to the content pane.
//        jlab = new JLabel();
//        add(jlab, BorderLayout.SOUTH);
//// Handle tree selection events.
//        tree.addTreeSelectionListener(new TreeSelectionListener() {
//            public void valueChanged(TreeSelectionEvent tse) {
//                jlab.setText("Selection is " + tse.getPath());
//            }
//        });
//    }
//}




import java.awt.*;
import javax.swing.event.*;
import javax.swing.*;
import javax.swing.tree.*;

public class JTreeDemo extends JFrame {
    JTree tree;
    JLabel jlab;

    public JTreeDemo() {
        makeGUI();
    }

    private void makeGUI() {
        // Create top node of tree.
        DefaultMutableTreeNode top = new DefaultMutableTreeNode("Options");

        // Create subtree of "A".
        DefaultMutableTreeNode a = new DefaultMutableTreeNode("A");
        top.add(a);
        DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("A1");
        a.add(a1);
        DefaultMutableTreeNode a2 = new DefaultMutableTreeNode("A2");
        a.add(a2);

        // Create subtree of "B".
        DefaultMutableTreeNode b = new DefaultMutableTreeNode("B");
        top.add(b);
        DefaultMutableTreeNode b1 = new DefaultMutableTreeNode("B1");
        b.add(b1);
        DefaultMutableTreeNode b2 = new DefaultMutableTreeNode("B2");
        b.add(b2);
        DefaultMutableTreeNode b3 = new DefaultMutableTreeNode("B3");
        b.add(b3);

        // Create the tree.
        tree = new JTree(top);

        // Add the tree to a scroll pane.
        JScrollPane jsp = new JScrollPane(tree);

        // Add the scroll pane to the content pane.
        add(jsp, BorderLayout.CENTER);

        // Add the label to the content pane.
        jlab = new JLabel("Selection is ");
        add(jlab, BorderLayout.SOUTH);

        // Handle tree selection events.
        tree.addTreeSelectionListener(new TreeSelectionListener() {
            public void valueChanged(TreeSelectionEvent tse) {
                TreePath path = tse.getPath();
                Object[] nodes = path.getPath();
                StringBuilder sb = new StringBuilder("Selection is ");
                for (int i = 0; i < nodes.length; i++) {
                    if (i > 0)
                        sb.append(" -> ");
                    sb.append(nodes[i].toString());
                }
                jlab.setText(sb.toString());
            }
        });

        // Set frame properties
        setTitle("JTree Demo");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new JTreeDemo();
            }
        });
    }
}
