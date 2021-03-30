package io.zipcoder;

import java.util.Arrays;
import java.util.Collections;

public class Classroom {

    private Student[] students;

    public Classroom(int maxSize){
        this.students = new Student[maxSize];
    }

    public Classroom(Student[] students){
        this.students = students;
    }

    public Classroom(){
        this.students = new Student[30];
    }



    public Student[] getStudents(){
        return this.students;
    }

    public double getAverageExamScore(){
        double returnDouble = 0;
        for(int i = 0; i < this.students.length; i++){
            if(this.students[i] != null){
                returnDouble = returnDouble + this.students[i].getAverageExamScore();
            }
        }
        return returnDouble / this.students.length;
    }

    public void addStudent(Student student, int i){
        this.students[i] = student;
    }

    public void removeStudent(String firstName, String lastName){
        for(int i = 0; i < this.students.length; i++){
            if(this.students[i].getFirstName().equals(firstName) && this.students[i].getLastName().equals(lastName)){
                this.students[i] = null;
                Arrays.sort(this.students);
                break;
            }
        }
    }

    public Student[] getStudentsByScore(){
        Arrays.sort(this.students);
        return this.students;
    }

}












