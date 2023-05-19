package SW_ExpertAcademy;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PWProductor { //1225
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < 8; i++) {
            q.add(sc.nextInt());
        }
        int cnt = 0;
        while (true) {
            cnt %= 5;
            cnt++;
            int poll = q.poll();
            if((poll - cnt) <= 0){
                q.add(0);
                break;
            }
            else q.add(poll - cnt);
        }

        for (Integer i : q) {
            System.out.print(i+" ");
        }
    }
}
