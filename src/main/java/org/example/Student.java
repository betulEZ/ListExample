package org.example;

public class Student {
     String firstName;
     String lastName;
     String studentID;

     public Student(String firstName, String lastName, String studentID) {
          this.firstName = firstName;
          this.lastName = lastName;
          this.studentID = studentID;
     }

     public String getFirstName() {
          return firstName;
     }

     public void setFirstName(String firstName) {
          this.firstName = firstName;
     }

     public String getLastName() {
          return lastName;
     }

     public void setLastName(String lastName) {
          this.lastName = lastName;
     }

     public String getStudentID() {
          return studentID;
     }

     public void setStudentID(String studentID) {
          this.studentID = studentID;
     }




}
