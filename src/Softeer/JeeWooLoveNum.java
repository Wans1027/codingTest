package Softeer;

import java.util.*;

public class JeeWooLoveNum {

    static PriorityQueue<Integer> q = new PriorityQueue<>();
    static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] challenge = new int[3][n];
        Integer[] finalScore = new Integer[n];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < n; j++) {
                int nextInt = sc.nextInt();
                challenge[i][j] = nextInt;
                finalScore[j] = nextInt + finalScore[j].intValue();
                list.add(nextInt);
            }
            list.sort(Collections.reverseOrder());
            for (int j = 0; j < 3; j++) {
                int i1 = list.indexOf(challenge[i][j]);
                sb.append(i1 + 1 + " ");
            }
            sb.append("\n");
            list.clear();
        }
        List<Integer> fs = new ArrayList<>();
        Collections.addAll(fs, finalScore);
        fs.sort(Collections.reverseOrder());
        for (int i = 0; i < 3; i++) {
            int i1 = fs.indexOf(finalScore[i]);
            sb.append(i1+" ");
        }
        System.out.println(sb);
    }
}
