package com.company;

import java.util.ArrayList;
import java.util.List;

public class RemoveEvenIntegers {

    public ArrayList<Integer> removeEvenIntegersfromArray(int[] nums)
    {
        ArrayList<Integer> outputlist = new ArrayList<>();
        for(int i = 0; i<nums.length;i++)
        {
            if(nums[i]%2!=0)
            {
                outputlist.add(nums[i]);
            }
        }
        System.out.println("The output array is :"+outputlist);
        return outputlist;
    }
}
