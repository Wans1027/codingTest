package AlgorithmLABS.Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//트리순회결과 출력하기
public class TreeFlow {
    static List<Integer>[] nodes;

    /**
     * 6
     * 0 1 2
     * 1 3 4
     * 2 -1 5
     * 3 -1 -1
     * 4 -1 -1
     * 5 -1 -1
     * Root L R
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        nodes = new ArrayList[n];

        sc.nextLine();

        for (int i = 0; i < n; i++) {
            nodes[i] = new ArrayList<>();
        }
        for (int i = 0; i < n; i++) {

            int[] s = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int a = s[0];
            int b = s[1];
            int c = s[2];

            nodes[a].add(b);
            nodes[a].add(c);

        }

//        for (List<Integer> node : nodes) {
//            for (Integer integer : node) {
//                System.out.print(integer);
//            }
//            System.out.println();
//        }

        getPre(0);
        System.out.println();
        getCenter(0);
        System.out.println();
        getPost(0);

    }
    private static void getPost(int x) {

        if(nodes[x].get(0) > -1) getPost(nodes[x].get(0));
        if(nodes[x].get(1) > -1) getPost(nodes[x].get(1));
        System.out.print(x+" ");
    }

    private static void getPre(int x) {
        System.out.print(x+" ");
        if(nodes[x].get(0) > -1) getPre(nodes[x].get(0));
        if(nodes[x].get(1) > -1) getPre(nodes[x].get(1));
    }

    private static void getCenter(int x) {

        if(nodes[x].get(0) > -1) getCenter(nodes[x].get(0));
        System.out.print(x+" ");
        if(nodes[x].get(1) > -1) getCenter(nodes[x].get(1));
    }


}
