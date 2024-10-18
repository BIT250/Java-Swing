/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package myprofile;

import com.mycompany.campustasksuite.CampusTaskSuite;
import com.mycompany.campustasksuite.studentmanager.StudentManager;
import java.awt.CardLayout;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.ButtonModel;
import javax.swing.JPanel;

/**
 *
 * @author Bogdan
 */
public class MyProfile extends javax.swing.JPanel {
    
    public String profileFilePath = "./src/main/java/databases/my_profile_settings.txt";

    public MyProfile() {
        initComponents();
        jRadioButtonYear1.setActionCommand("IIS 1");
        jRadioButtonYear2.setActionCommand("IIS 2");
        
        this.updateFields();
    }
    
    public String readProfileInfo()
    {
        try(Scanner scanner = new Scanner(new File(this.profileFilePath))){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                return line;
            }
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
            return "";
        }
        return "";
    }
    
    private void updateFields()
    {
        String profileInfo = this.readProfileInfo();
        String[] profileInfoList = profileInfo.split(",");

        String name = profileInfoList[0];
        String year = profileInfoList[1];
        Boolean scholarship = Boolean.parseBoolean(profileInfoList[2]);
        
        this.jTextFieldName.setText(name);
        if(scholarship)
        {
            this.jCheckBoxScholarship.setSelected(true);
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextFieldName = new javax.swing.JTextField();
        jLabelTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButtonYear1 = new javax.swing.JRadioButton();
        jRadioButtonYear2 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jCheckBoxScholarship = new javax.swing.JCheckBox();
        jButtonSave = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();

        jTextFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNameActionPerformed(evt);
            }
        });

        jLabelTitle.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabelTitle.setText("My Profile");

        jLabel1.setText("Name:");

        jLabel2.setText("Year:");

        buttonGroup1.add(jRadioButtonYear1);
        jRadioButtonYear1.setSelected(true);
        jRadioButtonYear1.setText("IIS 1");
        jRadioButtonYear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonYear1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonYear2);
        jRadioButtonYear2.setText("IIS 2");
        jRadioButtonYear2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonYear2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Scholarship:");

        jButtonSave.setText("Save");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBoxScholarship))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldName))
                                .addComponent(jLabelTitle))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButtonYear2)
                                    .addComponent(jRadioButtonYear1)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonBack, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))))
                .addContainerGap(187, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabelTitle)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jRadioButtonYear1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonYear2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxScholarship)
                    .addComponent(jLabel3))
                .addGap(41, 41, 41)
                .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNameActionPerformed

    private void jRadioButtonYear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonYear1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonYear1ActionPerformed

    private void jRadioButtonYear2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonYear2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonYear2ActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        ((CampusTaskSuite) javax.swing.SwingUtilities.getWindowAncestor(this)).showMainMenuPanel();
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        String name = jTextFieldName.getText();
        
        ButtonModel year_chosen = buttonGroup1.getSelection();
        String year = year_chosen.getActionCommand();
        
        Boolean scholarship = jCheckBoxScholarship.isSelected();
        
        String content = name + "," + year + "," + scholarship;
        System.out.println(content);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(profileFilePath))) {
            writer.write(content);  
            writer.newLine(); 
            writer.flush();
            System.out.println("Written succesfully");
        } catch (IOException e) {
            e.printStackTrace(); 
        }
        
    }//GEN-LAST:event_jButtonSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JCheckBox jCheckBoxScholarship;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JRadioButton jRadioButtonYear1;
    private javax.swing.JRadioButton jRadioButtonYear2;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables
}
