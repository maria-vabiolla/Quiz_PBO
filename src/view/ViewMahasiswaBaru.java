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
public class ViewMahasiswaBaru implements ActionListener{
    JFrame layout = new JFrame("View Insert Mahasiswa Baru");
    JPanel dataPanel;
    JLabel title, labelNIM, labelNama, labelAngkatan, labelJurusan;
    JTextArea nim, nama, angkatan;
    JComboBox jurusan;
    JButton back, submit;
    
    public ViewMahasiswaBaru() {
        layout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        layout.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        title = new JLabel("I N S E R T   M A H A S I S W A   B A R U",JLabel.CENTER);
        title.setBounds(0,0, (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth(),(int)Toolkit.getDefaultToolkit().getScreenSize().getHeight()/5);
        title.setFont(new Font("Impact",Font.PLAIN,50));
        
        labelNIM = new JLabel("NIM");
        labelNIM.setBounds(600,10,200,50);
        nim =  new JTextArea();
        nim.setBounds(820, 10, 300,50);
        
        labelNama = new JLabel("Nama Mahasiswa");
        labelNama.setBounds(600,70,200,50);
        nama =  new JTextArea();
        nama.setBounds(820, 70, 300,50);
        
        labelAngkatan = new JLabel("Angkatan");
        labelAngkatan.setBounds(600, 130, 200,50);
        angkatan = new JTextArea();
        angkatan.setBounds(820,130,300,50);
        
        labelJurusan = new JLabel("Jurusan");
        labelJurusan.setBounds(820,190, 200,50);
        jurusan = new JComboBox();
        jurusan.setBounds(820,190,300,50);
        
        back = new JButton("<< Back");
        back.setBounds(600,250,150,50);
        back.addActionListener(this);
        
        submit = new JButton("Submit");
        submit.setBounds(900, 250,150,50);
        submit.addActionListener(this);
        
        dataPanel = new JPanel();
        dataPanel.setLayout(null);
        
        dataPanel.add(labelNIM);
        dataPanel.add(nim);
        dataPanel.add(labelNama);
        dataPanel.add(nama);
        dataPanel.add(labelAngkatan);
        dataPanel.add(angkatan);
        dataPanel.add(labelJurusan);
        dataPanel.add(jurusan);
        dataPanel.add(back);
        dataPanel.add(submit);
        dataPanel.setBounds(0,(int)Toolkit.getDefaultToolkit().getScreenSize().getHeight()/5,(int)Toolkit.getDefaultToolkit().getScreenSize().getWidth(),500);
        
        layout.add(title);
        layout.add(dataPanel);
        layout.setLayout(null);
        layout.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String buttonClick = e.getActionCommand();
        switch(buttonClick){
            case "<< Back" :
                layout.dispose();
                new MainView();
                break;
            case "Submit":
//                String nim = this.nim.getText();
//                String nama = this.nama.getText();
//                Mahasiswa newJurusan = new Jurusan(kode,nama);
//                if(controller.controller.insertNewJurusan(newJurusan)){
//                    layout.dispose();
//                    JOptionPane.showMessageDialog(null,"Insert Berhasil");
//                }else{
//                    JOptionPane.showMessageDialog(null, "insert failed!", "Alert", JOptionPane.WARNING_MESSAGE);
//                }
                layout.dispose();
                break;
        }
    }
}
