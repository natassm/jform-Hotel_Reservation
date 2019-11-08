/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_reservation;

import hotel_reservation.Frame.LogIn_Frame;
import hotel_reservation.Frame.MainFrame;
import hotel_reservation.Koneksi.Koneksi;

/**
 *
 * @author Natasha
 */
public class Hotel_Reservation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LogIn_Frame frame = new LogIn_Frame();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        MainFrame mf = new MainFrame();
        mf.setLocationRelativeTo(null);
        mf.setVisible(true);
        
        Koneksi koneksi = new Koneksi();
        koneksi.open();
    }
    
}
