/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlineproject;

import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Ankit Bhawsar
 */
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    public HomePage() {
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

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        username1 = new javax.swing.JTextField();
        user_password = new javax.swing.JPasswordField();
        userregisterbutton = new javax.swing.JButton();
        userloginbutton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("USER LOGIN");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(330, 340, 370, 40);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("PASSWORD");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(270, 520, 210, 40);

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("USERNAME");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(270, 450, 210, 40);

        username1.setFont(new java.awt.Font("Trebuchet MS", 0, 30)); // NOI18N
        getContentPane().add(username1);
        username1.setBounds(530, 450, 210, 40);

        user_password.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        getContentPane().add(user_password);
        user_password.setBounds(530, 520, 210, 40);

        userregisterbutton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        userregisterbutton.setText("Register");
        userregisterbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userregisterbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(userregisterbutton);
        userregisterbutton.setBounds(440, 660, 160, 50);

        userloginbutton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        userloginbutton.setText("Log In");
        userloginbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userloginbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(userloginbutton);
        userloginbutton.setBounds(440, 590, 160, 50);

        jLabel3.setBackground(new java.awt.Color(0, 51, 102));
        jLabel3.setFont(new java.awt.Font("SimSun", 0, 13)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Documents\\NetBeansProjects\\AirlineProject\\Pictures\\Silver.jpg")); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(220, 270, 600, 500);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("ADMIN LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1720, 30, 150, 40);

        jLabel2.setBackground(new java.awt.Color(0, 0, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Documents\\NetBeansProjects\\AirlineProject\\Pictures\\Header.jpg")); // NOI18N
        jLabel2.setToolTipText("");
        jLabel2.setRequestFocusEnabled(false);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1920, 100);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Documents\\NetBeansProjects\\AirlineProject\\Pictures\\Wall1.jpg")); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jLabel1.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jLabel1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        this.setVisible(false);
        new AdminLogin().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void userregisterbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userregisterbuttonActionPerformed
       
        this.setVisible(false);
        new UserRegister().setVisible(true);
    }//GEN-LAST:event_userregisterbuttonActionPerformed

    private void userloginbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userloginbuttonActionPerformed
       
        
        String name=username1.getText();
        String pass=user_password.getText();
        
         try{
             
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/airline_db","root","");
            
             
            String sql="Select * from user where username=? and user_password= ?;";
            
            PreparedStatement pst;
            pst =con.prepareStatement(sql);
            pst.setString(1,name);
            pst.setString(2,pass);
            ResultSet rs=pst.executeQuery();
                                   
           boolean found=false,found2=false;
            while(rs.next())  
            {
                if(rs.getString("username").equalsIgnoreCase(name))
                {      
                    found=true;
                    if(rs.getString("user_password").equalsIgnoreCase(pass))
                        found2=true;                    
                }
                
            }
            
            String query="select block_state from user where username=?";
            
            PreparedStatement pst1;
            pst1 =con.prepareStatement(query);
            pst1.setString(1,name);
            ResultSet rs1=pst1.executeQuery();
            rs1.beforeFirst();
            if(found == true && found2 == true)
            {
                
            while(rs1.next())  
            {
                if((rs1.getInt("block_state")==0))
                {
                    JOptionPane.showMessageDialog(this,"Successfully Logged In");
                    this.setVisible(false);
                    

                    String makedeactive="update user set active_user=0";        
                    PreparedStatement pst3;
                    pst3 =con.prepareStatement(makedeactive);
                    pst3.executeUpdate();

                    String makeactive="update user set active_user=1 where username=?;";                 
                    PreparedStatement pst2;
                    pst2 =con.prepareStatement(makeactive);
                    pst2.setString(1,name);                
                    pst2.executeUpdate();
                
                    new UserHome().setVisible(true);                    
                }
                else{
                    JOptionPane.showMessageDialog(this,"Sorry, you have been Blocked!\nContact your Admin");              
                }
            }
                
                
            }
            else if(found == false || found2 == false)
            {
                    JOptionPane.showMessageDialog(this,"Incorrect Details");
            }
            
        }
        catch(Exception r){
            System.out.println(r);
        }     
    }//GEN-LAST:event_userloginbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField user_password;
    private javax.swing.JButton userloginbutton;
    private javax.swing.JTextField username1;
    private javax.swing.JButton userregisterbutton;
    // End of variables declaration//GEN-END:variables

    void setvisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Component UserHome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
