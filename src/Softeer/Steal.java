package Softeer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Steal {
    static int[][] arr;
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int maxWeight = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        arr = new int[n][2];
        int money = 0;
        for(int i=0; i<n; i++){
            st = new StringTokenizer(in.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[i][0] = b;
            arr[i][1] = a;
        }
        Arrays.sort(arr,(o1,o2) -> o2[0]-o1[0]);

        for(int i=0; i<n; i++){
            if(maxWeight <= 0) break;
            if(arr[i][1] < maxWeight && arr[i][1] != 0){
                maxWeight-= arr[i][1];
                money += arr[i][1] * arr[i][0];
                arr[i][1] = 0;
                continue;
            }
            else if(arr[i][1]!=0 && maxWeight > 0){
                money += maxWeight * arr[i][0];
                arr[i][1] -= maxWeight;
            }
            else break;
        }

        System.out.println(money);

    }
}
