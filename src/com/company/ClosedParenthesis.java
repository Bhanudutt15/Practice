package com.company;
import java.util.Stack;

public class ClosedParenthesis {

    public static void main(String args[]) {
        String s =  "{]}";
        ClosedParenthesis ques = new ClosedParenthesis();
        System.out.println(ques.parenthesis(s));
    }

    public boolean parenthesis(String s) {
        boolean b = true;
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            switch (ch) {

                case '(':
                case '{':
                case '[':
                    st.push(ch);
                    break;

                case ')':
                    if (st.isEmpty() || st.pop() != '(') {
                       return false;
                    }
                    break;

                case '}':
                    if (st.isEmpty() || st.pop() != '{') {
                       return false;
                    }
                    break;
                case ']':
                    if (st.isEmpty() || st.pop() != '[') {
                       return false;
                    }
                    break;
            }

        }
        return st.isEmpty();

    }
    }

