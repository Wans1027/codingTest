package Programmers.Level2;

import java.util.Scanner;
import java.util.Stack;

public class RightGualHo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        extracted(s);
    }


    private static void extracted(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if(i == 0) st.add(s.charAt(0));
            else {
                if (s.charAt(i) == '(') {
                    st.add('(');
                } else if (s.charAt(i) == ')') {
                    if (st.isEmpty()) {
                        System.out.println("false");
                        break;
                    }
                    else st.pop();
                }
            }
        }
        if (st.isEmpty()) {
            System.out.println("true");
        }else System.out.println("false");
    }
}
