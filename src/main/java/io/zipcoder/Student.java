package io.zipcoder;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;

    public Student(String firstName, String lastName, ArrayList<Double> examScores){
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = examScores;
    }



    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getExamScores() { return examScores.toString(); }

    public int getNumberOfExamsTaken() { return examScores.size(); }



    public void setFirstName() { this.firstName = firstName; }

    public void setLastName() { this.lastName = lastName; }

    public void setExamScores() { this.examScores = examScores; }



    public void addExamScore(double examScore) {
        this.examScores.add(examScore);
    }

    public void setExamScore(int examNumber, double newScore) {
        this.examScores.set(examNumber, newScore);
    }

}








