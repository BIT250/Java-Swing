package com.mycompany.campustasksuite.studentmanager;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import javax.swing.table.AbstractTableModel;

public class StudentTableModel extends AbstractTableModel{
    List<Student> data = new ArrayList<>();
    private final String[] columnNames = {"ID", "Name", "Age", "Grade", "Department", "Year"};
    String filePath = "./src/main/java/databases/student_table.txt";

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
    
    public void saveData(){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) { // Open in overwrite mode (without 'true')
            for (Student student : data) {
                String studentString = student.toString();
                writer.write(studentString);
                writer.newLine(); // Add a new line after each student's data
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void readData()
    {
        try(Scanner scanner = new Scanner(new File(this.filePath))){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                data.add(new Student(line));
            }
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
    
}
