/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginpage;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



/**
 *
 * @author pushk
 */
public class Register_ciminal extends javax.swing.JFrame {

    /**
     * Creates new form Register_ciminal
     */
    public Register_ciminal(String user,String prison) {
    this.setUndecorated(true);
    this.setAlwaysOnTop(false);
    this.setResizable(false);
    this.setVisible(true);
    initComponents();
    this.setLocationRelativeTo(null);
    admin=user;
    prison_id=prison;
    prison_display.setText(prison);
    }

    String prison_id;
         
    String admin;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        utilDateModel1 = new org.jdatepicker.impl.UtilDateModel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        prison_display = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        prisoner_id = new javax.swing.JTextField();
        sentence = new javax.swing.JTextField();
        job_assigned = new javax.swing.JComboBox<>();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        officer_assigned = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        call_status = new javax.swing.JCheckBox();
        jLabel16 = new javax.swing.JLabel();
        crime = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        release = new org.jdesktop.swingx.JXDatePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(75, 80, 81));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NEW ENTRY");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 218, 50));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("     x");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1025, 12, 43, 43));

        jLabel4.setText("     -");
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 10, 43, 43));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("LAST NAME :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 183, 140, 34));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CRIME :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 255, 140, 34));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("AGE :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 405, 140, 34));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("JOB ASSIGNED :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 332, 157, 34));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("SENTENCE :");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 54, -1, 34));

        prison_display.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        prison_display.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(prison_display, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 405, 230, 30));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("OFFICER ASSIGNED :");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 117, -1, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("FIRST NAME :");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 112, 140, 34));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("GENDER :");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(573, 332, -1, 34));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("RELEASE DATE :");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, -1, 34));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("PRISON ID. : ");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 405, -1, 34));

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("CALLING PRIVILEGE:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, -1, 34));

        lname.setBackground(new java.awt.Color(51, 51, 51));
        lname.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lname.setForeground(new java.awt.Color(255, 255, 255));
        lname.setBorder(null);
        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });
        jPanel2.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 169, 38));

        fname.setBackground(new java.awt.Color(51, 51, 51));
        fname.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        fname.setForeground(new java.awt.Color(255, 255, 255));
        fname.setBorder(null);
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        jPanel2.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 169, 38));

        age.setBackground(new java.awt.Color(51, 51, 51));
        age.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        age.setForeground(new java.awt.Color(255, 255, 255));
        age.setBorder(null);
        jPanel2.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 167, 34));

        prisoner_id.setBackground(new java.awt.Color(51, 51, 51));
        prisoner_id.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        prisoner_id.setForeground(new java.awt.Color(255, 255, 255));
        prisoner_id.setBorder(null);
        prisoner_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prisoner_idActionPerformed(evt);
            }
        });
        jPanel2.add(prisoner_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 169, 38));

        sentence.setBackground(new java.awt.Color(51, 51, 51));
        sentence.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        sentence.setForeground(new java.awt.Color(255, 255, 255));
        sentence.setBorder(null);
        sentence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sentenceActionPerformed(evt);
            }
        });
        jPanel2.add(sentence, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, 192, 41));

        job_assigned.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CHOOSE A JOB", "COOK", "CLEANER", "ENTERTAINMENT", "SWEEPER", "STONE MASON", "LABOURER" }));
        job_assigned.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                job_assignedActionPerformed(evt);
            }
        });
        jPanel2.add(job_assigned, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 339, 167, -1));

        buttonGroup1.add(male);
        male.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        male.setForeground(new java.awt.Color(255, 255, 255));
        male.setText("MALE");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        jPanel2.add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(723, 333, -1, -1));

        buttonGroup1.add(female);
        female.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        female.setForeground(new java.awt.Color(255, 255, 255));
        female.setText("FEMALE");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        jPanel2.add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(817, 333, -1, -1));

        officer_assigned.setBackground(new java.awt.Color(51, 51, 51));
        officer_assigned.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        officer_assigned.setForeground(new java.awt.Color(255, 255, 255));
        officer_assigned.setBorder(null);
        jPanel2.add(officer_assigned, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 110, 192, 39));

        submit.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel2.add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 470, 170, 54));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 220, 10));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 220, 10));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 132, 220, 10));

        call_status.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        call_status.setForeground(new java.awt.Color(255, 255, 255));
        call_status.setText("ALLOW CALLING");
        call_status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                call_statusActionPerformed(evt);
            }
        });
        jPanel2.add(call_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 260, -1, -1));

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("PRISONER ID. :");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 180, 38));

        crime.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jPanel2.add(crime, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, -1));

        jTextField1.setBackground(new java.awt.Color(51, 51, 51));
        jTextField1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(null);
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 170, 30));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 220, 10));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, 220, 10));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, 240, 10));
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, 240, 20));

        release.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(release, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 200, 220, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 1010, 540));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        MainAut ma=new MainAut(admin);
        ma.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameActionPerformed

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void prisoner_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prisoner_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prisoner_idActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femaleActionPerformed

    private void job_assignedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_job_assignedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_job_assignedActionPerformed

    
    private void sentenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sentenceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sentenceActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        try {
            String date;
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");  
            date=formatter.format(release.getDate());
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=master;user=sa;password=1234";
            Connection con=DriverManager.getConnection(url);
            String sql="insert into prisoner values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1,prisoner_id.getText());
            pst.setString(2,fname.getText());
            pst.setString(3,lname.getText());
            pst.setString(4,crime.getText());
            pst.setInt(5,Integer.parseInt(age.getText()));
            if(job_assigned.getSelectedIndex()==0)
            {
                pst.setString(6,"No job assigned");
            }
            else
            {
                pst.setString(6,job_assigned.getSelectedItem().toString());
            }
            pst.setString(7,sentence.getText());
            pst.setString(8,officer_assigned.getText());          
            pst.setString(9,date);
            if(male.isSelected())
            {
                pst.setString(10,"M");
            }
            if(female.isSelected())
            {
                pst.setString(10,"F");
            }
            pst.setString(11,prison_id);
            pst.setInt(12,0);
            pst.setInt(13,0);
            int rs=pst.executeUpdate();
            if(rs>0)
            {
                JOptionPane.showMessageDialog(null,"New Criminal Entered Successfully");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"There was an error in adding prisoner, please try again later");
            }
            
            if(call_status.isSelected())
            {
                enable_call();
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Med_Report.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_submitActionPerformed

    private void call_statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_call_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_call_statusActionPerformed

    public void enable_call()
    {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=master;user=sa;password=1234";
            Connection con=DriverManager.getConnection(url);
            String sql="select * from call_schedule where prison_id=? and prisoner_id=NULL";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1,prison_id);
            ResultSet rs=pst.executeQuery();
            if(rs.next()==true)
            {
                String sql1=("update call_schedule set prisoner_id=? where prison_id=? and assigned_day=? and assigned_time=?");
                PreparedStatement pst1=con.prepareStatement(sql1);
                pst.setString(1,prisoner_id.getText());
                pst.setString(2,rs.getString("prison_id"));
                pst.setString(3,rs.getString("assigned_day"));
                pst.setString(4,rs.getString("assigned_time"));
                int update=pst1.executeUpdate();
            }
            else
            {
                String sql2=("select max(assigned_time) as maximum,assigned_day  from call_schedule where prison_id=? group by assigned_day order by (assigned_day) DESC");
                PreparedStatement pst2=con.prepareStatement(sql2);
                pst2.setString(1,prison_id);
                ResultSet rs1=pst2.executeQuery();
                rs1.next();

                int day=rs1.getInt("assigned_day");
                int time=rs1.getInt("maximum");
                if(time==20)
                {
                    time=13;
                    day=(day+1)%25;
                }
                else
                {
                    time++;
                }
                String sql3="insert into call_schedule values(?,?,?,?)";
                PreparedStatement pst3=con.prepareStatement(sql3);
                pst3.setString(1,prison_id);
                pst3.setString(2,prisoner_id.getText());
                pst3.setInt(3,day);
                pst3.setInt(4,time);
                int update=pst3.executeUpdate();
                if(update>0)
                {
                    JOptionPane.showMessageDialog(null,"Call Time Allotted Successfully as Date: "+day+" time: "+time+":00");
                }
            }
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Med_Report.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
           
       
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
            java.util.logging.Logger.getLogger(Register_ciminal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register_ciminal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register_ciminal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register_ciminal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register_ciminal(" "," ").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox call_status;
    private javax.swing.JLabel crime;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> job_assigned;
    private javax.swing.JTextField lname;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField officer_assigned;
    private javax.swing.JLabel prison_display;
    private javax.swing.JTextField prisoner_id;
    private org.jdesktop.swingx.JXDatePicker release;
    private javax.swing.JTextField sentence;
    private javax.swing.JButton submit;
    private org.jdatepicker.impl.UtilDateModel utilDateModel1;
    // End of variables declaration//GEN-END:variables

    //void setVsisible(boolean b) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // }
}
