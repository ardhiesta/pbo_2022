package com.java.p12;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class WindowButton {
    static JButton btn = new JButton();

    private static JButton makeButton() {
		btn.setText("Click me!");
		btn.setBounds(40, 40, 100, 30);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btn, "Hello World!");
			}
		});
		return btn;
	}

    public static void main(String[] args) {
        // membuat objek jendela
        JFrame myWindow = new JFrame();
        
        // berikan judul pada jendela
        myWindow.setTitle("Jendela Program");
        
        // tentukan ukuran jendela
        myWindow.setBounds(100, 100, 180, 140);

        myWindow.add(makeButton());
        
        // tampilkan jendela ke layar
        myWindow.setVisible(true);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
