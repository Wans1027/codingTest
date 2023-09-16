import java.io.*;
import java.util.*;
class Main {
    static int n,m,k;
    static int[] visited;
    static List<List<Integer>> li = new ArrayList<>();
    static Queue<Integer> q = new LinkedList<>();
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();
        visited = new int[n+1];
        
        for(int i = 0; i<n+1; i++){
            li.add(new ArrayList<>());
        }
        for(int i = 0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            li.get(a).add(b);
        }
        for(int i = 0; i<n+1;i++){
            Collections.sort(li.get(i));
        }
        //dfs(k,0);
        //if(!r) System.out.println(-1);
        //else System.out.println(result-1);
        int bfs = bfs(k);
        System.out.println(bfs);


    }
    static int result = 0;
    static boolean r = false;

    private static void dfs(int x, int cnt){


        for(int i = 0; i<li.get(x).size(); i++){
            int a = li.get(x).get(i);
            if(visited[a] != 1){
                visited[a] = 1;
                if(a == k){
                    result = Math.min(result, cnt);
                    r = true;
                    return;
                }
                cnt++;
                dfs(a,cnt);
                visited[a] = 0;
            }
        }
    }

    private static int bfs(int start){
        q.add(start);
        while(!q.isEmpty()){
            int poll = q.poll();
            for(int i = 0 ; i< li.get(poll).size(); i++){
                int a = li.get(poll).get(i);
                if(visited[a] == 0){
                    System.out.println(a+" ");
                    if(a == start) return visited[poll]+1;
                    visited[a] = visited[poll]+1;
                    q.add(a);
                }
            }
        }
        return -1;

    }
}