package BaekJoon2.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Coin0 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(sc.nextLine());
            arr.add(a);
        }
        Collections.reverse(arr);
        int result = 0;
        for (Integer m : arr) {
            result += k / m;
            k = k % m;
        }
        System.out.println(result);

    }
}
