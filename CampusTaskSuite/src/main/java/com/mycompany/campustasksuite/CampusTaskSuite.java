package com.mycompany.campustasksuite;

import com.mycompany.campustasksuite.studentmanager.StudentManager;
import java.awt.CardLayout;
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

    public static int WIDTH;
    public static int HEIGHT;
    private CardLayout cardLayout;
    private JPanel cardPanel;
    JPanel mainMenuPanel;
    StudentManager studentManager;
    MyProfile myProfile;
    
    public CampusTaskSuite() {
        initComponents();
        java.awt.Dimension panelSize = this.getPreferredSize();
        this.WIDTH = panelSize.width;
        this.HEIGHT = panelSize.height;
        
        System.out.println("MAIN");
        System.out.println(this.WIDTH);

        initCustomComponents();
    }
    
    private void initCustomComponents() {
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);
        mainMenuPanel = new JPanel();
        studentManager = new StudentManager();
        myProfile = new MyProfile(cardLayout, cardPanel, mainMenuPanel);
        
        mainMenuPanel.setLayout(null);
        java.awt.Dimension panelSize = this.getPreferredSize();
        mainMenuPanel.setPreferredSize(panelSize);
        
        mainMenuPanel.add(jButtonStudentManager);
        mainMenuPanel.add(jButtonMyProfile);

        cardPanel.add(mainMenuPanel, "MainMenu");
        cardPanel.add(studentManager, "StudentManager");
        cardPanel.add(myProfile, "MyProfile");

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
        cardLayout.show(cardPanel, "MainMenu");
        adjustFrameSize(mainMenuPanel); // Adjust the frame size based on the Main Menu panel
    }
    
    private void showMyProfilePanel() {
        cardLayout.show(cardPanel, "MyProfile");
        adjustFrameSize(myProfile); // Adjust the frame size based on the MyProfile panel
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonStudentManager = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonMyProfile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonStudentManager.setText("Student Management Table");
        jButtonStudentManager.setActionCommand("Student Management Table ");
        jButtonStudentManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStudentManagerActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Bine ați venit, Teglaș Bogdan!");

        jButtonMyProfile.setText("My Profile");
        jButtonMyProfile.setActionCommand("My Profile");
        jButtonMyProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMyProfileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(241, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(193, 193, 193))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonMyProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonStudentManager, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel1)
                .addGap(147, 147, 147)
                .addComponent(jButtonStudentManager, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButtonMyProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonStudentManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStudentManagerActionPerformed
        cardLayout.show(cardPanel, "StudentManager");

        cardPanel.revalidate();
        cardPanel.repaint();
    }//GEN-LAST:event_jButtonStudentManagerActionPerformed

    private void jButtonMyProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMyProfileActionPerformed
//        java.awt.Dimension panelSize = myProfile.getPreferredSize();
//        
//        this.setSize(panelSize.width, panelSize.height);
//        cardLayout.show(cardPanel, "MyProfile");
//        
//        cardPanel.revalidate();
//        cardPanel.repaint();
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
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
