package BaekJoon2;

import java.util.LinkedList;
import java.util.Scanner;

public class Ghalho {
    static LinkedList<Character> q = new LinkedList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ghalho = ghalho(s);
        System.out.println(ghalho);

    }

    private static String ghalho(String s) {
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') q.add(s.charAt(i));
            else {
                Character poll = q.poll();
                if (poll == null) {
                    return"NO";
                }
            }
        }
        if(q.isEmpty()) return "YES";
        else return "NO";
    }
}
