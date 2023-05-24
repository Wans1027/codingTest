package BaekJoon.StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class Zero10773 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a == 0) {
                st.pop();
            } else st.push(a);
        }
        int sum = 0;
        for (Integer i : st) {
            sum+= i;
        }
        System.out.println(sum);
    }
}
