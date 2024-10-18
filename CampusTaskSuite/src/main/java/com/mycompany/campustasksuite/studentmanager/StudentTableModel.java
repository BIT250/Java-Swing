package com.mycompany.campustasksuite.studentmanager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class StudentTableModel extends AbstractTableModel{
    List<Student> data = new ArrayList<>();
    private final String[] columnNames = {"ID", "Name", "Age", "Grade", "Department", "Year"};

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Student student = data.get(rowIndex);  
        return switch (columnIndex) {
            case 0 -> student.id;
            case 1 -> student.name;
            case 2 -> student.age;
            case 3 -> student.grade;
            case 4 -> student.department;
            case 5 -> student.year;
            default -> null;
        };
    }
    
    @Override
    public String getColumnName(int column) {
        return columnNames[column]; 
    }
    

    void addRow(Student student) {
        this.data.add(student);
        fireTableRowsInserted(data.size() - 1, data.size() - 1);  
    }
    
    public void sortData(String column) {
        switch (column.toLowerCase()) {
            case "name":
                Collections.sort(data, Comparator.comparing(Student::getName));
                break;
            case "age":
                Collections.sort(data, Comparator.comparingInt(Student::getAge));
                break;
            case "grade":
                Collections.sort(data, Comparator.comparing(Student::getGrade));
                break;
            case "department":
                Collections.sort(data, Comparator.comparing(Student::getDepartment));
                break;
            case "year":
                Collections.sort(data, Comparator.comparing(Student::getYear));
                break;
            default:
                return;
        }
        fireTableDataChanged();  
    }
}
