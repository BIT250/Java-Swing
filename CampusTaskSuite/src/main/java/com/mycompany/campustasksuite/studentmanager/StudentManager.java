/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.campustasksuite.studentmanager;
import com.mycompany.campustasksuite.CampusTaskSuite;
import java.awt.Color;
import java.util.Comparator;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author Bogdan
 */
public class StudentManager extends javax.swing.JPanel {
    StudentTableModel studentModel;
    private boolean isDarkMode = false;

    private final Color lightBackground = Color.WHITE;
    private final Color lightForeground = Color.BLACK;
    private final Color darkBackground = Color.DARK_GRAY;
    private final Color darkForeground = Color.WHITE;
    
    private final String path_to_database = "./src/main/java/databases/";
    
    public StudentManager() {
        initComponents();

        
        studentModel = new StudentTableModel();
        jTable1.setModel(studentModel);
        studentModel.readData();
        
        TableRowSorter<StudentTableModel> sorter = new TableRowSorter<>(studentModel);
        jTable1.setRowSorter(sorter);     
        
        
    }
    
    private void toggleDarkMode() {
        isDarkMode = !isDarkMode;  // Toggle the mode

        // Update colors based on the current mode
        if (isDarkMode) {
            this.setBackground(darkBackground);
            jTable1.setBackground(darkBackground);
            jTable1.setForeground(darkForeground);
            jScrollPane1.getViewport().setBackground(darkBackground);

            // Update button text and color for dark mode
            jButtonDark.setText("Enable Light Mode");
            jButtonDark.setBackground(darkBackground);
            jButtonDark.setForeground(darkForeground);

            // Set labels to white
            jLabelTitle.setForeground(darkForeground);
        } else {
            this.setBackground(lightBackground);
            jTable1.setBackground(lightBackground);
            jTable1.setForeground(lightForeground);
            jScrollPane1.getViewport().setBackground(lightBackground);

            // Update button text and color for light mode
            jButtonDark.setText("Enable Dark Mode");
            jButtonDark.setBackground(lightBackground);
            jButtonDark.setForeground(lightForeground);

            // Set labels to black
            jLabelTitle.setForeground(lightForeground);  
    }
    }
    
