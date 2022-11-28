package com.java.p12;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class WindowTextField {
    static JTextField jTextField;
    static JButton jButton;
    public static void main(String[] args) {
        // membuat objek jendela
        JFrame myWindow = new JFrame();
        
        // berikan judul pada jendela
        myWindow.setTitle("Contoh Window");
        
        // tentukan ukuran jendela
        myWindow.setSize(800, 800);

        // // menambahkan label
        // JLabel jLabel = new JLabel();
        // // set text dalam label
        // jLabel.setText("tes 123");
        // myWindow.add(jLabel);

        jTextField = new JTextField(10);
        jButton = new JButton("submit");
        // create a panel to add buttons and textfield
        JPanel jPanel = new JPanel();

        jPanel.add(jTextField);
        jPanel.add(jButton);
        myWindow.add(jPanel);

        // tampilkan jendela ke layar
        myWindow.setVisible(true);
    }
}
