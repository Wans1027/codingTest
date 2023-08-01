package BaekJoon2.Any;

import java.util.HashSet;
import java.util.Scanner;

public class St14425 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(sc.nextLine());
        }
        int cnt = 0;
        for (int i = 0; i < m; i++) {
            String s = sc.nextLine();
            if(set.contains(s)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
