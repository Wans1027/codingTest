package BaekJoon.PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MaxHeap {
    static PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if(a == 0) {
                if(pq.size() == 0){
                    sb.append(0 + "\n");
                } else sb.append(pq.poll() + "\n");
            }
            else pq.add(a);
        }
        System.out.println(sb);
    }
}
