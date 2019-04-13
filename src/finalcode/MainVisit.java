/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginpage;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author pushk
 */
public class MainVisit extends javax.swing.JFrame {

    /**
     * Creates new form MainVisit
     */
    public MainVisit(String visit) {
         this.setUndecorated(true);
    this.setAlwaysOnTop(false);
    this.setResizable(false);
    this.setVisible(true);
    initComponents();
    visitor=visit;
    this.setLocationRelativeTo(null);
    display();
    }

    String visitor;
    public void display()
    {
         try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=master;user=sa;password=1234";
            Connection con=DriverManager.getConnection(url);
            String sql="select * from prisoner where prisoner_id IN(select prisoner_id from visitor where visitor_id=?)";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1,visitor);
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
            }
            
            String sql1="select assigned_day,assigned_time from call_schedule where prisoner_id IN(select prisoner_id from visitor where visitor_id=?)";
            PreparedStatement pst1=con.prepareStatement(sql1);
            pst1.setString(1,visitor);
            ResultSet rs1=pst1.executeQuery();
            if(rs1.next()==false)
            {
                call.setText("Call schedule not assigned");
            }
            else
            {
                String day ,time,suffix;
                int d;
               
                day=rs1.getString("assigned_day");
                time=rs1.getString("assigned_time");
                 d=Integer.parseInt(day);
                if(d%10==1)
                {
                    suffix="st";
                }
                else
                {
                    if(d%10==2)
                    {
                        suffix="nd";
                    }
                    else
                    {
                        if(d%10==3)
                        {
                            suffix="rd";
                        }
                        else
                        {
                            suffix="th";
                        }
                    }
                    
                }
                call.setText("Date: "+day+suffix+" Time: "+time+":00");
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Med_Report.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        call = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        fname = new javax.swing.JLabel();
        lname = new javax.swing.JLabel();
        job = new javax.swing.JLabel();
        crime = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        officer = new javax.swing.JLabel();
        release_date = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        wewf3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        sentence = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        release = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 154, -1, -1));

        jPanel2.setBackground(new java.awt.Color(75, 80, 81));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("     x");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(963, 0, 43, 43));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("     -");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(914, 11, 43, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("WELCOME");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 100));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        call.setBackground(new java.awt.Color(51, 51, 51));
        call.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        call.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(call, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, 390, 34));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("LAST NAME :");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 140, 34));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CRIME :");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 140, 34));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("JOB ASSIGNED :");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 158, 34));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("AGE :");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 140, 34));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("SENTENCE :");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, -1, 34));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("OFFICER ASSIGNED :");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, -1, 46));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("RELEASE DATE :");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, -1, 34));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("GENDER :");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, -1, 34));

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("MEDICAL REPORT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 366, -1, 44));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SCHEDULED CALL:");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 190, 34));

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("ACTIVITY");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 366, 131, 44));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("FIRST NAME :");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 140, 34));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 350, 30));

        fname.setBackground(new java.awt.Color(51, 51, 51));
        fname.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        fname.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 140, 34));

        lname.setBackground(new java.awt.Color(51, 51, 51));
        lname.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lname.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 140, 30));

        job.setBackground(new java.awt.Color(51, 51, 51));
        job.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        job.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(job, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 220, 30));

        crime.setBackground(new java.awt.Color(51, 51, 51));
        crime.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        crime.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(crime, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 140, 20));

        age.setBackground(new java.awt.Color(51, 51, 51));
        age.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        age.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 140, 20));

        officer.setBackground(new java.awt.Color(51, 51, 51));
        officer.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        officer.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(officer, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 190, 34));

        release_date.setBackground(new java.awt.Color(51, 51, 51));
        release_date.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        release_date.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(release_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 140, 34));

        gender.setBackground(new java.awt.Color(51, 51, 51));
        gender.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        gender.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, 140, 34));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 140, 30));
        jPanel4.add(wewf3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 140, 30));
        jPanel4.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 140, 20));
        jPanel4.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 220, 30));
        jPanel4.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 140, 30));

        sentence.setBackground(new java.awt.Color(51, 51, 51));
        sentence.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        sentence.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(sentence, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 140, 34));
        jPanel4.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 140, 30));
        jPanel4.add(release, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 190, 30));
        jPanel4.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, 140, 30));
        jPanel4.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, 140, 30));

        jButton3.setBackground(new java.awt.Color(153, 153, 153));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("LOG OUT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, 136, 44));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1010, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Med_Report m=new Med_Report(1,visitor);
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Activity a;
        try {
            a = new Activity(visitor);
            a.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MainVisit.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Intro i=new Intro();
        i.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel6MouseClicked

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
            java.util.logging.Logger.getLogger(MainVisit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainVisit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainVisit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainVisit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
            new MainVisit(" ").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel age;
    private javax.swing.JLabel call;
    private javax.swing.JLabel crime;
    private javax.swing.JLabel fname;
    private javax.swing.JLabel gender;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel job;
    private javax.swing.JLabel lname;
    private javax.swing.JLabel officer;
    private javax.swing.JSeparator release;
    private javax.swing.JLabel release_date;
    private javax.swing.JLabel sentence;
    private javax.swing.JSeparator wewf3;
    // End of variables declaration//GEN-END:variables

    
}
