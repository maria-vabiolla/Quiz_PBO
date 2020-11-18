/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author maria
 */
public class ViewDataSemuaJurusan {
    JFrame layout = new JFrame("View Data Semua Jurusan");
    JLabel title, labelKode, labelNama;
    
    public ViewDataSemuaJurusan() {
        layout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        layout.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        title = new JLabel("V I E W   D A T A   S E M U A   J U R U S A N",JLabel.CENTER);
        title.setBounds(0,0, (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth(),(int)Toolkit.getDefaultToolkit().getScreenSize().getHeight()/5);
        title.setFont(new Font("Impact",Font.PLAIN,50));

        layout.add(title);
        layout.setLayout(null);
        layout.setVisible(true);
    }
}
