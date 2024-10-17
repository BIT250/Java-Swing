package com.mycompany.campustasksuite;

import com.mycompany.campustasksuite.studentmanager.StudentManager;
import java.awt.CardLayout;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import myprofile.MyProfile;

/**
 *
 * @author Bogdan
 */
public class CampusTaskSuite extends javax.swing.JFrame {

    private CardLayout cardLayout;
    private JPanel cardPanel;
    JPanel mainMenuPanel;
    StudentManager studentManager;
    MyProfile myProfile;
    
    public CampusTaskSuite() {
        initComponents();
        initCustomComponents();
    }
    
    private void initCustomComponents() {
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);
        mainMenuPanel = new JPanel();
        studentManager = new StudentManager();
        myProfile = new MyProfile();
        
        mainMenuPanel.setLayout(null);
        java.awt.Dimension panelSize = this.getPreferredSize();
        mainMenuPanel.setPreferredSize(panelSize);
        
        mainMenuPanel.add(jButtonStudentManager);
        mainMenuPanel.add(jButtonMyProfile);
        mainMenuPanel.add(jLabelWelcome);

        cardPanel.add(mainMenuPanel, "MainMenu");
        cardPanel.add(studentManager, "StudentManager");
        cardPanel.add(myProfile, "MyProfile");
        
        this.updateWelcomeMessage();

        this.setContentPane(cardPanel);
        cardLayout.show(cardPanel, "MainMenu");
        this.setVisible(true);
       
    }
    
    private void adjustFrameSize(JPanel panel) {
        java.awt.Dimension panelSize = panel.getPreferredSize();
        this.setSize(panelSize.width, panelSize.height);
        this.revalidate(); // Revalidate to refresh the layout and apply the size changes
    }
    
    public void showMainMenuPanel() {
        this.updateWelcomeMessage();
        cardLayout.show(cardPanel, "MainMenu");
        adjustFrameSize(mainMenuPanel); 
    }
    
    private void showMyProfilePanel() {
        cardLayout.show(cardPanel, "MyProfile");
        adjustFrameSize(myProfile); 
    }
    
    private void showStudentManagerPanel()
    {
        cardLayout.show(cardPanel, "StudentManager");
        adjustFrameSize(studentManager);
    }
    
    private void updateWelcomeMessage()
    {
        String profileInfo = this.myProfile.readProfileInfo();
        String[] profileInfoList = profileInfo.split(",");
        
        String name = profileInfoList[0];
        String year = profileInfoList[1];
        Boolean scholarship = Boolean.parseBoolean(profileInfoList[2]);
        String message;
        
        if (scholarship)
        {
            message = "bursier";
        }
        else
        {
            message = "fără bursă";
        }
        
        String welcomeMessage = "Bună ziua, " + name + " " + year + " " + message + "!";
        this.jLabelWelcome.setText(welcomeMessage);
        
        System.out.println(scholarship);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonStudentManager = new javax.swing.JButton();
        jLabelWelcome = new javax.swing.JLabel();
        jButtonMyProfile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonStudentManager.setText("Student Management Table");
        jButtonStudentManager.setActionCommand("Student Management Table ");
        jButtonStudentManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStudentManagerActionPerformed(evt);
            }
        });

        jLabelWelcome.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabelWelcome.setText("Bine ați venit, Teglaș Bogdan!");
        jLabelWelcome.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jButtonMyProfile.setText("My Profile");
        jButtonMyProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMyProfileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonMyProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonStudentManager, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(676, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabelWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jButtonMyProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButtonStudentManager, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonStudentManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStudentManagerActionPerformed
        showStudentManagerPanel();
    }//GEN-LAST:event_jButtonStudentManagerActionPerformed

    private void jButtonMyProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMyProfileActionPerformed
        showMyProfilePanel();
    }//GEN-LAST:event_jButtonMyProfileActionPerformed

   
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
            java.util.logging.Logger.getLogger(CampusTaskSuite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CampusTaskSuite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CampusTaskSuite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CampusTaskSuite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CampusTaskSuite().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonMyProfile;
    private javax.swing.JButton jButtonStudentManager;
    private javax.swing.JLabel jLabelWelcome;
    // End of variables declaration//GEN-END:variables
}
