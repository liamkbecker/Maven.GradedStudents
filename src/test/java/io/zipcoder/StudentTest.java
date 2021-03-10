package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class StudentTest {

    @Test
    public void constructorTest(){
        //Given
        String givenFName = "Haha";
        String givenLName = "Ha";
        ArrayList<Double> givenScores = new ArrayList<>();
        givenScores.add(101.5);

        //When
        Student one = new Student(givenFName, givenLName, givenScores);
        String retrievedFName = one.getFirstName();
        String retrievedLName = one.getLastName();
        String retrievedScores = one.getExamScores();

        //Then
        Assert.assertEquals(retrievedFName, givenFName);
        Assert.assertEquals(retrievedLName, givenLName);
        Assert.assertEquals(retrievedScores, givenScores.toString());
    }


    @Test
    public void setNamesTest(){
        //Given
        String givenFName = "Wiwitb";
        String givenLName = "See above";
        ArrayList<Double> givenScores = new ArrayList<>();
        givenScores.add(101.5);
        Student two = new Student("Bronze", "Gold", givenScores);

        //When
        two.setFirstName(givenFName);
        two.setLastName(givenLName);

        //Then
        Assert.assertEquals(two.getFirstName(), givenFName);
        Assert.assertEquals(two.getLastName(), givenLName);
    }

    @Test
    public void addSetScoresTest(){
        //Given
        ArrayList<Double> givenScores = new ArrayList<>();
        givenScores.add(101.5);
        Student three = new Student("Carina", "Rinnyface", givenScores);

        //When
        three.addExamScore(99.0);
        three.addExamScore(95.0);
        three.setExamScore(2, 97.0);
        String expectedScores = "[101.5, 97.0, 95.0]";

        //Then
        Assert.assertEquals(expectedScores, three.getExamScores());
    }

    @Test
    public void getScoresTest(){
        //Given
        ArrayList<Double> givenScores = new ArrayList<>();
        givenScores.add(101.5);

        //When
        Student four = new Student("Carina", "Rinnyface", givenScores);
        four.addExamScore(99.0);
        four.addExamScore(95.0);
        four.setExamScore(2, 97.5);

        int expectedNumber = 3;
        double expectedAverage = 98;

        //Then
        Assert.assertEquals(expectedNumber, four.getNumberOfExamsTaken());
        Assert.assertEquals(expectedAverage, four.getAverageExamScore(), 0.0001);
    }

    @Test
    public void toStringTest(){
        //Given
        ArrayList<Double> givenScores = new ArrayList<>();
        givenScores.add(101.5);

        //When
        Student five = new Student("Carina", "Rinnyface", givenScores);
        String expectedString = "Student{firstName='Carina', lastName='Rinnyface', examScores=[101.5]}";

        //Then
        Assert.assertEquals(expectedString, five.toString());
    }
}