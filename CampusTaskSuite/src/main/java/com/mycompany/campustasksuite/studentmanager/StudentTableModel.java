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
            case "name" -> Collections.sort(data, Comparator.comparing(Student::getName));
            case "age" -> Collections.sort(data, Comparator.comparingInt(Student::getAge));
            case "grade" -> Collections.sort(data, Comparator.comparing(Student::getGrade));
            case "department" -> Collections.sort(data, Comparator.comparing(Student::getDepartment));
            case "year" -> Collections.sort(data, Comparator.comparing(Student::getYear));
            default -> {
                return;
            }
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
        }
    }
    
    public void readData()
    {
        this.data = new ArrayList<>();
        try(Scanner scanner = new Scanner(new File(this.filePath))){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                data.add(new Student(line));
            }
            fireTableDataChanged();  

            
        }
        catch(FileNotFoundException e){
        }
    }
    
    public void filterData(String field, String operator, String value)
    {
        switch (field.toLowerCase())
        {
            case "name" -> this.filterName(operator, value);
            case "id" -> this.filterID(operator, value);
            case "year" -> this.filterYear(operator, value);
            case "age" -> this.filterAge(operator, value);
            case "department" -> this.filterDepartment(operator, value);
            case "grade" -> this.filterGrade(operator, value);
            default -> System.out.println("Invalid Filter");
            
            
        
        }
    }
    
    @Override
    public boolean isCellEditable(int row, int col)
      { return col != 0; }
    
    @Override

    public void setValueAt(Object value, int row, int col) {
        Student student = data.get(row);

        switch (col) {
            case 1 -> student.setName((String) value);
            case 2 -> student.setAge(Integer.parseInt(value.toString()));
            case 3 -> student.setGrade(Float.parseFloat(value.toString()));
            case 4 -> student.setDepartment((String) value);
            case 5 -> student.setYear(Integer.parseInt(value.toString()));
        }

        fireTableCellUpdated(row, col);
    }
    
    private void filterName(String operator, String value)
    {
        List<Student> new_data = new ArrayList<>();
        
        switch (operator)
        {
            case "=" -> {
                for(Student student:this.data)
                    if (student.getName().equals(value))
                        new_data.add(student);
            }
            case "conține" -> {
                for(Student student:this.data)
                    if (student.getName().contains(value))
                        new_data.add(student);
            }
            case "<" -> {
                for(Student student:this.data)
                    if (student.getName().compareTo(value) < 0)
                        new_data.add(student);
            }
            case "<=" -> {
                for(Student student:this.data)
                    if (student.getName().compareTo(value) <= 0)
                        new_data.add(student);
            }
            case ">=" -> {
                for(Student student:this.data)
                    if (student.getName().compareTo(value) >= 0)
                        new_data.add(student);
            }
            case ">" -> {
                for(Student student:this.data)
                    if (student.getName().compareTo(value) > 0)
                        new_data.add(student);
            }
        }        
        this.data = new_data;
        fireTableDataChanged();  
    }
    
     private void filterID(String operator, String value)
    {
        List<Student> new_data = new ArrayList<>();
        int value_int = Integer.parseInt(value);
        
        switch (operator)
        {
            case "=" -> {
                for(Student student:this.data)
                    if (student.getId() == value_int)
                        new_data.add(student);
            }
            case "conține" -> {
                for(Student student:this.data)
                    if (String.valueOf(student.getId()).contains(value))
                        new_data.add(student);
            }
            case "<" -> {
                for(Student student:this.data)
                    if (student.getId() < value_int)
                        new_data.add(student);
            }
            case "<=" -> {
                for(Student student:this.data)
                    if (student.getId() <= value_int)
                        new_data.add(student);
            }
            case ">=" -> {
                for(Student student:this.data)
                    if (student.getId() >= value_int)
                        new_data.add(student);
            }
            case ">" -> {
                for(Student student:this.data)
                    if (student.getId() > value_int)
                        new_data.add(student);
            }
        }        
        this.data = new_data;
        fireTableDataChanged();  
    }
     
    private void filterDepartment(String operator, String value)
    {
        List<Student> new_data = new ArrayList<>();
        
        switch (operator)
        {
            case "=" -> {
                for(Student student:this.data)
                    if (student.getDepartment().equals(value))
                        new_data.add(student);
            }
            case "conține" -> {
                for(Student student:this.data)
                    if (student.getDepartment().contains(value))
                        new_data.add(student);
            }
            case "<" -> {
                for(Student student:this.data)
                    if (student.getDepartment().compareTo(value) < 0)
                        new_data.add(student);
            }
            case "<=" -> {
                for(Student student:this.data)
                    if (student.getDepartment().compareTo(value) <= 0)
                        new_data.add(student);
            }
            case ">=" -> {
                for(Student student:this.data)
                    if (student.getDepartment().compareTo(value) >= 0)
                        new_data.add(student);
            }
            case ">" -> {
                for(Student student:this.data)
                    if (student.getDepartment().compareTo(value) > 0)
                        new_data.add(student);
            }
        }        
        this.data = new_data;
        fireTableDataChanged();  
    }
    
    private void filterAge(String operator, String value)
    {
        List<Student> new_data = new ArrayList<>();
        int value_int = Integer.parseInt(value);
        
        switch (operator)
        {
            case "=" -> {
                for(Student student:this.data)
                    if (student.getAge() == value_int)
                        new_data.add(student);
            }
            case "conține" -> {
                for(Student student:this.data)
                    if (String.valueOf(student.getAge()).contains(value))
                        new_data.add(student);
            }
            case "<" -> {
                for(Student student:this.data)
                    if (student.getAge() < value_int)
                        new_data.add(student);
            }
            case "<=" -> {
                for(Student student:this.data)
                    if (student.getAge() <= value_int)
                        new_data.add(student);
            }
            case ">=" -> {
                for(Student student:this.data)
                    if (student.getAge() >= value_int)
                        new_data.add(student);
            }
            case ">" -> {
                for(Student student:this.data)
                    if (student.getAge() > value_int)
                        new_data.add(student);
            }
        }        
        this.data = new_data;
        fireTableDataChanged();  
    }
    
    private void filterYear(String operator, String value)
    {
        List<Student> new_data = new ArrayList<>();
        int value_int = Integer.parseInt(value);
        
        switch (operator)
        {
            case "=" -> {
                for(Student student:this.data)
                    if (student.getYear() == value_int)
                        new_data.add(student);
            }
            case "conține" -> {
                for(Student student:this.data)
                    if (String.valueOf(student.getYear()).contains(value))
                        new_data.add(student);
            }
            case "<" -> {
                for(Student student:this.data)
                    if (student.getYear() < value_int)
                        new_data.add(student);
            }
            case "<=" -> {
                for(Student student:this.data)
                    if (student.getYear() <= value_int)
                        new_data.add(student);
            }
            case ">=" -> {
                for(Student student:this.data)
                    if (student.getYear() >= value_int)
                        new_data.add(student);
            }
            case ">" -> {
                for(Student student:this.data)
                    if (student.getYear() > value_int)
                        new_data.add(student);
            }
        }        
        this.data = new_data;
        fireTableDataChanged();  
    }
    
    private void filterGrade(String operator, String value)
    {
        List<Student> new_data = new ArrayList<>();
        float value_int = Float.parseFloat(value);
        
        switch (operator)
        {
            case "=" -> {
                for(Student student:this.data)
                    if (student.getGrade() == value_int)
                        new_data.add(student);
            }
            case "conține" -> {
                for(Student student:this.data)
                    if (String.valueOf(student.getGrade()).contains(value))
                        new_data.add(student);
            }
            case "<" -> {
                for(Student student:this.data)
                    if (student.getGrade() < value_int)
                        new_data.add(student);
            }
            case "<=" -> {
                for(Student student:this.data)
                    if (student.getGrade() <= value_int)
                        new_data.add(student);
            }
            case ">=" -> {
                for(Student student:this.data)
                    if (student.getGrade() >= value_int)
                        new_data.add(student);
            }
            case ">" -> {
                for(Student student:this.data)
                    if (student.getGrade() > value_int)
                        new_data.add(student);
            }
        }        
        this.data = new_data;
        fireTableDataChanged();  
    }
    
}
