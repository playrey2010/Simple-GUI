package com.example.demo;
import javax.swing.*; // this imports the class names from
import javax.swing.UIManager.*; // for Nimbus look


// Swing is composed of containers and components.
// JFrame, below, is one type of container; it includes buttons typically found at the top edge of GUI's.

public class MainFrame extends JFrame {
    public static void showFrame(String plaf) {
        try {
            UIManager.setLookAndFeel(plaf);
        } catch (Exception e) {
            e.printStackTrace();
        }

        JFrame f = new JFrame(plaf);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setSize(350, 100);
        f.setLocationByPlatform(true);
        f.setVisible(true);
    }
    public MainFrame() {
        //set up the frame
        super("This is the main frame!");
        setLookAndFeel();
        setSize(350, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // this method looks for the nimbus skin and adds it to the frame when called.


    private void setLookAndFeel() {


//        try {
//            for (LookAndFeelInfo info: UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (Exception e) {
//            //// If Nimbus is not available, you can set the GUI to another look and feel.
//        }
        try {
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception e) {
            //ignore error
        }
    }

    // Remember to run this method.
    public static void main(String[] args) {
//        MainFrame frame = new MainFrame();
        showFrame(UIManager.getSystemLookAndFeelClassName());
    }
}

