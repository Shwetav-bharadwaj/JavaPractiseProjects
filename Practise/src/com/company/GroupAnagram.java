package com.company;


import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.*;

public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs)
    {
        System.out.println("The input Array of Strings are:"+Arrays.toString(strs));
        List<List<String>> listOfLists = new ArrayList<>();
        HashMap<String,List<String>> hmap = new HashMap<>();


        for(int  i = 0 ; i<strs.length;i++)
        {
            char[] temp = strs[i].toCharArray();
            System.out.println(temp);
            Arrays.sort(temp);
            System.out.println("Sorted Chars"+Arrays.toString(temp));
            String sortedString = String.valueOf(temp);
            System.out.println("Sorted String: "+sortedString);

            if(!hmap.containsKey(sortedString))
            {
                hmap.put(sortedString,new ArrayList<String>());
            }
            hmap.get(sortedString).add(strs[i]);

        }
        System.out.println("HASH MAP IS ***"+hmap.values());
        for(String s : hmap.keySet())
        {
            listOfLists.add(hmap.get(s));
        }
        System.out.println(listOfLists);
        return listOfLists;
    }
}
