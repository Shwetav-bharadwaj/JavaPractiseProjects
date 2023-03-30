package com.company;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringNoDuplicates
{

    public int lengthOfLongestSubstring(String s)
    {
       int maxLength =0;
        System.out.println("THE VALUE OF STRING IS:: "+s);

       //[a][b][c][a][b][c][d]

        for(int i = 0;i<s.length();i++)
        {
            System.out.println("The value of i th element is :"+s.charAt(i));
            StringBuilder resultstring = new StringBuilder();
            for(int j=i;j<s.length();j++)
            {
                System.out.println("The value of j th element is :"+s.charAt(j));
                if((resultstring.indexOf(String.valueOf(s.charAt(j))))!= -1)
                {
                    System.out.println("Breaking HERE");
                    break;
                }
                resultstring = resultstring.append(s.charAt(j));
                maxLength = Math.max(maxLength,resultstring.length());

                System.out.println("*******************Result String is : "+resultstring+",, Max Length is: "+maxLength);

            }
        }


       return maxLength;
    }

    public int secondway(String s)
    {

/*        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxlength = 0;
        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxlength = Math.max(maxlength, right - left + 1);
        }
        return maxlength;*/

        int left_pointer = 0;
        int maxLength =0;

        HashSet<Character> hs = new HashSet<>();
        for( int right_pointer = 0;right_pointer<s.length();right_pointer++ )
        {
            System.out.println("InSide For Loop: Left is at "+s.charAt(left_pointer)+"Right is at : "+s.charAt(right_pointer));
            while (hs.contains(s.charAt(right_pointer)))
                {
                    hs.remove(s.charAt(left_pointer));
                    left_pointer++;
                    System.out.println("InSide While Loop: Left is at "+s.charAt(left_pointer)+"Right is at : "+s.charAt(right_pointer));
                    System.out.println("Set Contains"+hs);
                }

                hs.add(s.charAt(right_pointer));
                maxLength = Math.max(maxLength,right_pointer-left_pointer+1);

            }


        System.out.println("the max length is :"+maxLength);
        return maxLength;
    }
}
