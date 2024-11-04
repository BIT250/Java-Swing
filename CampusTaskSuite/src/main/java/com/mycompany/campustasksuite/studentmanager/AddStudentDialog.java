package com.mycompany.campustasksuite.studentmanager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddStudentDialog extends JDialog {

    private JTextField nameField;
    private JTextField ageField;
    private JTextField gradeField;
    private JTextField departmentField;
    private JTextField yearField;

    public AddStudentDialog() {
        setTitle("Add New Student");
        setModal(true);
        setLayout(new GridLayout(6, 2, 10, 10));
        setSize(600, 500);
        setLocationRelativeTo(null); 

        // Adding fields and labels
        add(new JLabel("Name:"));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("Age:"));
        ageField = new JTextField();
        add(ageField);

        add(new JLabel("Grade:"));
        gradeField = new JTextField();
        add(gradeField);

        add(new JLabel("Department:"));
        departmentField = new JTextField();
        add(departmentField);

        add(new JLabel("Academic Year:"));
        yearField = new JTextField();
        add(yearField);

        JButton addButton = new JButton("Add");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Here you would gather input and possibly save it to the database
                String name = nameField.getText();
                int age = Integer.parseInt(ageField.getText());
                float grade = Float.parseFloat(gradeField.getText());
                String department = departmentField.getText();
                int year = Integer.parseInt(yearField.getText());

                // Print or process the input data
                System.out.println("Added Student: " + name + ", " + age + ", " + grade + ", " + department + ", " + year);

                // Close the dialog after adding
                dispose();
            }
        });
        add(addButton);
    }
}
