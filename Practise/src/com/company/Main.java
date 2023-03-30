package com.company;

public class Main
{



    public static void main(String[] args)
    {
        //Sorting an array in Java
/*

        int[] arr = { 13, 7, 6, 45, 21, 9, 101, 102 };
        System.out.println(" The items in the array are"+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(" The items in the array are"+Arrays.toString(arr));




        //Print a number in reverse
        int num = 12345;
        int rev = 0;
        System.out.println(num/10);

        while (num>0)
        {
            rev = rev * 10 + num % 10;
            num = num/10;
            System.out.println("number is"+num);
            System.out.println("reverse number is "+rev);
        }

        System.out.println(rev);

*/
        //Print a string in reverse
/*

        String str = "i am fine";
        String rev = "";
        int num = str.length();
        ArrayList<Character> strarr = new ArrayList<Character>();

        for(int i=0;i<num;i++)
        {
            strarr.add(str.charAt(i));
        }
        System.out.println(strarr);

        for(int i=num-1;i>=0;i--)
        {
           rev = rev+ strarr.get(i);
            System.out.println(rev);
        }

        System.out.println(rev);*/

        //TESLA
/*        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter the value for N");

        int n = myobj.nextInt();
        System.out.println("Value entered for N is: "+n);

        //int n = 2;
        int newarray[] = new int[n];


        for(int i = 0,j=n-1;i<n/2;i++,j--)
        {
            newarray[i]=i+1;
            newarray[j]=-(i+1);
            System.out.println("Array in loop"+Arrays.toString(newarray));
        }
        if;(n%2 ==1)
        {
            newarray[n/2]=0;
            System.out.println(n/2);
        }


        System.out.println(Arrays.toString(newarray));

*/
 //--------------

/*
        int[] numarray = {1,2,3,4,5,1};
        System.out.println("The array is : "+Arrays.toString(numarray));
        Arrays.sort(numarray);
        System.out.println("The Sorted array is : "+Arrays.toString(numarray));
        -----------------
        */


/*        String s = "rat";
        String t = "cat";

        char[] charsarray = s.toCharArray();
        char[] chartarray= t.toCharArray();

        Arrays.sort(charsarray);System.out.println("String s Sorted is:"+Arrays.toString(charsarray));
        Arrays.sort(chartarray);System.out.println("String t Sorted is:"+Arrays.toString(chartarray));

        if (Arrays.equals(charsarray,chartarray))
        {
            System.out.println("they are Anagram");
        }
        else
            System.out.println("they are NOT Anagram");


        -------------*/


/*
        int[] result = new int[2];
        int[] nums = {2,7,15,11};
        int target=9;
        System.out.println("the length of nums array is: "+nums.length);

        for(int i=0;i<=2;i++)
        {
            for(int j=i+1;j<=3;j++)
            {
                System.out.println("Nums[i] is"+nums[i]);
                System.out.println("Nums[j] is"+nums[j]);

                if((nums[i]+nums[j])== target)
                {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        System.out.println(Arrays.toString(result));*/


/*
        String i = "eat";
        String a = "tea";
        char[] iarray = i.toCharArray();
        char[] aarray = a.toCharArray();
        Arrays.sort(iarray);
        Arrays.sort(aarray);
        System.out.println(Arrays.toString(iarray));
        System.out.println(Arrays.toString(aarray));
        if (Arrays.equals(iarray,aarray))
        {
            System.out.println("Hello");
        }*/

       /* String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> res = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            System.out.println("the value of i is: "+strs[i]);
            char str[] = strs[i].toCharArray();
            // sort string
            Arrays.sort(str);
            System.out.println("the value of STR is"+Arrays.toString(str));
            String s = String.valueOf(str);
            System.out.println("the value of S is"+s);
            if(map.get(s)!=null){
                List<String> a = map.get(s);
                a.add(strs[i]);
                map.put(s, a);
                System.out.println("the Map Value is "+map);
            }
            else{
                List<String> a = new ArrayList<>();
                a.add(strs[i]);
                map.put(s, a);
            }
        }
        for(Map.Entry<String, List<String>> en:map.entrySet()){
            res.add(en.getValue());
        }
*/


  /*      int[] arr = {10 , 3, -4 , 1 , -6 , 10};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int n = arr.length;
        System.out.println(n);
        for (int i = 0;i<n-2;i++)
        {
            for (int j=i+1;j<n-1;j++)
            {
                for (int k=j+1;k<n;k++)
                {
                    if (arr[i]+arr[j]+arr[k]==0)
                    {
                        System.out.println("The answers are:"+arr[i]+":"+arr[j]+":"+arr[k]);
                    }
                }
            }
        }*/

        hello h1 = new hello();
        //h.printhello();

        PrintallPrimeNum pp2 = new PrintallPrimeNum();
        //pp2.printallprimenumbers(10);

        PalindromeNumber p3 = new PalindromeNumber();
       // p3.isPalinderome(123);
        // System.out.println(p3.isPalinderome(123));

        ContainsDuplicate c4 = new ContainsDuplicate();
        int[] n = {1,1,1,3,3,4,3,2,4,2};
        //c4.containsDuplicate(n);
        //c4.findduplicate();
        //System.out.println( c4.findduplicate());
        //System.out.println(c4.findduplicatehashsetway());

        ValidAnagram v5 = new ValidAnagram();
       // v5.isAnagram("rat","tar");

        GroupAnagram g6 = new GroupAnagram();
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        //g6.groupAnagrams(strs);

        PalindromeString p7 = new PalindromeString();
        //System.out.println(p7.isPalindrome(",; W;:GlG:;l ;,"));

        BuyAndSellStock b8 = new BuyAndSellStock();
        int[] prices = {7,1,5,3,6,4};
        //b8.maxProfit(prices);


        LongestSubstringNoDuplicates l9 = new LongestSubstringNoDuplicates();
        //l9.lengthOfLongestSubstring("pwwkew");
        //l9.secondway("abcba");

        ArrayListWithoutDuplicates a10 = new ArrayListWithoutDuplicates();
        //a10.printlistwithnoduplicates();

        ReverseAString r11 = new ReverseAString();
        //r11.reverseastring("hello how are you?");
        //r11.reverseastringSecondway("hello how are you?");

        ReverseWords r12 = new ReverseWords();
       // r12.doreversewords("i like programming very much");

        Parantheses p13 = new Parantheses();
        //p13.isvalidParantheses("()[]{}");
        //p13.isvalidParantheses("(]");

        KFrequentElements k14 = new KFrequentElements();
        //int[] s = {3,4,7,4,4,7};
       // k14.topKFrequent(s,2);

        BinarySearch b15 = new BinarySearch();
       // int[] ar = {-1,0 , 10 , 14 , 17 , 20 , 25};
       // System.out.println(b15.binsearch(ar,0 , ar.length-1,-2 ));


        SubArrayWithGivenSum s16 = new SubArrayWithGivenSum();
        int[] A = {8,9,0,1,2,3,7,5};
        //s16.subarraySum(A,5,12);

        PrimeOrNot p17 = new PrimeOrNot();
        //System.out.println(""+p17.isPrime(1));

        MegeTwoSortedArrays m18 = new MegeTwoSortedArrays();
        int[] a = {1,35};
        int[] b = {6,9,13,15,20};
        //m18.merge(a,b);
       // m18.mergewithoutSpace(a,b);

        SingleNumber s19 = new SingleNumber();
        int[] s = {3,1,1,8,3};
       // System.out.println("Single Number is : "+s19.findsingleNumber(s));

        RemoveEvenIntegers r20 = new RemoveEvenIntegers();
        int[] r = {6,9,13,15,20,99,98,76,74,47,44,33,22,12,9,5};
       // r20.removeEvenIntegersfromArray(r);

        ReverseArray r21 = new ReverseArray();
        int[] ra = {6,9,13,15,20,99,98,76,74,47,44,33,22,12,9,5};
        r21.reverseanArray(ra);


    }



}


