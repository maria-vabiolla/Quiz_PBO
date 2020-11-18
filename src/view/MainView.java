/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author maria
 */
public class MainView implements ActionListener{
    JFrame layoutMainView = new JFrame("Main View");
    JButton insertJurusanBaru, lihatData, insertMahasiswaBaru, lihatDataPerJurusan;
    JPanel buttonPanel;
    JLabel title;
    
    public MainView(){
        layoutMainView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        layoutMainView.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        title = new JLabel("W E L C O M E   T O   S I A   I T H B",JLabel.CENTER);
        title.setBounds(0,0, (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth(),(int)Toolkit.getDefaultToolkit().getScreenSize().getHeight()/5);
        title.setFont(new Font("Impact",Font.PLAIN,50));
        
        insertJurusanBaru = new JButton("Insert Jurusan Baru");
        insertJurusanBaru.setBounds(500, 50, 200, 50);
        insertJurusanBaru.addActionListener(this);
        
        lihatData = new JButton("Lihat Data Semua Jurusan");
        lihatData.setBounds(750, 50, 200,50);
        lihatData.addActionListener(this);
        
        insertMahasiswaBaru = new JButton("Insert Data Mahasiswa Baru");
        insertMahasiswaBaru.setBounds(1000,50,200,50);
        insertMahasiswaBaru.addActionListener(this);
        
        lihatDataPerJurusan = new JButton("Lihat Data Per Jurursan");
        lihatDataPerJurusan.setBounds(1250,50,200,50);
        lihatDataPerJurusan.addActionListener(this);
        
        buttonPanel = new JPanel();
        buttonPanel.setLayout(null);
        
        buttonPanel.add(insertJurusanBaru);
        buttonPanel.add(lihatData);
        buttonPanel.add(insertMahasiswaBaru);
        buttonPanel.add(lihatDataPerJurusan);
        buttonPanel.setBounds(0,(int)Toolkit.getDefaultToolkit().getScreenSize().getHeight()/5,(int)Toolkit.getDefaultToolkit().getScreenSize().getWidth(),500);
        
        layoutMainView.add(title);
        layoutMainView.add(buttonPanel);
        layoutMainView.setLayout(null);
        layoutMainView.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String buttonClick = e.getActionCommand();
        switch(buttonClick){
            case "Insert Jurusan Baru" :
                layoutMainView.dispose();
                new ViewInsertJurusanBaru();
                break;
            case "Lihat Data Semua Jurusan":
                layoutMainView.dispose();
                new ViewDataSemuaJurusan();
                break;
            case "Insert Data Mahasiswa Baru" :
                layoutMainView.dispose();
                new ViewMahasiswaBaru();
                break;
            case "Lihat Data Per Jurusan":
                layoutMainView.dispose();
                break;
        }
    }
}
