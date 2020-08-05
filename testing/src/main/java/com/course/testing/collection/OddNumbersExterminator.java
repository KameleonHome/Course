package com.course.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> exterm = new ArrayList<Integer>();
            for(int i: numbers) {
                if(i%2==0) {
                    exterm.add(i);
                }
        }
            return exterm;
    }
}
