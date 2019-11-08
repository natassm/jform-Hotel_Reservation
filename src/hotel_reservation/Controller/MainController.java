/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_reservation.Controller;

import hotel_reservation.Koneksi.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Natasha
 */
public class MainController {
    public void get (JTable table, String sql){
        try {
            Koneksi koneksi = new Koneksi();
            Connection con = koneksi.open();
            
            Statement state = con.createStatement();
            ResultSet rs = state.executeQuery(sql);
            
            table.setModel(DbUtils.resultSetToTableModel(rs));
            
            con.close();
            
        }   catch (Exception ex) 
        {
            System.out.println(ex.getMessage());
        }
    }
    
    public void getWithParameter(JTable table, Map map, String sql) {
        try{
            Koneksi koneksi = new Koneksi();
            Connection con = koneksi.open();
            
            PreparedStatement ps = con.prepareStatement(sql);
            
            map.forEach((k,v) -> {
                try {
                    ps.setString((int) k, v.toString());
                } catch (SQLException ex) {
                    Logger.getLogger(MainController.class.getName()).
                            log(Level.SEVERE, null, ex);
                }
            });
            
            ResultSet rs = ps.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
            con.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public boolean preparedStatement(Map<Integer, Object> map, String sql) {
        try{
            Koneksi koneksi = new Koneksi();
            Connection con = koneksi.open();
            PreparedStatement ps = con.prepareStatement(sql);
            
            for(Map.Entry<Integer, Object> entry : map.entrySet()){
                ps.setString(entry.getKey(), entry.getValue().toString());
            }
            
            int rows = ps.executeUpdate();
            System.out.println("prepared Statement Executed!");
            con.close();
            return rows != 0;
        }
        catch(Exception e){
            System.err.println(e.getMessage());
            return false;
        }       
    }
}
