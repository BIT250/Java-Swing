package com.mycompany.campustasksuite.studentmanager;


public class Student {
    public static int lastId=0;
    public int id;
    public String name;
    public String department;
    public int age;
    public float grade;
    public int year;
    
    public Student(String name, int age, float grade, String department, int year)
    {
        this.id = lastId + 1;
        lastId = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.department = department;
        this.year = year;
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
 
}
