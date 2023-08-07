package Programmers.Level3;

import java.util.*;

public class BaloonBombDFS {
   // static LinkedList<Integer> li = new LinkedList<>();
    static HashSet<Integer> set = new HashSet<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        int a = solution(arr);
        System.out.println(a);

    }
    public static int solution(int[] a) {
        LinkedList<Integer> li = new LinkedList<>();
        for (int i : a) {
            li.add(i);
        }
        dfs(li, 1);
        dfs(li, -1);
        if(li.size()%2 ==0 ) return set.size();
        else return set.size()+1;
        //return set.size();
    }

    private static void dfs(LinkedList<Integer> list, int c){
        //list = new LinkedList<>(list);
        if(list.size() == 1){
            set.add(list.get(0));
            return;
        }
        for (int i = 1; i < list.size(); i++) {
            list = new LinkedList<>(list);
            int loc = whatBalloon(list.get(i - 1), list.get(i), c, i);
            int removed = list.remove(loc);
            dfs(new LinkedList<>(list), c*-1);
            //list.add(loc, removed);
        }

    }

    private static int whatBalloon(int a, int b, int c, int loc){
        int result = 3;
        if(c == 1){
            result = Math.max(a,b);
        }
        else {
            result = Math.min(a,b);
        }

        if(result == a) return loc-1;
        else return loc;
    }
}
public class BalloonBombCollectAnswer {
    public static void main(String[] args) {
    }
    public int solution(int[] a) {
        int answer = 0;
        return answer;
    }
}

