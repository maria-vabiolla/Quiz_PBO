/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Jurusan;

/**
 *
 * @author maria
 */
public class controller {
    static DatabaseHandler conn = new DatabaseHandler();
    
    //insert jurusan baru
    public static boolean insertNewJurusan(Jurusan newJurusan){
        conn.connect();
        String query = "INSERT INTO jurusan (kode, nama) VALUES (?,?)";
        try{
            PreparedStatement stmt = conn.con.prepareStatement(query);
            stmt.setString(1, newJurusan.getKode());
            stmt.setString(2, newJurusan.getNama());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
