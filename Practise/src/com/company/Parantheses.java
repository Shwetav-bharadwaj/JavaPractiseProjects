package com.company;

import java.util.Stack;

public class Parantheses {

    public boolean isvalidParantheses(String s) {
        boolean isvalid = true;

        System.out.println("The length of String is " + s.length());
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            System.out.println("the char at i is" + s.charAt(i));
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                st.push(s.charAt(i));
            } else if (st.empty() && s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}') {
                isvalid = false;
                break;
            }

            /*public boolean isValid(String s) {
            Stack<Character> stack = new Stack<Character>();
            for (char c : s.toCharArray()) {
                if (c == '(')
                    stack.push(')');
                else if (c == '{')
                    stack.push('}');
                else if (c == '[')
                    stack.push(']');
                else if (stack.isEmpty() || stack.pop() != c)
                    return false;
            }
            return stack.isEmpty();
        }*/


 /*           Scanner in = new Scanner(System.in);
            Stack<Integer> stack = new Stack<Integer>();



            public boolean check()
            {
                System.out.println("Please enter your expression.");
                String newExp = in.next();
                String[] exp = new String[newExp];
                for (int i = 0; i < size; i++)
                {


                    char ch = exp.charAt(i);
                    if (ch == '(' || ch == '[' || ch == '{')
                        stack.push(i);
                    else if (ch == ')'|| ch == ']' || ch == '}')
                    {
                        //nothing to match with
                        if(stack.isEmpty())
                        {
                            return false;
                        }
                        else if(stack.pop() != ch)
                        {
                            return false;
                        }

                    }
                }
                if (stack.isEmpty())
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }






        }

      -------
       public static boolean balancedParenthensies(String s) {
        Stack<Character> stack  = new Stack<Character>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '[' || c == '(' || c == '{' ) {
                stack.push(c);
            } else if(c == ']') {
                if(stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
            } else if(c == ')') {
                if(stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            } else if(c == '}') {
                if(stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }


  */


        }
        return isvalid;
    }
}
