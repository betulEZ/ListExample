package org.example;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students=new ArrayList<>();
        Student student=new Student("Name","lastname","23");
        Student student2=new Student("Name2","lastname2","232");

        School s=new School(students);
        s.addStudent(student);
        s.addStudent(student2);
        s.printAllStudent();
        s.findByID("23");
        s.removeStudent(student);


    }
}