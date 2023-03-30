package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ArrayListWithoutDuplicates {

    public void printlistwithnoduplicates()
    {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(2);
        al.add(2);
        al.add(1);
        System.out.println("Print the ArrayList"+al);

        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<al.size();i++)
        {
            System.out.println("the element adding to Hashset is : "+al.get(i));
            hs.add(al.get(i));
        }

        System.out.println("The Hashset is :"+hs);

    }


}
