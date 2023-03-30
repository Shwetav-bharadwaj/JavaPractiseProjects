package com.company;

import java.util.*;

public class KFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {
            //1,1,1,3,3,4,3,2,4,2
            System.out.println("The values are"+ Arrays.toString(nums));
            ArrayList<Integer> al = new ArrayList<>();
            int[] result = new int[k];
            HashMap<Integer , Integer> hm = new HashMap<Integer , Integer>();
            for(int i : nums)
            {

                if(hm.containsKey(i))
                {
                    int count = hm.get(i)+1;
                    hm.put(i,count);

                }
                else
                {
                    hm.put(i,1);
                }

            }
            System.out.println("The output HashMap is:" +hm);

            for(Map.Entry<Integer,Integer> h : hm.entrySet())
            {
                al.add(h.getValue());
            }
            System.out.println("The output ArrayList  is:" +al);
            Collections.sort(al);
            System.out.println("The output ArrayList  is:" +al);

            for(int i = al.size()-1,j=0;j<k;i--,j++)
            {
                System.out.println("the value of al(i) is : "+al.get(i));
               // result[j]= hm.get
                System.out.println("the value just added is"+result[j]);
                System.out.println("The result Array is"+Arrays.toString(result));
            }

            return result;

        }
}
