/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_reservation.Frame;

import hotel_reservation.Controller.MainController;
import hotel_reservation.Helper.Helper;
import hotel_reservation.Koneksi.Koneksi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Natasha
 */
public class CheckOut extends javax.swing.JFrame {
    private final MainController controller;
    public Booking booking = null;
    public CheckIn ci = null;
    String checkout;
    
    public String id; 
    public String date; 
    public String type;
    public String guestid;
    public String price;


    public String getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getRoomType() {
        return type;
    }
    
    public String getGuestID() {
        return guestid;
    }
    
    public String getPrice() {
        return price;
    }
    
    public void itemTerpilih(){
        Booking booking = new Booking();
        booking.co = this;
        tf_checkinid.setText(id);
        tf_checkindate.setText(date);
        tf_roomnumber.setText(type);
        tf_guestid.setText(guestid);
        tf_roomprice.setText(price);
    }
    
    

    /**
     * Creates new form CheckOut
     */
    public CheckOut() {
        initComponents();
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        MainController mainController = new MainController();
        controller = mainController;
    }
    
    public void clearForm(){
        tf_checkinid.setText(null);
        tf_checkindate.setText(null);
        tf_roomnumber.setText(null);
        tf_roomprice.setText(null);
    }
   
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel16 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        dp_checkout = new org.jdesktop.swingx.JXDatePicker();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_roomnumber = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        label_duration = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        label_totprice = new javax.swing.JLabel();
        btn_duration = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        tf_checkindate = new javax.swing.JTextField();
        btn_checkout = new javax.swing.JButton();
        tf_checkinid = new javax.swing.JTextField();
        btn_searchci = new javax.swing.JButton();
        tf_guestid = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tf_roomprice = new javax.swing.JTextField();
        btn_duration1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Check Out");

        dp_checkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dp_checkoutActionPerformed(evt);
            }
        });

        jLabel4.setText("Check In ID");

        jLabel6.setText("Room Number");

        jLabel7.setFont(new java.awt.Font("Javanese Text", 0, 18)); // NOI18N
        jLabel7.setText("Check Out Date");

        jLabel13.setText("Guest ID");

        jLabel8.setText("Duration of Stay");

        label_duration.setText("0");

        jLabel10.setText("Total Price");

        label_totprice.setText("0");

        btn_duration.setText("Duration");
        btn_duration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_durationActionPerformed(evt);
            }
        });

        jLabel11.setText("Check In Date");

        btn_checkout.setText("Check Out");
        btn_checkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_checkoutActionPerformed(evt);
            }
        });

        btn_searchci.setText("Search Check In");
        btn_searchci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchciActionPerformed(evt);
            }
        });

        jLabel14.setText("Room Price");

        btn_duration1.setText("Price");
        btn_duration1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_duration1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dp_checkout, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(tf_guestid, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_checkinid)
                                    .addComponent(tf_roomnumber, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tf_checkindate, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label_duration)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_duration))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label_totprice)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_duration1)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(tf_roomprice, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_searchci)
                            .addComponent(btn_checkout, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dp_checkout, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_checkinid, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_searchci))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_checkindate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_roomnumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_guestid, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_roomprice, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_duration)
                            .addComponent(btn_duration))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_totprice)
                            .addComponent(btn_duration1))
                        .addContainerGap(34, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_checkout, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dp_checkoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dp_checkoutActionPerformed
        if (dp_checkout.getDate() != null) {
        SimpleDateFormat FormatTanggal = new SimpleDateFormat("yyyy-MM-dd");
        checkout = FormatTanggal.format(dp_checkout.getDate());
        }
    }//GEN-LAST:event_dp_checkoutActionPerformed

    private void btn_durationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_durationActionPerformed
        try{
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date CheckIn_Date = format.parse(tf_checkindate.getText());
            Date CheckOut_Date = format.parse(checkout);
            long CheckIn_Date1 = CheckIn_Date.getTime();
            long CheckOut_Date1 = CheckOut_Date.getTime();
            long diff = CheckOut_Date1 - CheckIn_Date1;
            long duration = diff / (24 * 60 * 60 * 1000);
            label_duration.setText(Long.toString(duration) + "hari");
        
    }                                         
        catch (Exception ex){
                System.err.println(ex.getMessage());
        }
    }//GEN-LAST:event_btn_durationActionPerformed

    private void btn_searchciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchciActionPerformed
        Booking booking = new Booking();
        booking.co = this;
        booking.setVisible(true);
        booking.setResizable(false);
    }//GEN-LAST:event_btn_searchciActionPerformed

    private void btn_duration1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_duration1ActionPerformed
        String duration = label_duration.getText();
        String price = tf_roomprice.getText();
        
        Integer duration2 = Integer.valueOf(duration);
        Integer price2 = Integer.valueOf(price);
        
        int result = (duration2 * price2);
        String result2 = String.valueOf(result);
        label_totprice.setText(result2);
    }//GEN-LAST:event_btn_duration1ActionPerformed

    private void btn_checkoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_checkoutActionPerformed
        try{
            Helper helper = new Helper();
            
            String checkin_id = tf_checkinid.getText();
            String checkin_date = tf_checkindate.getText();
            String number = tf_roomnumber.getText();
            String guestid = tf_guestid.getText();
            String price = tf_roomprice.getText();
             
            String sql = "INSERT INTO checkout (checkout_id, checkin_id,"
                    + "checkout_date, room_number, guest_id) values (?,?,?,?,?)";
       
            Map<Integer, Object> map = new HashMap<>();
            map.put(1, checkin_id);
            map.put(2, checkin_date);
            map.put(3, number);
            map.put(4, guestid);
            map.put(5, price);

            if(!controller.preparedStatement(map, sql)){
                JOptionPane.showMessageDialog(null, "Gagal Menambahkan Data");
            }

            clearForm();
            JOptionPane.showMessageDialog(null, "Berhasil Menambahkan Data");
    } catch (Exception ex) {
    System.out.println(ex.getMessage());
    }   
    }//GEN-LAST:event_btn_checkoutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckOut().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_checkout;
    private javax.swing.JButton btn_duration;
    private javax.swing.JButton btn_duration1;
    private javax.swing.JButton btn_searchci;
    private org.jdesktop.swingx.JXDatePicker dp_checkout;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_duration;
    private javax.swing.JLabel label_totprice;
    private javax.swing.JTextField tf_checkindate;
    private javax.swing.JTextField tf_checkinid;
    private javax.swing.JTextField tf_guestid;
    private javax.swing.JTextField tf_roomnumber;
    private javax.swing.JTextField tf_roomprice;
    // End of variables declaration//GEN-END:variables
}
