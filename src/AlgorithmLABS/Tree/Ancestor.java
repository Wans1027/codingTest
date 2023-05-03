package AlgorithmLABS.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ancestor {
    static List<Integer>[] nodes;
    static boolean[] color;
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        nodes = new ArrayList[n];
        color = new boolean[n];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            nodes[i] = new ArrayList<>();
        }
        for (int i = 0; i < n-1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            nodes[a].add(b);
        }


        /*for (List<Integer> node : nodes) {
            System.out.println(node);
        }*/
        getMNode(x);
        //System.out.println();
        getMNode(y);
    }

    private static void getMNode(int x) {
        if(color[x]){
            System.out.println(x);
            return;
        }
        color[x] = true;
        //System.out.print(x+" ");
        for (int i = 0; i < n; i++) {
            for (Integer integer : nodes[i]) {
                if(integer == x){
                    getMNode(i);
                }
            }
        }
    }
}