    private void confirmAndSaveBeforeClosing() {
        int choice = JOptionPane.showConfirmDialog(
                this,
                "Would you like to save your changes before exiting?",
                "Save Changes",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.WARNING_MESSAGE
        );

        if (choice == JOptionPane.YES_OPTION) {
            jButtonSaveActionPerformed(null);
        } else if (choice == JOptionPane.CANCEL_OPTION) {
            return;
        }

      
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
        jButtonSave = new javax.swing.JButton();
        jComboBoxFilter = new javax.swing.JComboBox<>();
        jComboBoxFilterSign = new javax.swing.JComboBox<>();
        jTextFieldFilterValue = new javax.swing.JTextField();
        jButtonDelete = new javax.swing.JButton();
        jToggleButtonFilter = new javax.swing.JToggleButton();
        jButtonDark = new javax.swing.JButton();
        jButtonReport = new javax.swing.JButton();
        jButtonAddStudent = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1420, 850));
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
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Name", "Department", "Year", "Grade", "Age"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jComboBoxSort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "Age", "Grade", "Department", "Year" }));

        jButtonSort.setBackground(new java.awt.Color(51, 153, 255));
        jButtonSort.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSort.setText("Sort");
        jButtonSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSortActionPerformed(evt);
            }
        });

        jButtonSave.setBackground(new java.awt.Color(51, 153, 255));
        jButtonSave.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSave.setText("Save");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jComboBoxFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id", "Name", "Department", "Year", "Grade" }));

        jComboBoxFilterSign.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "=", "<", ">", "conține", "<=", ">=" }));

        jTextFieldFilterValue.setText("Value");

        jButtonDelete.setBackground(new java.awt.Color(255, 0, 0));
        jButtonDelete.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jToggleButtonFilter.setBackground(new java.awt.Color(51, 153, 255));
        jToggleButtonFilter.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButtonFilter.setText("Filter");
        jToggleButtonFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonFilterActionPerformed(evt);
            }
        });

        jButtonDark.setText("DarkMode");
        jButtonDark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDarkActionPerformed(evt);
            }
        });

        jButtonReport.setBackground(new java.awt.Color(51, 153, 255));
        jButtonReport.setForeground(new java.awt.Color(255, 255, 255));
        jButtonReport.setText("Generate Report");
        jButtonReport.setActionCommand("");
        jButtonReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReportActionPerformed(evt);
            }
        });

        jButtonAddStudent.setBackground(new java.awt.Color(0, 204, 0));
        jButtonAddStudent.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAddStudent.setText("Add Student");
        jButtonAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddStudentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(502, 502, 502)
                        .addComponent(jButtonReport, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBoxSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSort)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonAddStudent)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(191, 191, 191))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(252, 252, 252)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonDark))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBoxFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxFilterSign, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldFilterValue, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jToggleButtonFilter)))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonDark)
                        .addComponent(jButtonBack)))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSort)
                    .addComponent(jComboBoxSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxFilter)
                    .addComponent(jComboBoxFilterSign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldFilterValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButtonFilter)
                    .addComponent(jButtonSave)
                    .addComponent(jButtonAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDelete))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonReport, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        confirmAndSaveBeforeClosing();
        ((CampusTaskSuite) javax.swing.SwingUtilities.getWindowAncestor(this)).showMainMenuPanel();
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jButtonSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSortActionPerformed
        String sort_criteria = (String) this.jComboBoxSort.getSelectedItem();
        System.out.println(sort_criteria);
        studentModel.sortData(sort_criteria);      
    }//GEN-LAST:event_jButtonSortActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        studentModel.saveData();  
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jToggleButtonFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonFilterActionPerformed
        
        if (this.jToggleButtonFilter.isSelected())
        {
            System.out.println("Buton filtrare apasat");
            
            String field = (String) this.jComboBoxFilter.getSelectedItem();
            String operator = (String) this.jComboBoxFilterSign.getSelectedItem();
            String value = (String) this.jTextFieldFilterValue.getText();
            
            studentModel.filterData(field, operator, value);
        }
        else
        {
            System.out.println("Buton filtrare dezactivat");
            studentModel.readData();
        }
        
    }//GEN-LAST:event_jToggleButtonFilterActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        int[] selectedRows = jTable1.getSelectedRows();
        
         // Check if any row is selected
        if (selectedRows.length == 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.", "No Selection", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Show a confirmation dialog
        int choice = JOptionPane.showConfirmDialog(
                this,
                "Are you sure you want to delete the selected row(s)?",
                "Confirm Deletion",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE
        );
        
        
        if (choice == JOptionPane.YES_OPTION) {
            for (int i = selectedRows.length - 1; i >= 0; i--) {
                this.studentModel.deleteRow(selectedRows[i]);
            }
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonDarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDarkActionPerformed
        this.toggleDarkMode();
    }//GEN-LAST:event_jButtonDarkActionPerformed

    private void jButtonReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReportActionPerformed
        GradeReportGenerator reportGenerator = new GradeReportGenerator(studentModel);
        reportGenerator.generatePdfReport(this.path_to_database + "GradeDistributionReport.pdf");
        System.out.println("Generated with success");
    }//GEN-LAST:event_jButtonReportActionPerformed

    private void jButtonAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddStudentActionPerformed
        AddDialog addDialog = new AddDialog((java.awt.Frame) SwingUtilities.getWindowAncestor(this), true, studentModel);
        addDialog.setLocationRelativeTo(this);
        addDialog.setVisible(true);
    }//GEN-LAST:event_jButtonAddStudentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonAddStudent;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonDark;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonReport;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtonSort;
    private javax.swing.JComboBox<String> jComboBoxFilter;
    private javax.swing.JComboBox<String> jComboBoxFilterSign;
    private javax.swing.JComboBox<String> jComboBoxSort;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldFilterValue;
    private javax.swing.JToggleButton jToggleButtonFilter;
    // End of variables declaration//GEN-END:variables
}
