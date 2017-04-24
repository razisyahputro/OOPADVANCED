/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Aldi Azmy
 */
public class KoneksiDB {
    
    private Connection koneksi;
    
    public Connection getKoneksi() {  
        return koneksi;  
    }
    
    public void koneksiDatabase() { //<-- untuk koneksi ke database  
        // Cek Driver  
        try {  
            Class.forName("com.mysql.jdbc.Driver"); //<-- nama driver untuk koneksi ke MySQL  
  
            // Cek Database  
            try {  
                String url, user, password;  
                url = "jdbc:mysql://localhost:3306/soal_1 kelompok"; //alamat DB  
                user = "root";  
                password = "";  
                koneksi = DriverManager.getConnection(url, user, password);  
    
            } catch (SQLException se) {  
                JOptionPane.showMessageDialog(null, "Koneksi Gagal! ");  
                System.exit(0);  
            }  
        } catch (ClassNotFoundException cnfe) {  
            JOptionPane.showMessageDialog(null, "Driver Tidak Ditemukan!" + cnfe);  
            System.exit(0);  
        }  
    }
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new KoneksiDB().koneksiDatabase();
    }
}
