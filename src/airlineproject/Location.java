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
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Ankit Bhawsar
 */
public final class Location extends javax.swing.JFrame {

    Connection con1;
    /**
     * Creates new form Location
     */
    public Location() {
        initComponents();
setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
      fillJList();
    }
    
     void fillJList(){
                    //jScrollPane1.add(new JButton("hello"));
                    //jList1.add(new JButton("hello"));
                try{
                    Class.forName("com.mysql.jdbc.Driver");  
                    con1 = DriverManager.getConnection("jdbc:mysql://localhost:3307/airline_db","root","");  

                    PreparedStatement pst1;
                    String sql1 ="SELECT * FROM location ;";
                    pst1 = con1.prepareStatement(sql1);

                    ResultSet rs = pst1.executeQuery(); // without arguments
                    final DefaultListModel model = new DefaultListModel();
                    while(rs.next())  
                    {
                        model.addElement(rs.getString("city"));
                    }
                    ListOfLocations.setModel(model);
                    ListOfLocations.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                }
                catch(Exception e){
                    System.out.println(e);
                }
                
     }

    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        ListOfLocations = new javax.swing.JList<>();
        AddLocationButton = new javax.swing.JButton();
        RemoveLocationButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LocId = new javax.swing.JTextField();
        AirportName = new javax.swing.JTextField();
        CityName = new javax.swing.JTextField();
        LocRunways = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        Entries = new javax.swing.JLabel();
        HomeButton = new javax.swing.JButton();
        Header = new javax.swing.JLabel();
        wall = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        ListOfLocations.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ListOfLocations.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ListOfLocations.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                ListOfLocationsInputMethodTextChanged(evt);
            }
        });
        jScrollPane2.setViewportView(ListOfLocations);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(340, 480, 330, 200);

        AddLocationButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        AddLocationButton.setText("Add Location");
        AddLocationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddLocationButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AddLocationButton);
        AddLocationButton.setBounds(340, 390, 330, 50);

        RemoveLocationButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        RemoveLocationButton.setText("Remove Location");
        RemoveLocationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveLocationButtonActionPerformed(evt);
            }
        });
        getContentPane().add(RemoveLocationButton);
        RemoveLocationButton.setBounds(340, 710, 330, 50);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Location ID");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(340, 170, 160, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Airport Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(500, 170, 170, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("City Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(340, 270, 160, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("No of Runways");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(500, 270, 170, 40);

        LocId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(LocId);
        LocId.setBounds(340, 220, 160, 50);

        AirportName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(AirportName);
        AirportName.setBounds(510, 220, 160, 50);

        CityName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(CityName);
        CityName.setBounds(340, 310, 160, 50);

        LocRunways.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(LocRunways);
        LocRunways.setBounds(510, 310, 160, 50);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(250, 462, 500, 10);

        Entries.setBackground(new java.awt.Color(0, 51, 102));
        Entries.setFont(new java.awt.Font("SimSun", 0, 13)); // NOI18N
        Entries.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Documents\\NetBeansProjects\\AirlineProject\\Pictures\\Silver.jpg")); // NOI18N
        Entries.setText("jLabel3");
        getContentPane().add(Entries);
        Entries.setBounds(250, 140, 500, 660);

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

        wall.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wall.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Documents\\NetBeansProjects\\AirlineProject\\Pictures\\Wall8.jpg")); // NOI18N
        getContentPane().add(wall);
        wall.setBounds(1, 6, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed

        this.setVisible(false);
        new AdminHome().setVisible(true);
    }//GEN-LAST:event_HomeButtonActionPerformed

    private void ListOfLocationsInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_ListOfLocationsInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ListOfLocationsInputMethodTextChanged

    private void AddLocationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddLocationButtonActionPerformed
   
        
        String locid=LocId.getText();
        String locname=AirportName.getText();
        String cityname=CityName.getText();
        String noofrunways=LocRunways.getText();
        
        
          try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/airline_db","root","");

                    String insert1="insert into location(loc_id,airport,city,no_of_runways) values(?,?,?,?);";

                    PreparedStatement pst1;
                    pst1 =con.prepareStatement(insert1);

                    pst1.setString(1,locid);
                    pst1.setString(2,locname);
                    pst1.setString(3,cityname);
                    pst1.setString(4,noofrunways);
                    
                    pst1.executeUpdate();
                    
                    ListOfLocations.removeAll();
                    this.fillJList();
                    JOptionPane.showMessageDialog(this,"Location Added Successfully");

         }
        catch(Exception r){
            System.out.println(r);
            JOptionPane.showMessageDialog(this,r);
        }   
        
    }//GEN-LAST:event_AddLocationButtonActionPerformed

    private void RemoveLocationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveLocationButtonActionPerformed
        
        
        String selected = ListOfLocations.getSelectedValue();
        try
        {
            String query1 = "delete from location where city = ?";
            PreparedStatement st1 = con1.prepareStatement(query1);
            st1.setString(1,selected);
            
            st1.executeUpdate();
            
            ListOfLocations.removeAll();
            this.fillJList();
            JOptionPane.showMessageDialog(this,"Location Removed Successfully");  
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }//GEN-LAST:event_RemoveLocationButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Location.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Location.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Location.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Location.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Location().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddLocationButton;
    private javax.swing.JTextField AirportName;
    private javax.swing.JTextField CityName;
    private javax.swing.JLabel Entries;
    private javax.swing.JLabel Header;
    private javax.swing.JButton HomeButton;
    private javax.swing.JList<String> ListOfLocations;
    private javax.swing.JTextField LocId;
    private javax.swing.JTextField LocRunways;
    private javax.swing.JButton RemoveLocationButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel wall;
    // End of variables declaration//GEN-END:variables


 
}
