package BaekJoon2.Any;

import java.util.*;

public class Any1764 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        HashSet<String> map = new HashSet<>();
        for (int i = 0; i < n; i++) {
            map.add(sc.nextLine());
        }
        int cnt = 0;
        StringBuilder sb = new StringBuilder();
        List<String> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String s = sc.nextLine();
            boolean contains = map.contains(s);
            if (contains) {
                cnt++;
                result.add(s);
            }
        }
        Collections.sort(result);
        for (String s : result) {
            sb.append(s + "\n");
        }
        System.out.println(cnt);
        System.out.println(sb);
    }
}
