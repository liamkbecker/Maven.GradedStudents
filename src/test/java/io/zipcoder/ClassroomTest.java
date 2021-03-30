package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ClassroomTest {

    @Test
    public void constructorsTest(){
        //Given
        ArrayList<Double> givenScores = new ArrayList<>();
        givenScores.add(101.5);
        Student s1 = new Student("Hazel", "Nut", givenScores);
        Student[] list1 = new Student[1];
        list1[0] = s1;

        //When
        Classroom c1 = new Classroom(list1);

        //Then
        Assert.assertEquals(c1.getStudents(), list1);
    }

    @Test
    public void averageExamScoreTest(){
        //Given
        ArrayList<Double> givenScores1 = new ArrayList<>();
        givenScores1.add(101.5);
        givenScores1.add(73.4);

        ArrayList<Double> givenScores2 = new ArrayList<>();
        givenScores2.add(101.5);
        givenScores2.add(102.5);
        givenScores2.add(103.5);

        //When
        Student s1 = new Student("Hazel", "Nut", givenScores1);
        Student s2 = new Student("BB", "Beebs", givenScores2);

        Student[] list1 = new Student[2];
        list1[0] = s1;
        list1[1] = s2;
        Classroom c1 = new Classroom(list1);

        //Then
        Assert.assertEquals(c1.getAverageExamScore(), 94.975, 0.000001);
    }

    @Test
    public void addTest(){
        //Given
        ArrayList<Double> givenScores1 = new ArrayList<>();
        givenScores1.add(101.5);
        givenScores1.add(73.4);

        ArrayList<Double> givenScores2 = new ArrayList<>();
        givenScores2.add(101.5);
        givenScores2.add(102.5);
        givenScores2.add(103.5);

        //When
        Student s1 = new Student("Hazel", "Nut", givenScores1);
        Student s2 = new Student("BB", "Beebs", givenScores2);

        Student[] list1 = new Student[5];
        list1[0] = s1;
        list1[1] = s2;
        Classroom c1 = new Classroom(list1);

        Student s3 = new Student("Rinny", "Cariface", givenScores1);
        c1.addStudent(s3, 2);
        list1[2] = s3;

        //Then
        Assert.assertEquals(c1.getStudents(), list1);
    }

    @Test
    public void sortTest(){
        ArrayList<Double> givenScores1 = new ArrayList<>();
        givenScores1.add(101.5);
        givenScores1.add(73.4);

        ArrayList<Double> givenScores2 = new ArrayList<>();
        givenScores2.add(101.5);
        givenScores2.add(102.5);
        givenScores2.add(103.5);

        //When
        Student s1 = new Student("Hazel", "Nut", givenScores1);
        Student s2 = new Student("BB", "Beebs", givenScores2);

        Student[] list1 = new Student[5];
        list1[0] = s1;
        list1[1] = s2;
        Classroom c1 = new Classroom(list1);

        Student s3 = new Student("Rinny", "Cariface", givenScores1);
        c1.addStudent(s3, 2);
        list1[2] = s3;

        Student[] list2 = new Student[5];
        list2[0] = s2;
        list2[1] = s1;
        list2[2] = s3;

        Assert.assertEquals(c1.getStudentsByScore(), list2);
    }

}










