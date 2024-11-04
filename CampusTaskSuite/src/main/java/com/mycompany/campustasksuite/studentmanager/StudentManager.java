/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.campustasksuite.studentmanager;
import com.mycompany.campustasksuite.CampusTaskSuite;
import java.awt.Color;
import java.util.Comparator;
import javax.swing.JButton;
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
            jLabel1.setForeground(darkForeground);
            jLabel2.setForeground(darkForeground);
            jLabel3.setForeground(darkForeground);
            jLabel4.setForeground(darkForeground);
            jLabel5.setForeground(darkForeground);
            jLabel6.setForeground(darkForeground);
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
            jLabel1.setForeground(lightForeground);
            jLabel2.setForeground(lightForeground);
            jLabel3.setForeground(lightForeground);
            jLabel4.setForeground(lightForeground);
            jLabel5.setForeground(lightForeground);
            jLabel6.setForeground(lightForeground);
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
        jButtonSave = new javax.swing.JButton();
        jComboBoxFilter = new javax.swing.JComboBox<>();
        jComboBoxFilterSign = new javax.swing.JComboBox<>();
        jTextFieldFilterValue = new javax.swing.JTextField();
        jButtonDelete = new javax.swing.JButton();
        jToggleButtonFilter = new javax.swing.JToggleButton();
        jButtonDark = new javax.swing.JButton();
        jButtonReport = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1520, 800));
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

        jComboBoxSort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "Age", "Grade", "Department", "Year" }));

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

        jButtonSave.setText("Save");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jComboBoxFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id", "Name", "Department", "Year", "Grade" }));

        jComboBoxFilterSign.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "=", "<", ">", "conține", "<=", ">=" }));

        jTextFieldFilterValue.setText("Value");

        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

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

        jButtonReport.setText("Generate Report");
        jButtonReport.setActionCommand("");
        jButtonReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(362, 362, 362)
                .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 1034, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBoxSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSort)
                                .addGap(171, 171, 171)
                                .addComponent(jComboBoxFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jComboBoxFilterSign, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldFilterValue, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jToggleButtonFilter, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonReport, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButtonYear1)
                                        .addGap(50, 50, 50)
                                        .addComponent(jRadioButtonYear2))
                                    .addComponent(jSpinnerAge, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(57, 57, 57)
                                .addComponent(jRadioButtonYear3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButtonYear4))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(163, 163, 163))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(194, 194, 194))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(206, 206, 206))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonDark)
                                .addGap(57, 57, 57))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonReport, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonDark))))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSort)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxFilter)
                    .addComponent(jComboBoxFilterSign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldFilterValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButtonFilter))
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
                        .addGap(45, 45, 45)
                        .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonDelete)
                .addGap(64, 64, 64))
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

//        AddStudentDialog dialog = new AddStudentDialog();
//        dialog.setVisible(true); // Show the modal dialog



    }//GEN-LAST:event_jButtonAddActionPerformed

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
         // Iterate from last to first to avoid index shifting
        for (int i = selectedRows.length - 1; i >= 0; i--) {
            this.studentModel.deleteRow(selectedRows[i]);
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonDark;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonReport;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtonSort;
    private javax.swing.JComboBox<String> jComboBoxDepartment;
    private javax.swing.JComboBox<String> jComboBoxFilter;
    private javax.swing.JComboBox<String> jComboBoxFilterSign;
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
    private javax.swing.JTextField jTextFieldFilterValue;
    private javax.swing.JTextField jTextFieldGrade;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JToggleButton jToggleButtonFilter;
    // End of variables declaration//GEN-END:variables
}
