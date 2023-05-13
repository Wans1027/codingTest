package AlgorithmLABS.BinarySearch;

import java.io.*;
import java.util.*;


public class CountNum {
    static List<Integer> num = new ArrayList<>();
    static int a,b;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] ques = new int[q];
        for (int i = 0; i < n; i++) {
            num.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        Collections.sort(num);
        for (int i = 0; i < q; i++) {
           ques[i] = Integer.parseInt(st.nextToken());
        }

        for (int que : ques) {
            a = b = 0;
            getsNum(0,n, que);
            getENum(0,n,que);
            System.out.println(b - a);
        }

        br.close();
        bw.flush();
        bw.close();
    }



    private static void getsNum(int s, int e, int value) {
        if(num.get(s) == value){
            a = 0;
            return;
        }

        if (s+1 >= e) {
            if(num.get(e) == value) a = e;
            else a = 0;
        }
        else{
            int mid = (s+e)/2;
            if(num.get(mid) >= value) getsNum(s, mid, value);
            else if (num.get(mid) < value) {
                getsNum(mid, e, value);
            }
        }
    }

    private static void getENum(int s, int e, int value) {
        if(num.get(e-1) == value){
            b = e;
            return;
        }
        if (s+1 >= e) {
            if(num.get(s) == value) b = s;
            else b = 0;
        }
        else{
            int mid = (s+e)/2;
            if(num.get(mid) > value) getENum(s, mid, value);
            else if (num.get(mid) <= value) {
                getENum(mid, e, value);
            }
        }
    }
}
