// Demonstrate JLabel and ImageIcon.
import java.awt.*;
import javax.swing.*;


public class JLabelDemo extends JFrame {
    public void init() {
        try {
            SwingUtilities.invokeAndWait(
                    new Runnable() {
                        public void run() {
                            makeGUI();
                        }
                    }

            );
        } catch (Exception exc) {
            System.out.println("Can't create because of " + exc);
        }
    }
    private void makeGUI() {
// Create an icon.
        ImageIcon ii = new ImageIcon("france.gif");
// Create a label.
        JLabel jl = new JLabel("France", ii, JLabel.CENTER);
// Add the label to the content pane.
        add(jl);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JLabelDemo frame = new JLabelDemo();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(250, 150);
                frame.setVisible(true);
            }
        });
    }
}
