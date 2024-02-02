package org.example;

import java.util.ArrayList;


public class School {
    ArrayList<Student> students;
    public School(ArrayList<Student> students){
        this.students = new ArrayList<>(students);

    }
    void addStudent(Student s){
        students.add(s);
    }
    void printAllStudent(){
        System.out.println("print all = ");
        for(Student s: students){
            System.out.println( s.firstName+" "+s.lastName+" "+s.studentID);
        }
    }
    void findByID(String id){
        for(Student s: students){
            if(id.equals(s.studentID))
                System.out.println("find by ID  " + s.firstName + " " + s.lastName + " " + s.studentID);
            }
    }
    void removeStudent(Student s){
        students.remove(s);
    }
}
