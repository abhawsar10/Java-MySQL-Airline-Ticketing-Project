/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlineproject;

import java.awt.Component;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Ankit Bhawsar
 */
public class UserHome extends javax.swing.JFrame {

    /**
     * Creates new form UserHome
     */
    public UserHome() {
        initComponents();
setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        
            try
            {
        
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/airline_db","root","");


                String active_user_name;
                int active_user_credits;

                String sql="select * from user where active_user=1;";
                PreparedStatement pst;
                pst =con.prepareStatement(sql);
                ResultSet r=pst.executeQuery();
                
                r.next();
                active_user_name=r.getString("fname");
                active_user_credits=r.getInt("credits");



                jLabel1.setText("Welcome " +active_user_name);
                jLabel2.setText("CREDITS: " +active_user_credits);
            }
            catch(Exception r){
            System.out.println(r);
            JOptionPane.showMessageDialog(this,r);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BookFlightButton = new javax.swing.JButton();
        ShowBookingsButton = new javax.swing.JButton();
        UpdateProfileButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Entries = new javax.swing.JLabel();
        SignOutButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Header = new javax.swing.JLabel();
        wall = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        BookFlightButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BookFlightButton.setText("Book a Flight");
        BookFlightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookFlightButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BookFlightButton);
        BookFlightButton.setBounds(1330, 410, 290, 60);

        ShowBookingsButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ShowBookingsButton.setText("Manage My Bookings");
        ShowBookingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowBookingsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ShowBookingsButton);
        ShowBookingsButton.setBounds(1330, 500, 290, 60);

        UpdateProfileButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        UpdateProfileButton1.setText("Update Profile");
        UpdateProfileButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateProfileButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(UpdateProfileButton1);
        UpdateProfileButton1.setBounds(1330, 590, 290, 60);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(1240, 250, 460, 60);

        Entries.setBackground(new java.awt.Color(0, 51, 102));
        Entries.setFont(new java.awt.Font("SimSun", 0, 13)); // NOI18N
        Entries.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Documents\\NetBeansProjects\\AirlineProject\\Pictures\\Silver.jpg")); // NOI18N
        Entries.setText("jLabel3");
        getContentPane().add(Entries);
        Entries.setBounds(1200, 200, 530, 600);

        SignOutButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SignOutButton.setText("SIGN OUT");
        SignOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignOutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SignOutButton);
        SignOutButton.setBounds(1720, 30, 150, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(1500, 30, 190, 40);

        Header.setBackground(new java.awt.Color(0, 0, 102));
        Header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Header.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Documents\\NetBeansProjects\\AirlineProject\\Pictures\\Header.jpg")); // NOI18N
        Header.setToolTipText("");
        Header.setRequestFocusEnabled(false);
        getContentPane().add(Header);
        Header.setBounds(0, 0, 1920, 100);

        wall.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wall.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Documents\\NetBeansProjects\\AirlineProject\\Pictures\\Wall7.jpg")); // NOI18N
        getContentPane().add(wall);
        wall.setBounds(0, 0, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SignOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignOutButtonActionPerformed

        this.setVisible(false);
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/airline_db","root","");
        
        String makeactive="update user set active_user=0 where active_user=1;";                 
        PreparedStatement pst2;
        pst2 =con.prepareStatement(makeactive);              
        pst2.executeUpdate();
            
        } 
        catch(Exception r){
            System.out.println(r);
        }
             
        new HomePage().setVisible(true);
    }//GEN-LAST:event_SignOutButtonActionPerformed

    private void UpdateProfileButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateProfileButton1ActionPerformed
        
        this.setVisible(false);
        new UpdateUser().setVisible(true);
    }//GEN-LAST:event_UpdateProfileButton1ActionPerformed

    private void BookFlightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookFlightButtonActionPerformed
       
        this.setVisible(false);
        new BookFlight().setVisible(true);
    }//GEN-LAST:event_BookFlightButtonActionPerformed

    private void ShowBookingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowBookingsButtonActionPerformed
        
        this.setVisible(false);
        new ManageBooking().setVisible(true);
        
    }//GEN-LAST:event_ShowBookingsButtonActionPerformed

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
            java.util.logging.Logger.getLogger(UserHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserHome().setVisible(true);
            }

            private Component UserHome() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BookFlightButton;
    private javax.swing.JLabel Entries;
    private javax.swing.JLabel Header;
    private javax.swing.JButton ShowBookingsButton;
    private javax.swing.JButton SignOutButton;
    private javax.swing.JButton UpdateProfileButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel wall;
    // End of variables declaration//GEN-END:variables
}