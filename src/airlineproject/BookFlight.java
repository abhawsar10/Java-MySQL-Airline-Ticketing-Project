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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ankit Bhawsar
 */
public class BookFlight extends javax.swing.JFrame {

    /**
     * Creates new form BookFlight
     */
    public BookFlight() {
        initComponents();
setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        this.fillTable();
    }
    
    public void fillTable(){
            
        
        
        try
        {

            DefaultTableModel model = new DefaultTableModel(new String[]{"Flight No.", "Flight Name", "Airplane",
                "Source","Destination","Departure","Arrival","First Available","Business Available","Economy Available",
                "First Price","Business Price","Economy Price"}, 0);

            Class.forName("com.mysql.jdbc.Driver");  
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/airline_db","root","");  

            String sql="SELECT * FROM flight;";
            PreparedStatement pst1;
            pst1 = con.prepareStatement(sql);        
            ResultSet rs = pst1.executeQuery(sql);

            String sql1,sql2;

            while(rs.next())
            {

                String a= rs.getString("flight_no");
                String b = rs.getString("flight_name");
                String c = rs.getString("airplane_name");
                String d =rs.getString("sid");
                String e =rs.getString("did");
                String f = rs.getString("time1");
                String g = rs.getString("time2");
                String h = rs.getString("no_first");
                String i = rs.getString("no_business");
                String j = rs.getString("no_economy");
                String k = rs.getString("price_first");
                String l = rs.getString("price_business");
                String m = rs.getString("price_economy");



                sql1="select * from location where loc_id=?;";
                PreparedStatement p1;
                p1=con.prepareStatement(sql1);
                p1.setString(1,d);
                ResultSet rs1=p1.executeQuery();
                rs1.next();
                String x=rs1.getString("city");

                sql2="select * from location where loc_id=?;";
                PreparedStatement p2;
                p2=con.prepareStatement(sql2);
                p2.setString(1,e);
                ResultSet rs2=p2.executeQuery();
                rs2.next();
                String y=rs2.getString("city");



                model.addRow(new Object[]{a,b,c,x,y,f,g,h,i,j,k,l,m});
            }
            
            FlightTable.setRowHeight(40);
            
            /*
            FlightTable.getColumnModel().getColumn(0).setWidth(20);
            FlightTable.getColumnModel().getColumn(1).setWidth(10);
            FlightTable.getColumnModel().getColumn(2).setWidth(10);
            FlightTable.getColumnModel().getColumn(3).setWidth(90);
            FlightTable.getColumnModel().getColumn(4).setWidth(90);
            FlightTable.getColumnModel().getColumn(6).setWidth(10);
            FlightTable.getColumnModel().getColumn(7).setWidth(10);
            FlightTable.getColumnModel().getColumn(8).setWidth(95);
            FlightTable.getColumnModel().getColumn(9).setWidth(40);
            FlightTable.getColumnModel().getColumn(10).setWidth(40);
            FlightTable.getColumnModel().getColumn(11).setWidth(9);
            FlightTable.getColumnModel().getColumn(12).setMinWidth(100);
            //FlightTable.getColumnModel().getColumn(13).setPreferredWidth(400);
            //FlightTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            
            */
            
            
            FlightTable.setModel(model);


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
        FlightTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        sSrc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        sDest = new javax.swing.JTextField();
        SearchButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        noF = new javax.swing.JSpinner();
        noB = new javax.swing.JSpinner();
        noE = new javax.swing.JSpinner();
        BookFlightButton = new javax.swing.JButton();
        Entries1 = new javax.swing.JLabel();
        HomeButton = new javax.swing.JButton();
        Header = new javax.swing.JLabel();
        wall = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        FlightTable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        FlightTable.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        FlightTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Flight No.", "Flight Name", "Airplane", "Source", "Destination", "Departure", "Arrival", "Available FIRST ", "Available BUSINESS", "Available ECONOMY", "Price FIRST", "Price BUSINESS", "Price ECONOMY"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        FlightTable.setToolTipText("");
        FlightTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        FlightTable.setIntercellSpacing(new java.awt.Dimension(2, 2));
        FlightTable.setName(""); // NOI18N
        FlightTable.setShowHorizontalLines(false);
        FlightTable.setShowVerticalLines(false);
        jScrollPane1.setViewportView(FlightTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(150, 250, 1640, 500);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Search Source");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(340, 160, 210, 50);

        sSrc.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        sSrc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sSrcActionPerformed(evt);
            }
        });
        getContentPane().add(sSrc);
        sSrc.setBounds(570, 160, 200, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Search Destination");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(860, 160, 210, 50);

        sDest.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        sDest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sDestActionPerformed(evt);
            }
        });
        getContentPane().add(sDest);
        sDest.setBounds(1090, 160, 200, 50);

        SearchButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        SearchButton.setText("SEARCH");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SearchButton);
        SearchButton.setBounds(1550, 160, 230, 50);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Select Number of Seats:");
        jLabel4.setToolTipText("");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(420, 790, 400, 50);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("First Class");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(210, 850, 170, 50);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Business Class");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(470, 850, 170, 50);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Economy Class");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(730, 850, 170, 50);

        noF.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(noF);
        noF.setBounds(390, 850, 60, 50);

        noB.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        noB.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(noB);
        noB.setBounds(650, 850, 60, 50);

        noE.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(noE);
        noE.setBounds(910, 850, 60, 50);

        BookFlightButton.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        BookFlightButton.setText("BOOK FLIGHT");
        BookFlightButton.setActionCommand("");
        BookFlightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookFlightButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BookFlightButton);
        BookFlightButton.setBounds(1340, 840, 300, 60);

        Entries1.setBackground(new java.awt.Color(0, 51, 102));
        Entries1.setFont(new java.awt.Font("SimSun", 0, 13)); // NOI18N
        Entries1.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Documents\\NetBeansProjects\\AirlineProject\\Pictures\\Silver.jpg")); // NOI18N
        Entries1.setText("jLabel3");
        getContentPane().add(Entries1);
        Entries1.setBounds(70, 120, 1820, 840);

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

    private void sSrcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sSrcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sSrcActionPerformed

    private void sDestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sDestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sDestActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        
        String source=sSrc.getText();
        String dest=sDest.getText();
        int error=0;
        
        if(source.equals(dest))
        {
            JOptionPane.showMessageDialog(this,"Source and Destination Cannot be Same");
            error=1;           
        }
        
         try{
                    Class.forName("com.mysql.jdbc.Driver");  
                    Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3307/airline_db","root","");  

                    PreparedStatement pst1;
                    String sql1 ="SELECT * FROM location ;";
                    pst1 = con1.prepareStatement(sql1);

                    ResultSet rs = pst1.executeQuery(); 
                    
                    boolean found1=false,found2=false;
                    while(rs.next())  
                    {
                        if(rs.getString("city").equalsIgnoreCase(source))
                        {
                            found1=true;
                        }
                        if(rs.getString("city").equalsIgnoreCase(dest))
                        {
                            found2=true;
                        }
                    }
                    
                    if(found1==false || found2==false)
                    {
                        JOptionPane.showMessageDialog(this,"No City Found");
                        error=1;
                    }
                    
                    if(error==0)
                    {
                    

                        String q1 ="SELECT loc_id FROM location where city=?;";
                        String q2 ="SELECT loc_id FROM location where city=?;";

                        PreparedStatement p1;
                        PreparedStatement p2;
                        p1 = con1.prepareStatement(q1);
                        p2 = con1.prepareStatement(q2);
                        p1.setString(1,source);
                        p2.setString(1,dest);
                        ResultSet r1 = p1.executeQuery();
                        ResultSet r2 = p2.executeQuery();
                        r1.next();
                        r2.next();

                        String sourceid=r1.getString("loc_id");                    
                        String destid=r2.getString("loc_id");
                        
                        System.out.println("SID,DID: "+sourceid+"  "+destid);
                        
                        DefaultTableModel model1 = new DefaultTableModel(new String[]{"Flight No.", "Flight Name", "Airplane",
                "Source","Destination","Departure","Arrival","First Available","Business Available","Economy Available",
                "First Price","Business Price","Economy Price"}, 0);

                        
                        
                        String q ="select * from flight where sid=? and did=?";
                        PreparedStatement p,p3,p4;
                        p = con1.prepareStatement(q);
                        p.setString(1,sourceid);
                        p.setString(2,destid);
                        ResultSet r = p.executeQuery();
                        
                        String quer1,quer2;

                        while(r.next())
                        {

                        System.out.println("inside while ");
                            String a1 = r.getString("flight_no");
                            String b1 = r.getString("flight_name");
                            String c1 = r.getString("airplane_name");
                            String d1 = r.getString("sid");
                            String e1 = r.getString("did");
                            String f1 = r.getString("time1");
                            String g1 = r.getString("time2");
                            String h1 = r.getString("no_first");
                            String i1 = r.getString("no_business");
                            String j1 = r.getString("no_economy");
                            String k1 = r.getString("price_first");
                            String l1 = r.getString("price_business");
                            String m1 = r.getString("price_economy");



                            quer1="select * from location where loc_id=?;";
                            p3=con1.prepareStatement(quer1);
                            p3.setString(1,d1);
                            ResultSet rs3=p3.executeQuery();
                            rs3.next();
                            String x1=rs3.getString("city");

                            quer2="select * from location where loc_id=?;";
                            p4=con1.prepareStatement(quer2);
                            p4.setString(1,e1);
                            ResultSet rs4=p4.executeQuery();
                            rs4.next();
                            String y1=rs4.getString("city");

                            model1.addRow(new Object[]{a1,b1,c1,x1,y1,f1,g1,h1,i1,j1,k1,l1,m1});
                        }

                        FlightTable.setRowHeight(40);
                        FlightTable.setModel(model1);

                    }       
                    
                    
                }
                catch(Exception e){
                    System.out.println(e);
                }
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void BookFlightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookFlightButtonActionPerformed

          

        int selected = FlightTable.getSelectedRow();
        String flightno1 = FlightTable.getModel().getValueAt(selected, 0).toString();   
        String user;
        int numF = (Integer) noF.getValue();
        int numB = (Integer) noB.getValue();
        int numE = (Integer) noE.getValue();
        int totalprice=0;
        int error=0;
        
            if(numF==0 && numB==0 && numE==0)
            {
                JOptionPane.showMessageDialog(this,"You Have Selected No Seats!");
                error=1;
                
            }
            try{
            if(numF<0 || numB<0 || numE<0)
            {
                JOptionPane.showMessageDialog(this,"INVALID Number of Seats");
                error=1;
                
            }
            }
            catch(Exception e)
                    {
                    
                System.out.println(e);
                    }
            
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/airline_db","root","");  

            String QUERY="select * from flight where flight_no=?;";
            PreparedStatement PST;
            PST = con.prepareStatement(QUERY);
            PST.setString(1,flightno1);
            ResultSet RS = PST.executeQuery();
            
            RS.next();
            
            if(  RS.getInt("no_first") < numF || 
                    RS.getInt("no_business") < numB ||
                            RS.getInt("no_economy") < numE )
            {
                JOptionPane.showMessageDialog(this,"No Seats Available");
                error=1;
            }
                
            if(error==0)
            {
                    totalprice=(RS.getInt("price_first"))*numF+(RS.getInt("price_business"))*numB+(RS.getInt("price_economy"))*numE;
                    
                    System.out.println("TOtal Price : "+totalprice);
                    
                    int option=JOptionPane.showConfirmDialog(this, "CONFIRM BOOKING?\nTOTAL AMOUNT= "+totalprice);
                    
                    if(option==1)
                    {
                        this.setVisible(false);
                        new BookFlight().setVisible(true);
                    } 
                    else if(option==2)
                    {
                        this.setVisible(false);
                        new UserHome().setVisible(true);                        
                    } 
                    else
                    {
                        
                        String QUERY1="update flight set no_first=no_first-?  ,  no_business=no_business-?  ,  no_economy=no_economy-? where flight_no=?;";                
                        PreparedStatement PST1;
                        PST1 = con.prepareStatement(QUERY1);
                        PST1.setInt(1,numF);
                        PST1.setInt(2,numB);
                        PST1.setInt(3,numE);
                        PST1.setString(4,flightno1);
                        PST1.executeUpdate();

                        String QUERY2="select username from user where active_user=1;";
                        PreparedStatement PST2;
                        PST2 = con.prepareStatement(QUERY2);
                        ResultSet RS2=PST2.executeQuery();
                        RS2.next();
                        user=RS2.getString("username");


                        String QUERY3="insert into booking(flight_no,no_first_booked,no_business_booked,no_economy_booked,total_price,username,paid)"
                                + "values(?,?,?,?,?,?,0);";
                        PreparedStatement PST3;
                        PST3 = con.prepareStatement(QUERY3);
                        PST3.setString(1,flightno1);
                        PST3.setInt(2,numF);
                        PST3.setInt(3,numB);
                        PST3.setInt(4,numE);
                        PST3.setInt(5,totalprice);
                        PST3.setString(6,user);                    
                        PST3.executeUpdate();

                        
                        this.setVisible(false);
                        new Payment().setVisible(true);
                    }
             }
        }
                catch(Exception e){
                    System.out.println(e);
                }
        

        
    }//GEN-LAST:event_BookFlightButtonActionPerformed

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
            java.util.logging.Logger.getLogger(BookFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookFlight().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BookFlightButton;
    private javax.swing.JLabel Entries1;
    private javax.swing.JTable FlightTable;
    private javax.swing.JLabel Header;
    private javax.swing.JButton HomeButton;
    private javax.swing.JButton SearchButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner noB;
    private javax.swing.JSpinner noE;
    private javax.swing.JSpinner noF;
    private javax.swing.JTextField sDest;
    private javax.swing.JTextField sSrc;
    private javax.swing.JLabel wall;
    // End of variables declaration//GEN-END:variables
}
