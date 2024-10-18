/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.campustasksuite.studentmanager;
import com.mycompany.campustasksuite.CampusTaskSuite;
/**
 *
 * @author Bogdan
 */
public class StudentManager extends javax.swing.JPanel {
    StudentTableModel studentModel;
    public StudentManager() {
        initComponents();
        studentModel = new StudentTableModel();
        jTable1.setModel(studentModel);

        studentModel.addRow(new Student("Ion Mircea",24,10, "Informatica", 1));
        studentModel.addRow(new Student("Popescu Mihai",21,8, "Mate-Info", 2));
        studentModel.addRow(new Student("Pop Aurica",22,9, "Biologie", 2));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabelTitle = new javax.swing.JLabel();
        jButtonBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBoxSort = new javax.swing.JComboBox<>();
        jButtonSort = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxDepartment = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jRadioButtonYear1 = new javax.swing.JRadioButton();
        jRadioButtonYear2 = new javax.swing.JRadioButton();
        jRadioButtonYear3 = new javax.swing.JRadioButton();
        jRadioButtonYear4 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldGrade = new javax.swing.JTextField();
        jButtonAdd = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jSpinnerAge = new javax.swing.JSpinner();

        setPreferredSize(new java.awt.Dimension(1520, 729));
        setRequestFocusEnabled(false);

        jLabelTitle.setFont(new java.awt.Font("Corbel", 3, 48)); // NOI18N
        jLabelTitle.setText("Student Table Manager");

        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Name", "Department", "Year", "Grade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setHeaderValue("Id");
            jTable1.getColumnModel().getColumn(1).setHeaderValue("Name");
            jTable1.getColumnModel().getColumn(2).setHeaderValue("Department");
            jTable1.getColumnModel().getColumn(3).setHeaderValue("Year");
            jTable1.getColumnModel().getColumn(4).setHeaderValue("Grade");
        }

        jComboBoxSort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "Age", "Grade", "Department" }));

        jButtonSort.setText("Sort");
        jButtonSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSortActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Add Student");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Name:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Department:");

        jComboBoxDepartment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matematică-Informatică", "Biologie", "Litere" }));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Year:");

        buttonGroup1.add(jRadioButtonYear1);
        jRadioButtonYear1.setText("I");
        jRadioButtonYear1.setActionCommand("1");
        jRadioButtonYear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonYear1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonYear2);
        jRadioButtonYear2.setText("II");
        jRadioButtonYear2.setActionCommand("2");
        jRadioButtonYear2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonYear2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonYear3);
        jRadioButtonYear3.setText("III");
        jRadioButtonYear3.setActionCommand("3");
        jRadioButtonYear3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonYear3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonYear4);
        jRadioButtonYear4.setText("IV");
        jRadioButtonYear4.setActionCommand("4");
        jRadioButtonYear4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonYear4ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Grade:");

        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("Age:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBoxSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSort)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(170, 170, 170))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGap(107, 107, 107)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBoxDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jRadioButtonYear1)
                                                .addGap(50, 50, 50)
                                                .addComponent(jRadioButtonYear2))
                                            .addComponent(jSpinnerAge))
                                        .addGap(57, 57, 57)
                                        .addComponent(jRadioButtonYear3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jRadioButtonYear4))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(268, 268, 268)
                                .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(333, 333, 333)
                                .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(400, 400, 400)))
                .addContainerGap(395, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSort)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jComboBoxDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jRadioButtonYear1)
                            .addComponent(jRadioButtonYear3)
                            .addComponent(jRadioButtonYear4)
                            .addComponent(jRadioButtonYear2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jSpinnerAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextFieldGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(jButtonAdd)
                        .addGap(134, 134, 134)
                        .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        ((CampusTaskSuite) javax.swing.SwingUtilities.getWindowAncestor(this)).showMainMenuPanel();
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jButtonSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSortActionPerformed
        String sort_criteria = (String) this.jComboBoxSort.getSelectedItem();
        System.out.println(sort_criteria);
        studentModel.sortData(sort_criteria);      
    }//GEN-LAST:event_jButtonSortActionPerformed

    private void jRadioButtonYear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonYear1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonYear1ActionPerformed

    private void jRadioButtonYear2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonYear2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonYear2ActionPerformed

    private void jRadioButtonYear3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonYear3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonYear3ActionPerformed

    private void jRadioButtonYear4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonYear4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonYear4ActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        
        String name = this.jTextFieldName.getText();
        String department = (String) this.jComboBoxDepartment.getSelectedItem();
        int year = Integer.parseInt(this.buttonGroup1.getSelection().getActionCommand());
        int age = (int) this.jSpinnerAge.getValue();
        float grade = Float.parseFloat(this.jTextFieldGrade.getText());
        
        studentModel.addRow(new Student(name, age, grade, department, year));
    }//GEN-LAST:event_jButtonAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonSort;
    private javax.swing.JComboBox<String> jComboBoxDepartment;
    private javax.swing.JComboBox<String> jComboBoxSort;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JRadioButton jRadioButtonYear1;
    private javax.swing.JRadioButton jRadioButtonYear2;
    private javax.swing.JRadioButton jRadioButtonYear3;
    private javax.swing.JRadioButton jRadioButtonYear4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerAge;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldGrade;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables
}
