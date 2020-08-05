package com.course.testing.collection;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        System.out.println("Test 1");
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> listIn = new ArrayList<Integer>();
        ArrayList<Integer> listOut;
        //When
        listOut = exterminator.exterminate(listIn);
        //Then
        Assert.assertTrue(listOut.isEmpty());
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        System.out.println("Test 2");
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> listIn = new ArrayList<Integer>();
        ArrayList<Integer> listOut;
        //When
        listIn.add(2);
        listIn.add(3);
        listIn.add(4);
        listOut = exterminator.exterminate(listIn);
        //Then
        Assert.assertFalse(listOut.isEmpty());
        Assert.assertEquals(2, listOut.size());
        Assert.assertTrue(listOut.get(1)%2==0);
    }
}
