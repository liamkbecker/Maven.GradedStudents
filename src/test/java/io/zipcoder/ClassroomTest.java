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
        Classroom c1 = new Classroom();
        Classroom c2 = new Classroom(19);
        Classroom c3 = new Classroom(list1);

        //Then
        Assert.assertNull(c1.getStudents());
        Assert.assertNull(c2.getStudents());
        Assert.assertEquals(c3.getStudents(), list1);
    }

}










