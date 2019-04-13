/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginpage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author pushk
 */
public class MainAut extends javax.swing.JFrame {

    /**
     * Creates new form MainAut
     */
    public MainAut(String user) {
    this.setUndecorated(true);
    this.setAlwaysOnTop(false);
    this.setResizable(false);
    this.setVisible(true);
    initComponents();   
    user1=user;
    if(user1.charAt(0)=='O')
    {
         welcome_officer();
    }
    if(user1.charAt(0)=='D')
    {
        welcome_doctor();
    }
    if(user1.charAt(0)=='W')
    {
        welcome_warden();
    }
    post=plabel.getText();
    this.setLocationRelativeTo(null);
    enter.requestFocusInWindow();
    if(!post.equals("Warden"))
            {
                change.setVisible(false);
                new_entry.setVisible(false);
            }
    }
    

    String user1,post,prison;
    public void welcome_officer()
    {
        
        try {  
        
        {       
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=master;user=sa;password=1234";
            Connection con=DriverManager.getConnection(url);
            String sql="select fname,lname,post,prison_id from officer o,assigned a where o.staff_id=a.staff_id and o.staff_id = ?";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1,user1);
            ResultSet rs=pst.executeQuery();
            rs.next();
            String first=rs.getString("fname");
            String last=rs.getString("lname");
            String post1=rs.getString("post");
            String prison1=rs.getString("prison_id");
            name.setText(first+" "+last);
            plabel.setText(post1);
            prison_display.setText(prison1);
           
        }
             }catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Med_Report.class.getName()).log(Level.SEVERE, null, ex);
                     }
    }
    
       public void welcome_doctor()
       {
       
           try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=master;user=sa;password=1234";
            Connection con=DriverManager.getConnection(url);
            String sql1="select fname,lname,qualification,prison_id from doctor d,assigned a where d.staff_id=a.staff_id and d.staff_id = ?";
            PreparedStatement pst1=con.prepareStatement(sql1);
            pst1.setString(1,user1);
            ResultSet rs1=pst1.executeQuery();
            rs1.next();
            String first1=rs1.getString("fname");
            String last1=rs1.getString("lname");
            String qual=rs1.getString("qualification");
            String prison=rs1.getString("prison_id");
            name.setText(first1+" "+last1);
            plabel.setText(qual);
            prison_display.setText(prison);
            post_display.setText("QUAL.: ");
            
           }catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Med_Report.class.getName()).log(Level.SEVERE, null, ex);
       }
       }
       
           public void welcome_warden()
           {
            try{
               Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=master;user=sa;password=1234";
            Connection con=DriverManager.getConnection(url);
            String sql="select fname,lname,prison_id from warden w,assigned a where w.staff_id=a.staff_id and w.staff_id = ?";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1,user1);
            ResultSet rs=pst.executeQuery();
            rs.next();
            String first=rs.getString("fname");
            String last=rs.getString("lname");
            String prison1=rs.getString("prison_id");
            name.setText(first+" "+last);
            plabel.setText("Warden");
            prison_display.setText(prison1);
            prison=prison1;
           }catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Med_Report.class.getName()).log(Level.SEVERE, null, ex);
           }
           }
        
            
            
        
            
             
            
        
        
        
                                         
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        post_display = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        plabel = new javax.swing.JLabel();
        prison_display = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        enter = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        new_entry = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        prison_id = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        crime = new javax.swing.JTextField();
        job = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        sentence = new javax.swing.JTextField();
        officer = new javax.swing.JTextField();
        release_date = new javax.swing.JTextField();
        gender = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        fname = new javax.swing.JTextField();
        change = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(75, 80, 81));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("WELCOME, ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 14, 160, 41));

        post_display.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        post_display.setForeground(new java.awt.Color(255, 255, 255));
        post_display.setText("POST: ");
        jPanel2.add(post_display, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 61, 100, 36));

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("     -");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 10, 43, 43));

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("     x");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 10, 43, 43));

        name.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 280, 30));

        plabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        plabel.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(plabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 250, 30));

        prison_display.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        prison_display.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(prison_display, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 150, 30));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("PRISON ID: ");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 150, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 110));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ENTER PRISONER ID:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 207, 34));

        enter.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterActionPerformed(evt);
            }
        });
        jPanel3.add(enter, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 30, 160, 34));

        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setText("SEARCH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 129, 34));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("FIRST NAME :");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 140, 34));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("LAST NAME :");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 140, 20));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CRIME :");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 80, 34));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("JOB ASSIGNED :");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 158, 34));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("AGE :");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 60, 34));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("SENTENCE :");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, -1, 34));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("OFFICER ASSIGNED :");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, -1, -1));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("RELEASE DATE :");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, -1, 34));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("GENDER :");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, -1, 34));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("PRISON ID. : ");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 390, -1, 34));
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1275, 65, 157, 172));

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("MEDICAL REPORT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 170, 50));

        jButton3.setBackground(new java.awt.Color(153, 153, 153));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("LOG OUT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 510, 136, 44));

        new_entry.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        new_entry.setText("NEW ENTRY");
        new_entry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_entryActionPerformed(evt);
            }
        });
        jPanel3.add(new_entry, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, 170, -1));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 260, 10));

        prison_id.setBackground(new java.awt.Color(51, 51, 51));
        prison_id.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        prison_id.setForeground(new java.awt.Color(255, 255, 255));
        prison_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        prison_id.setBorder(null);
        jPanel3.add(prison_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 390, 170, 30));

        lname.setBackground(new java.awt.Color(51, 51, 51));
        lname.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lname.setForeground(new java.awt.Color(255, 255, 255));
        lname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lname.setBorder(null);
        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });
        jPanel3.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 240, 30));

        crime.setBackground(new java.awt.Color(51, 51, 51));
        crime.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        crime.setForeground(new java.awt.Color(255, 255, 255));
        crime.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        crime.setBorder(null);
        crime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crimeActionPerformed(evt);
            }
        });
        jPanel3.add(crime, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 260, 30));

        job.setBackground(new java.awt.Color(51, 51, 51));
        job.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        job.setForeground(new java.awt.Color(255, 255, 255));
        job.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        job.setBorder(null);
        jPanel3.add(job, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 170, 30));

        age.setBackground(new java.awt.Color(51, 51, 51));
        age.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        age.setForeground(new java.awt.Color(255, 255, 255));
        age.setBorder(null);
        age.setCaretColor(new java.awt.Color(255, 255, 255));
        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });
        jPanel3.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 90, 30));

        sentence.setBackground(new java.awt.Color(51, 51, 51));
        sentence.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        sentence.setForeground(new java.awt.Color(255, 255, 255));
        sentence.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sentence.setBorder(null);
        sentence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sentenceActionPerformed(evt);
            }
        });
        jPanel3.add(sentence, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 130, 260, 40));

        officer.setBackground(new java.awt.Color(51, 51, 51));
        officer.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        officer.setForeground(new java.awt.Color(255, 255, 255));
        officer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        officer.setBorder(null);
        jPanel3.add(officer, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 190, 270, 40));

        release_date.setBackground(new java.awt.Color(51, 51, 51));
        release_date.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        release_date.setForeground(new java.awt.Color(255, 255, 255));
        release_date.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        release_date.setBorder(null);
        release_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                release_dateActionPerformed(evt);
            }
        });
        jPanel3.add(release_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 260, 270, 30));

        gender.setBackground(new java.awt.Color(51, 51, 51));
        gender.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        gender.setForeground(new java.awt.Color(255, 255, 255));
        gender.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gender.setBorder(null);
        jPanel3.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 320, 270, 30));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1250, 10));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 230, 300, 10));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 290, 300, 10));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 350, 300, 10));
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 420, 300, 10));
        jPanel3.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 170, 300, 10));
        jPanel3.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 110, 10));
        jPanel3.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 260, 10));
        jPanel3.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 260, 10));
        jPanel3.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 260, 10));

        fname.setBackground(new java.awt.Color(51, 51, 51));
        fname.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        fname.setForeground(new java.awt.Color(255, 255, 255));
        fname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fname.setBorder(null);
        jPanel3.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 250, 30));

        change.setBackground(new java.awt.Color(153, 153, 153));
        change.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        change.setForeground(new java.awt.Color(0, 0, 0));
        change.setText("MAKE CHANGES");
        change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeActionPerformed(evt);
            }
        });
        jPanel3.add(change, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 510, 160, 50));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1260, 630));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterActionPerformed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         Intro i=new Intro();
         i.setVisible(true);
         dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Med_Report m=new Med_Report(2,user1);
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void new_entryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_entryActionPerformed
        Register_ciminal rc=new Register_ciminal(user1,prison);
        rc.setVisible(true);
        
    }//GEN-LAST:event_new_entryActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=master;user=sa;password=1234";
            Connection con=DriverManager.getConnection(url);
            String sql="select * from prisoner where prisoner_id=?";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1,enter.getText());
            ResultSet rs=pst.executeQuery();
            if(rs.next()==false)
            {
                JOptionPane.showMessageDialog(null,"incorrect prisoner ID.");
            }
            else
            {
            fname.setText(rs.getString("fname"));
            lname.setText(rs.getString("lname"));
            age.setText(rs.getString("age"));
            crime.setText(rs.getString("crime"));
            officer.setText(rs.getString("officer_assigned"));
            sentence.setText(rs.getString("sentence"));
            gender.setText(rs.getString("gender"));
            release_date.setText(rs.getString("date_release"));
            job.setText(rs.getString("work"));
            prison_id.setText(rs.getString("prison_id"));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Med_Report.class.getName()).log(Level.SEVERE, null, ex);
        }
                                        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void sentenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sentenceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sentenceActionPerformed

    private void crimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crimeActionPerformed

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameActionPerformed

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed

    private void changeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeActionPerformed
        try {
            
            
            change.setVisible(true);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=master;user=sa;password=1234";
            Connection con=DriverManager.getConnection(url);
            String sql="select * from prisoner where prisoner_id=?";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1,enter.getText());
            ResultSet rs=pst.executeQuery();
            if(rs.next()==false)
            {
                JOptionPane.showMessageDialog(null,"incorrect prisoner ID.");
            } else {
                Changes c=new Changes(enter.getText());
                c.setVisible(true);
            }
               
            
        }catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Med_Report.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(MainAut.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_changeActionPerformed

    private void release_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_release_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_release_dateActionPerformed

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
            java.util.logging.Logger.getLogger(MainAut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainAut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainAut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainAut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            new MainAut(" ").setVisible(true);
            }
        });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age;
    private javax.swing.JButton change;
    private javax.swing.JTextField crime;
    private javax.swing.JTextField enter;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField gender;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField job;
    private javax.swing.JTextField lname;
    private javax.swing.JLabel name;
    private javax.swing.JButton new_entry;
    private javax.swing.JTextField officer;
    private javax.swing.JLabel plabel;
    private javax.swing.JLabel post_display;
    private javax.swing.JLabel prison_display;
    private javax.swing.JTextField prison_id;
    private javax.swing.JTextField release_date;
    private javax.swing.JTextField sentence;
    // End of variables declaration//GEN-END:variables
}
