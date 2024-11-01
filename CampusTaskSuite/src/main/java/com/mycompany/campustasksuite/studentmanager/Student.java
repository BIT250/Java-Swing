package com.mycompany.campustasksuite.studentmanager;

public class Student {
    public static int lastId = 0;
    public int id;
    public String name;
    public String department;
    public int age;
    public float grade;
    public int year;

    public Student(String name, int age, float grade, String department, int year) {
        this.id = lastId + 1;
        lastId = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.department = department;
        this.year = year;
    }

    public Student(String studentFromFile) {
        String[] studentDetailsList = studentFromFile.split(",");
        this.id = Integer.parseInt(studentDetailsList[0]);
        this.name = studentDetailsList[1];
        this.age = Integer.parseInt(studentDetailsList[2]);
        this.grade = Float.parseFloat(studentDetailsList[3]);
        this.department = studentDetailsList[4];
        this.year = Integer.parseInt(studentDetailsList[5]);
        lastId = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getAge() {
        return age;
    }

    public float getGrade() {
        return grade;
    }

    public int getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        String elevString = String.valueOf(id) + "," +
                this.name + "," +
                String.valueOf(this.age) + "," +
                String.valueOf(this.grade) + "," +
                String.valueOf(this.department) + "," +
                String.valueOf(this.year);
        return elevString;
    }
}
