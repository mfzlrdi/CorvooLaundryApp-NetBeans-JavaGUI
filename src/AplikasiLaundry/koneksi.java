/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AplikasiLaundry;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Corvoo
 */
public class koneksi {
        Connection con;
        Statement stm;

        public void dbconfig() {
                try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        con = DriverManager.getConnection("jdbc:mysql://localhost/laundryCorvoo", "root", "");
                        stm = con.createStatement();
                        JOptionPane.showMessageDialog(null, "Koneksi Berhasil");
                } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Koneksi Gagal" + e.getMessage());
                }
        }
}
