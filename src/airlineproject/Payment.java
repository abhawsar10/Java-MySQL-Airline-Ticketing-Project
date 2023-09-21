/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlineproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Ankit Bhawsar
 */
public class Payment extends javax.swing.JFrame {

    /**
     * Creates new form Payment
     */
    public Payment() {
        initComponents();
setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        
        try{
            
        
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/airline_db","root","");  

            String QUERY="select sum(total_price) from booking where paid=0 and username=(select username from user where active_user=1);";
            PreparedStatement PST;
            PST = con.prepareStatement(QUERY);
            ResultSet RS = PST.executeQuery();
            RS.next();
            String pricedue=RS.getString("sum(total_price)");
            
            DisplayPaymentDue.setText("PAYMENT DUE= "+pricedue );
                    
                
                int active_user_credits;

                String sql="select * from user where active_user=1;";
                PreparedStatement pst;
                pst =con.prepareStatement(sql);
                ResultSet r=pst.executeQuery();
                
                r.next();
                active_user_credits=r.getInt("credits");

                jLabel10.setText("CREDITS: " +active_user_credits);
    
                    
                    
        }
        catch(Exception e){
                    System.out.println(e);
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

        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        DisplayPaymentDue = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CVV = new javax.swing.JPasswordField();
        NameOnCard = new javax.swing.JTextField();
        ExpDate = new javax.swing.JTextField();
        CardNo = new javax.swing.JTextField();
        PayButton = new javax.swing.JButton();
        PayButton2 = new javax.swing.JButton();
        PayButton1 = new javax.swing.JButton();
        BankUserId = new javax.swing.JTextField();
        BankAcc = new javax.swing.JTextField();
        BankPassword = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Entries = new javax.swing.JLabel();
        HomeButton = new javax.swing.JButton();
        Header = new javax.swing.JLabel();
        wall = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(330, 640, 420, 10);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(350, 280, 400, 10);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(350, 378, 400, 10);

        DisplayPaymentDue.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        DisplayPaymentDue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(DisplayPaymentDue);
        DisplayPaymentDue.setBounds(200, 180, 510, 60);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(jLabel10);
        jLabel10.setBounds(220, 310, 200, 50);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Pay By Credits");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(180, 260, 160, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Netbanking");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 620, 160, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Card Payment");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 360, 160, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Name on Card");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(210, 500, 150, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Card Number");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(210, 420, 150, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Exp Date");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(210, 460, 150, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("CVV");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(460, 460, 150, 30);

        CVV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(CVV);
        CVV.setBounds(590, 460, 120, 30);

        NameOnCard.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(NameOnCard);
        NameOnCard.setBounds(350, 500, 360, 30);

        ExpDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(ExpDate);
        ExpDate.setBounds(350, 460, 120, 30);

        CardNo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(CardNo);
        CardNo.setBounds(350, 420, 360, 30);

        PayButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        PayButton.setText("PAY");
        PayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayButtonActionPerformed(evt);
            }
        });
        getContentPane().add(PayButton);
        PayButton.setBounds(500, 310, 160, 50);

        PayButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        PayButton2.setText("PAY");
        PayButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(PayButton2);
        PayButton2.setBounds(370, 810, 160, 50);

        PayButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        PayButton1.setText("PAY");
        PayButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(PayButton1);
        PayButton1.setBounds(370, 560, 160, 50);

        BankUserId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(BankUserId);
        BankUserId.setBounds(350, 720, 360, 30);

        BankAcc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(BankAcc);
        BankAcc.setBounds(350, 680, 360, 30);

        BankPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(BankPassword);
        BankPassword.setBounds(350, 760, 360, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Bank Account No.");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(190, 680, 150, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("User ID");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(210, 720, 150, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Password");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(210, 760, 150, 30);

        Entries.setBackground(new java.awt.Color(0, 51, 102));
        Entries.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Entries.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Documents\\NetBeansProjects\\AirlineProject\\Pictures\\Silver.jpg")); // NOI18N
        Entries.setText("Pay");
        Entries.setToolTipText("");
        getContentPane().add(Entries);
        Entries.setBounds(160, 140, 590, 760);

        HomeButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        HomeButton.setText("HOME");
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(HomeButton);
        HomeButton.setBounds(1720, 30, 150, 40);

        Header.setBackground(new java.awt.Color(0, 0, 102));
        Header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Header.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Documents\\NetBeansProjects\\AirlineProject\\Pictures\\Header.jpg")); // NOI18N
        Header.setToolTipText("");
        Header.setRequestFocusEnabled(false);
        getContentPane().add(Header);
        Header.setBounds(0, 0, 1920, 100);

        wall.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        wall.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Documents\\NetBeansProjects\\AirlineProject\\Pictures\\wall23.jpg")); // NOI18N
        getContentPane().add(wall);
        wall.setBounds(1, 6, 2550, 1600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed

        this.setVisible(false);
        new UserHome().setVisible(true);
    }//GEN-LAST:event_HomeButtonActionPerformed

    private void PayButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayButton2ActionPerformed
        
        
        String acc=BankAcc.getText();
        String id=BankUserId.getText();
        String bpass=BankPassword.getText();
        int error=0;
        
        
        if(acc.length()>18 || acc.length()<18)
        {
            JOptionPane.showMessageDialog(this,"Bank Account Number Invalid");
            error=1;
        }
        
        if(error==0)
        {
        try{
            
            
                Class.forName("com.mysql.jdbc.Driver");  
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/airline_db","root","");  

                String Q1="select booking_id from booking where paid=0 and username=(select username from user where active_user=1);";
                
                String Q2="insert into netbank values(?,?,?,?);";                
                PreparedStatement P2;
                P2 = con.prepareStatement(Q2);
                
                
                PreparedStatement P1;
                P1 = con.prepareStatement(Q1);
                ResultSet R1 = P1.executeQuery();
                
                while(R1.next())
                {
                    String getbook=R1.getString("booking_id");
                    System.out.println("Booking id="+getbook);
                    P2.setString(1,getbook);
                    P2.setString(2,acc);
                    P2.setString(3,id);
                    P2.setString(4,bpass);
                    P2.executeUpdate();
                                       
                } 
                
                String Q3="update booking set paid=1 "
                        + "where paid=0 and username=(select username from user where active_user=1);";
                
                PreparedStatement P3;
                P3 = con.prepareStatement(Q3);
                P3.executeUpdate();
                
                JOptionPane.showMessageDialog(this,"Payment Successful");
                this.setVisible(false);
                new UserHome().setVisible(true);
        }
             
        catch(Exception e){
                    System.out.println(e);
                }
        }
        
       
    }//GEN-LAST:event_PayButton2ActionPerformed

    private void PayButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayButton1ActionPerformed
        
        String card=CardNo.getText();
        String exp=ExpDate.getText();
        String cvv=CVV.getText();
        String name=NameOnCard.getText();
        int error=0;
        
        
        if(card.length()>16 || card.length()<16)
        {
            JOptionPane.showMessageDialog(this,"Card Number Invalid");
            error=1;
        }
        if(cvv.length()>3 || cvv.length()<3)
        {
            JOptionPane.showMessageDialog(this,"CVV Incorrect");
            error=1;
        }
        if(!exp.contains("/"))
        {
            JOptionPane.showMessageDialog(this,"Expiry Date Format Incorrect");
            error=1;
        }
        
        if(error==0)
        {
        try{
            
            
                Class.forName("com.mysql.jdbc.Driver");  
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/airline_db","root","");  

                String Q1="select booking_id from booking where paid=0 and username=(select username from user where active_user=1);";
                
                String Q2="insert into credit_card(booking_id,card_no,cvv,exp,name) values(?,?,?,?,?);";                
                PreparedStatement P2;
                P2 = con.prepareStatement(Q2);
                
                
                PreparedStatement P1;
                P1 = con.prepareStatement(Q1);
                ResultSet R1 = P1.executeQuery();
                
                while(R1.next())
                {
                    String getbook=R1.getString("booking_id");
                    System.out.println("Booking id="+getbook);
                    P2.setString(1,getbook);
                    P2.setString(2,card);
                    P2.setString(3,cvv);
                    P2.setString(4,exp);
                    P2.setString(5,name);
                    P2.executeUpdate();
                                       
                } 
                
                String Q3="update booking set paid=1 "
                        + "where paid=0 and username=(select username from user where active_user=1);";
                
                PreparedStatement P3;
                P3 = con.prepareStatement(Q3);
                P3.executeUpdate();
                
                JOptionPane.showMessageDialog(this,"Payment Successful");
                JOptionPane.showMessageDialog(this,"You can print your ticket in 'Manage my Bookings' Section");
                this.setVisible(false);
               // ManageBooking obj=new ManageBooking();
                //obj.PrintTicket();
                new UserHome().setVisible(true);
        }
        
        
        
        
        catch(Exception e){
                    System.out.println(e);
                }
        }
        
        
        
    }//GEN-LAST:event_PayButton1ActionPerformed

    private void PayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayButtonActionPerformed


        try{
            
        
                Class.forName("com.mysql.jdbc.Driver");  
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/airline_db","root","");  

                String QUERY="select sum(total_price) from booking where paid=0 and username=(select username from user where active_user=1);";
                PreparedStatement PST;
                PST = con.prepareStatement(QUERY);
                ResultSet RS = PST.executeQuery();
                RS.next();
                int pricedue=RS.getInt("sum(total_price)");

                int active_user_credits;

                String sql="select * from user where active_user=1;";
                PreparedStatement pst;
                pst =con.prepareStatement(sql);
                ResultSet r=pst.executeQuery();
                
                r.next();
                active_user_credits=r.getInt("credits");

                    
                if(active_user_credits < pricedue)
                {
                    JOptionPane.showMessageDialog(this,"Not Enough Credits");                    
                }
                else
                {
                    
                String QUERY1="update user set credits=credits-? where active_user=1;";
                PreparedStatement PST1;
                PST1 = con.prepareStatement(QUERY1);
                PST1.setInt(1,pricedue);
                PST1.executeUpdate();
                    
                String Q3="update booking set paid=1 "
                        + "where paid=0 and username=(select username from user where active_user=1);";
                
                PreparedStatement P3;
                P3 = con.prepareStatement(Q3);
                P3.executeUpdate();
                
                JOptionPane.showMessageDialog(this,"Payment Successful");
                this.setVisible(false);
                
                new UserHome().setVisible(true);
                    
                    
                    
                }
                
                    
        }
        catch(Exception e){
                    System.out.println(e);
                }
        
        
        
        
    }//GEN-LAST:event_PayButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BankAcc;
    private javax.swing.JPasswordField BankPassword;
    private javax.swing.JTextField BankUserId;
    private javax.swing.JPasswordField CVV;
    private javax.swing.JTextField CardNo;
    private javax.swing.JLabel DisplayPaymentDue;
    private javax.swing.JLabel Entries;
    private javax.swing.JTextField ExpDate;
    private javax.swing.JLabel Header;
    private javax.swing.JButton HomeButton;
    private javax.swing.JTextField NameOnCard;
    private javax.swing.JButton PayButton;
    private javax.swing.JButton PayButton1;
    private javax.swing.JButton PayButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel wall;
    // End of variables declaration//GEN-END:variables
}
