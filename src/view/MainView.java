/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.*;

/**
 *
 * @author maria
 */
public class MainView {
    JFrame layoutMainView = new JFrame("Main View");
    
    public MainView(){
        layoutMainView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        layoutMainView.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        layoutMainView.setLayout(null);
        layoutMainView.setVisible(true);
    }
}
