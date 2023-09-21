/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlineproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ankit Bhawsar
 */
public class AdminHome extends javax.swing.JFrame {

    /**
     * Creates new form AdminHome
     */
    public AdminHome() {
        initComponents();
setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddFlight = new javax.swing.JButton();
        ManageFlights = new javax.swing.JButton();
        AddAdmin = new javax.swing.JButton();
        BlockUser = new javax.swing.JButton();
        AddLoc = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Entries = new javax.swing.JLabel();
        SignOutButton = new javax.swing.JButton();
        Header = new javax.swing.JLabel();
        wall = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        AddFlight.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        AddFlight.setText("Create a Flight");
        AddFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddFlightActionPerformed(evt);
            }
        });
        getContentPane().add(AddFlight);
        AddFlight.setBounds(320, 370, 440, 70);

        ManageFlights.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ManageFlights.setText("Manage Flights");
        ManageFlights.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageFlightsActionPerformed(evt);
            }
        });
        getContentPane().add(ManageFlights);
        ManageFlights.setBounds(320, 480, 440, 70);

        AddAdmin.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        AddAdmin.setText("Add Admin");
        AddAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddAdminActionPerformed(evt);
            }
        });
        getContentPane().add(AddAdmin);
        AddAdmin.setBounds(330, 710, 200, 70);

        BlockUser.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BlockUser.setText("Manage Users");
        BlockUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlockUserActionPerformed(evt);
            }
        });
        getContentPane().add(BlockUser);
        BlockUser.setBounds(580, 710, 190, 70);

        AddLoc.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        AddLoc.setText("Manage Locations");
        AddLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddLocActionPerformed(evt);
            }
        });
        getContentPane().add(AddLoc);
        AddLoc.setBounds(320, 590, 440, 70);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ADMIN HOME");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(370, 270, 370, 40);

        Entries.setBackground(new java.awt.Color(0, 51, 102));
        Entries.setFont(new java.awt.Font("SimSun", 0, 13)); // NOI18N
        Entries.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Documents\\NetBeansProjects\\AirlineProject\\Pictures\\Silver.jpg")); // NOI18N
        Entries.setText("jLabel3");
        getContentPane().add(Entries);
        Entries.setBounds(250, 210, 590, 660);

        SignOutButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SignOutButton.setText("SIGN OUT");
        SignOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignOutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SignOutButton);
        SignOutButton.setBounds(1720, 30, 150, 40);

        Header.setBackground(new java.awt.Color(0, 0, 102));
        Header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Header.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Documents\\NetBeansProjects\\AirlineProject\\Pictures\\Header.jpg")); // NOI18N
        Header.setToolTipText("");
        Header.setRequestFocusEnabled(false);
        getContentPane().add(Header);
        Header.setBounds(0, 0, 1920, 100);

        wall.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wall.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Documents\\NetBeansProjects\\AirlineProject\\Pictures\\Wall14.jpg")); // NOI18N
        getContentPane().add(wall);
        wall.setBounds(1, 6, 1940, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddAdminActionPerformed
        
        this.setVisible(false);
        new AddAdmin().setVisible(true);
    }//GEN-LAST:event_AddAdminActionPerformed

    private void SignOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignOutButtonActionPerformed

        this.setVisible(false);
        
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/airline_db","root","");
        
        String makeactive="update admin set active=0 where active=1;";                 
        PreparedStatement pst2;
        pst2 =con.prepareStatement(makeactive);              
        pst2.executeUpdate();
            
        } 
        catch(Exception r){
            System.out.println(r);
        }
             
        
        new AdminLogin().setVisible(true);
    }//GEN-LAST:event_SignOutButtonActionPerformed

    private void BlockUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlockUserActionPerformed
        this.setVisible(false);                                       
        try {
            new BlockUser().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(AdminHome.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminHome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BlockUserActionPerformed

    private void AddLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddLocActionPerformed
        
        this.setVisible(false);
        new Location().setVisible(true);
    }//GEN-LAST:event_AddLocActionPerformed

    private void AddFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddFlightActionPerformed
     
        this.setVisible(false);
        new AddFlight().setVisible(true);
    }//GEN-LAST:event_AddFlightActionPerformed

    private void ManageFlightsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageFlightsActionPerformed
        
        this.setVisible(false);
        new ShowFlights().setVisible(true);
    }//GEN-LAST:event_ManageFlightsActionPerformed

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
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddAdmin;
    private javax.swing.JButton AddFlight;
    private javax.swing.JButton AddLoc;
    private javax.swing.JButton BlockUser;
    private javax.swing.JLabel Entries;
    private javax.swing.JLabel Header;
    private javax.swing.JButton ManageFlights;
    private javax.swing.JButton SignOutButton;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel wall;
    // End of variables declaration//GEN-END:variables
}
