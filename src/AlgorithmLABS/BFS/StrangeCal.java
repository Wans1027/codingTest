package AlgorithmLABS.BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StrangeCal {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] value = new int[1000000];

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        value[1] = 1;

        while (!q.isEmpty()) {
            int tmp = q.poll();
            int mul = tmp * 2;
            int div = (int) tmp / 3;

            if (mul > 0 && mul <=99999) {
                if (value[mul] == 0) {
                    value[mul] = value[tmp] + 1;//몇번째를 저장
                    q.add(mul);
                }
                /*else
                    value[mul] = Math.min(value[mul], value[tmp] + 1);*/
                if (mul == n)
                    break;
            }

            if (div > 0 && div <=99999) {
                if (value[div] == 0) {
                    value[div] = value[tmp] + 1;
                    q.add(div);
                }
                /*else
                    value[div] = Math.min(value[div], value[tmp] + 1);*/
                if (div == n)
                    break;
            }

        }
        System.out.println(value[n]-1);
    }
}
