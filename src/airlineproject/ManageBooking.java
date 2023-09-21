/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlineproject;

import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.itextpdf.text.Document;

/**
 *
 * @author Ankit Bhawsar
 */
public class ManageBooking extends javax.swing.JFrame {

    /**
     * Creates new form ManageBooking
     */
    public ManageBooking() {
        initComponents();
setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        this.fillTable();
    }
    
    public void PrintTicket()
    {
        
       com.itextpdf.text.Document my_ticket = new Document() ;
        
        int selected = BookingTable.getSelectedRow();
        String bookid = BookingTable.getModel().getValueAt(selected, 0).toString();

        
        try{
            
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/airline_db","root","");

                String queryx="select * from booking where booking_id=?;";
                PreparedStatement ps1;
                ps1=con.prepareStatement(queryx);
                ps1.setString(1,bookid);
                ResultSet query_set = ps1.executeQuery();
                
                PdfPTable my_report_table = new PdfPTable(2);
                
                PdfWriter.getInstance(my_ticket, new FileOutputStream("E-TICKET "+bookid+".pdf"));
                my_ticket.open();            
                
                PdfPCell table_cell;
                
                query_set.next();              
                                table_cell=new PdfPCell(new Phrase("BOOKING ID"));
                                my_report_table.addCell(table_cell);
                                                              
                                String booking_id = query_set.getString("booking_id");
                                table_cell=new PdfPCell(new Phrase(booking_id));
                                my_report_table.addCell(table_cell);
                                
                                
                                table_cell=new PdfPCell(new Phrase("FLIGHT NO."));
                                my_report_table.addCell(table_cell);
                                                              
                                String flight = query_set.getString("flight_no");
                                table_cell=new PdfPCell(new Phrase(flight));
                                my_report_table.addCell(table_cell);
                                
                                
                                table_cell=new PdfPCell(new Phrase(" "));
                                my_report_table.addCell(table_cell);
                                table_cell=new PdfPCell(new Phrase(" "));
                                my_report_table.addCell(table_cell);
                                
                                
                                    
                String a= query_set.getString("booking_id");
                String b = query_set.getString("flight_no");
                
                

                String sql1="select city from location where loc_id=(select sid from flight where flight_no=(select flight_no from booking where booking_id=?));";
                PreparedStatement p1;
                p1=con.prepareStatement(sql1);
                p1.setString(1,a);
                ResultSet rs1=p1.executeQuery();
                rs1.next();
                String x=rs1.getString("city");

                String sql2="select city from location where loc_id=(select did from flight where flight_no=(select flight_no from booking where booking_id=?));";
                PreparedStatement p2;
                p2=con.prepareStatement(sql2);
                p2.setString(1,a);
                ResultSet rs2=p2.executeQuery();
                rs2.next();
                String y=rs2.getString("city");


                                table_cell=new PdfPCell(new Phrase("SOURCE"));
                                my_report_table.addCell(table_cell);
                                                              
                                table_cell=new PdfPCell(new Phrase(x));
                                my_report_table.addCell(table_cell);
                                
                                
                                table_cell=new PdfPCell(new Phrase("DESTINATION"));
                                my_report_table.addCell(table_cell);
                                                              
                                table_cell=new PdfPCell(new Phrase(y));
                                my_report_table.addCell(table_cell);
                                
                                
                                
                                table_cell=new PdfPCell(new Phrase(" "));
                                my_report_table.addCell(table_cell);
                                table_cell=new PdfPCell(new Phrase(" "));
                                my_report_table.addCell(table_cell);
                                
                                
                                
                String sql3="select time1 from flight where flight_no=(select flight_no from booking where booking_id=?);";
               
                p1=con.prepareStatement(sql3);
                p1.setString(1,a);
                rs1=p1.executeQuery();
                rs1.next();
                x=rs1.getString("time1");

                String sql4="select time2 from flight where flight_no=(select flight_no from booking where booking_id=?);";
                
                p2=con.prepareStatement(sql4);
                p2.setString(1,a);
                rs2=p2.executeQuery();
                rs2.next();
                y=rs2.getString("time2");
                                
                                
                                table_cell=new PdfPCell(new Phrase("DEPARTURE"));
                                my_report_table.addCell(table_cell);
                                                              
                                table_cell=new PdfPCell(new Phrase(x));
                                my_report_table.addCell(table_cell);
                                
                                
                                table_cell=new PdfPCell(new Phrase("ARRIVAL"));
                                my_report_table.addCell(table_cell);
                                                              
                                table_cell=new PdfPCell(new Phrase(y));
                                my_report_table.addCell(table_cell);
                                
                                
                                
                                table_cell=new PdfPCell(new Phrase(" "));
                                my_report_table.addCell(table_cell);
                                table_cell=new PdfPCell(new Phrase(" "));
                                my_report_table.addCell(table_cell);
                                
                                
                                table_cell=new PdfPCell(new Phrase("FIRST TICKETS BOOKED"));
                                my_report_table.addCell(table_cell);
                                                              
                                String noF = query_set.getString("no_first_booked");
                                table_cell=new PdfPCell(new Phrase(noF));
                                my_report_table.addCell(table_cell);
                                
                                
                                table_cell=new PdfPCell(new Phrase("BUSINESS TICKETS BOOKED"));
                                my_report_table.addCell(table_cell);
                                                              
                                String noB = query_set.getString("no_business_booked");
                                table_cell=new PdfPCell(new Phrase(noB));
                                my_report_table.addCell(table_cell);
                                
                                
                                table_cell=new PdfPCell(new Phrase("ECONOMY TICKETS BOOKED"));
                                my_report_table.addCell(table_cell);
                                                              
                                String noE = query_set.getString("no_economy_booked");
                                table_cell=new PdfPCell(new Phrase(noE));
                                my_report_table.addCell(table_cell);
                                                                                                
                                table_cell=new PdfPCell(new Phrase(" "));
                                my_report_table.addCell(table_cell);
                                table_cell=new PdfPCell(new Phrase(" "));
                                my_report_table.addCell(table_cell);
                                
                                table_cell=new PdfPCell(new Phrase("TOTAL PRICE"));
                                my_report_table.addCell(table_cell);
                                                              
                                String price = query_set.getString("total_price");
                                table_cell=new PdfPCell(new Phrase(price));
                                my_report_table.addCell(table_cell);
                                
                                
                                table_cell=new PdfPCell(new Phrase(" "));
                                my_report_table.addCell(table_cell);
                                table_cell=new PdfPCell(new Phrase(" "));
                                my_report_table.addCell(table_cell);
                                
                                
                                table_cell=new PdfPCell(new Phrase("USERNAME"));
                                my_report_table.addCell(table_cell);
                                                              
                                String user = query_set.getString("username");
                                table_cell=new PdfPCell(new Phrase(user));
                                my_report_table.addCell(table_cell);
                                
                                
                sql3="select * from user where username=?;";
               
                p1=con.prepareStatement(sql3);
                p1.setString(1,user);
                rs1=p1.executeQuery();
                rs1.next();
                x=rs1.getString("fname");
                y=rs1.getString("lname");
                String z=rs1.getString("email");
                String x1=rs1.getString("address");
                String y1=rs1.getString("phno");
                String z1=rs1.getString("passno");

                                
                                
                                table_cell=new PdfPCell(new Phrase("FIRST NAME"));
                                my_report_table.addCell(table_cell);
                                                              
                                table_cell=new PdfPCell(new Phrase(x));
                                my_report_table.addCell(table_cell);
                                
                                
                                table_cell=new PdfPCell(new Phrase("LAST NAME"));
                                my_report_table.addCell(table_cell);
                                                              
                                table_cell=new PdfPCell(new Phrase(y));
                                my_report_table.addCell(table_cell);
                                
                                
                                table_cell=new PdfPCell(new Phrase("EMAIL"));
                                my_report_table.addCell(table_cell);
                                                              
                                table_cell=new PdfPCell(new Phrase(z));
                                my_report_table.addCell(table_cell);
                                
                                
                                table_cell=new PdfPCell(new Phrase("ADDRESS"));
                                my_report_table.addCell(table_cell);
                                                              
                                table_cell=new PdfPCell(new Phrase(x1));
                                my_report_table.addCell(table_cell);
                                
                                
                                table_cell=new PdfPCell(new Phrase("PHONE NUMBER"));
                                my_report_table.addCell(table_cell);
                                                              
                                table_cell=new PdfPCell(new Phrase(y1));
                                my_report_table.addCell(table_cell);
                                        
                                        
                                table_cell=new PdfPCell(new Phrase("PASSPORT NUMBER"));
                                my_report_table.addCell(table_cell);
                                                              
                                table_cell=new PdfPCell(new Phrase(z1));
                                my_report_table.addCell(table_cell);
                                
                                table_cell=new PdfPCell(new Phrase(" "));
                                my_report_table.addCell(table_cell);
                                table_cell=new PdfPCell(new Phrase(" "));
                                my_report_table.addCell(table_cell);
                                
                                
                my_ticket.add(my_report_table);                       
                my_ticket.close();
                
                JOptionPane.showMessageDialog(this, "E-TICKET Successfully Printed!");
                query_set.close();
                ps1.close(); 
                con.close();          
            
            
            
         }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
    
    
    
    
    
    public void fillTable(){
            
        
        
        try
        {

            DefaultTableModel model = new DefaultTableModel(new String[]{"Booking ID","Flight No.","Source","Destination",
                "First Class Booked","Business Class Booked","Economy Class Booked","Total Price Paid"}, 0);

            Class.forName("com.mysql.jdbc.Driver");  
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/airline_db","root","");  

            String sql="SELECT * FROM booking where paid=1 and username=(select username from user where active_user=1);";
            PreparedStatement pst1;
            pst1 = con.prepareStatement(sql);        
            ResultSet rs = pst1.executeQuery(sql);

            String sql1,sql2;
            
            while(rs.next())
            {

                String a= rs.getString("booking_id");
                String b = rs.getString("flight_no");
                
                

                sql1="select city from location where loc_id=(select sid from flight where flight_no=(select flight_no from booking where booking_id=?));";
                PreparedStatement p1;
                p1=con.prepareStatement(sql1);
                p1.setString(1,a);
                ResultSet rs1=p1.executeQuery();
                rs1.next();
                String x=rs1.getString("city");

                sql2="select city from location where loc_id=(select did from flight where flight_no=(select flight_no from booking where booking_id=?));";
                PreparedStatement p2;
                p2=con.prepareStatement(sql2);
                p2.setString(1,a);
                ResultSet rs2=p2.executeQuery();
                rs2.next();
                String y=rs2.getString("city");


                String c = rs.getString("no_first_booked");
                String d =rs.getString("no_business_booked");
                String e =rs.getString("no_economy_booked");
                String f = rs.getString("total_price");


                model.addRow(new Object[]{a,b,x,y,c,d,e,f});
            }
            
            BookingTable.setRowHeight(40);
            BookingTable.setModel(model);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        BookingTable = new javax.swing.JTable();
        CancelButton1 = new javax.swing.JButton();
        PrintBookingButton1 = new javax.swing.JButton();
        Entries1 = new javax.swing.JLabel();
        HomeButton = new javax.swing.JButton();
        Header = new javax.swing.JLabel();
        wall = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        BookingTable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BookingTable.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BookingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Booking ID", "Flight No.", "Source", "Destination", "First Class Booked", "Business Class Booked", "Economy Class Booked", "Total Price Paid"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        BookingTable.setToolTipText("");
        BookingTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BookingTable.setIntercellSpacing(new java.awt.Dimension(2, 2));
        BookingTable.setName(""); // NOI18N
        BookingTable.setShowHorizontalLines(false);
        BookingTable.setShowVerticalLines(false);
        jScrollPane1.setViewportView(BookingTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(240, 220, 1460, 600);

        CancelButton1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        CancelButton1.setText("Cancel Booking");
        CancelButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(CancelButton1);
        CancelButton1.setBounds(1000, 850, 360, 70);

        PrintBookingButton1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        PrintBookingButton1.setText("Print Booking");
        PrintBookingButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintBookingButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(PrintBookingButton1);
        PrintBookingButton1.setBounds(580, 850, 360, 70);

        Entries1.setBackground(new java.awt.Color(0, 51, 102));
        Entries1.setFont(new java.awt.Font("SimSun", 0, 13)); // NOI18N
        Entries1.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Documents\\NetBeansProjects\\AirlineProject\\Pictures\\Silver.jpg")); // NOI18N
        Entries1.setText("jLabel3");
        getContentPane().add(Entries1);
        Entries1.setBounds(160, 130, 1610, 830);

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
        wall.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Documents\\NetBeansProjects\\AirlineProject\\Pictures\\Clouds'.jpg")); // NOI18N
        getContentPane().add(wall);
        wall.setBounds(1, 6, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed

        this.setVisible(false);
        new UserHome().setVisible(true);
    }//GEN-LAST:event_HomeButtonActionPerformed

    private void CancelButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButton1ActionPerformed

        int selected = BookingTable.getSelectedRow();
        String cancelbook = BookingTable.getModel().getValueAt(selected, 0).toString();

        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/airline_db","root","");

            String query2="select * from booking where booking_id=?";
            PreparedStatement ps1;
            ps1=con.prepareStatement(query2);
            ps1.setString(1,cancelbook);
            ResultSet RS=ps1.executeQuery();
            RS.next();
            int addcredits=RS.getInt("total_price");
            
            String query3="update user set credits=credits+? where active_user=1";
            PreparedStatement ps2;
            ps2=con.prepareStatement(query3);
            ps2.setInt(1,addcredits);
            ps2.executeUpdate();
            
            String query1="delete from booking where booking_id=?";
            PreparedStatement ps;
            ps=con.prepareStatement(query1);
            ps.setString(1,cancelbook);
            ps.executeUpdate();

            
            BookingTable.removeAll();
            this.fillTable();
            JOptionPane.showMessageDialog(this,"Booking Cancelled Successfully\n"
                    + "Cost of Ticket has been credited to your Account");

        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }//GEN-LAST:event_CancelButton1ActionPerformed

    private void PrintBookingButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintBookingButton1ActionPerformed
        
        PrintTicket();
    }//GEN-LAST:event_PrintBookingButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ManageBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BookingTable;
    private javax.swing.JButton CancelButton1;
    private javax.swing.JLabel Entries1;
    private javax.swing.JLabel Header;
    private javax.swing.JButton HomeButton;
    private javax.swing.JButton PrintBookingButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel wall;
    // End of variables declaration//GEN-END:variables
}
