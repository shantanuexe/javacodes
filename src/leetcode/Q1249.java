package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Q1249 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        String input= sc1.next();
        String output=minRemoveToMakeValid(input);

        System.out.println(output);

    }

    public static String minRemoveToMakeValid(String s) {
        int n = s.length();
        Stack<Integer> st = new Stack<>();
        for(int j=s.length()-1;j>=0;j--){
            int ch =s.charAt(j);

            if(ch==')'){st.push(j);}
            else if(ch=='('){
                if(!st.isEmpty() && s.charAt(st.peek())==')'){
                    st.pop();}
                else{st.push(j);}
            }

//l))))(
        }
        List<Integer> l = new ArrayList<>();
        while(!st.isEmpty()){l.add(st.pop());}
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<n;i++){
            if(!l.contains(i)){ans.append(s.charAt(i));}
        }
        // System.out.println(l);
        // System.out.println(ans.toString());




        return ans.toString();
    }}