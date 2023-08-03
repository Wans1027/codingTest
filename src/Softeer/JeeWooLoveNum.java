package Softeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class JeeWooLoveNum {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;


        int n = Integer.parseInt(br.readLine());
        LinkedList<Integer> li = new LinkedList<>();
        int[] finalScore = new int[n];
        LinkedList<Integer> fli = new LinkedList<>();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());

            int[] challenge = new int[n];
            for (int j = 0; j < n; j++) {

                int a = Integer.MAX_VALUE - Integer.parseInt(st.nextToken());
                challenge[j] = a;
                finalScore[j] = a + finalScore[j];
                li.add(a);
            }
            int[] clone = challenge.clone();
            Arrays.sort(clone);

            for (int j = 0; j < n; j++) {
                int i2 = lowerBound(clone, challenge[j]);
                sb.append(i2+1+" ");
            }
            li.clear();
            sb.append("\n");
        }
        /*for (int i = 0; i < n; i++) {
            finalScore[i] = Integer.MAX_VALUE - finalScore[i];
        }*/
        int[] clone = finalScore.clone();
        Arrays.sort(clone);
        for (int i = 0; i < n; i++) {
            int i1 = lowerBound(clone, finalScore[i]);
            sb.append(i1+1+" ");
        }

        System.out.println(sb);
    }

    private static int lowerBound(int[] arr, int X) {
        int start = 0;
        int end = arr.length; // start 가 마지막 인덱스 직전까지 체크되어야한다.

        while (start < end) {
            int mid = (start + end) / 2;

            /* target 이 중간값보다 작거나 같다면, 끝을 중간값으로 */
            if (X <= arr[mid]) {
                end = mid;
            } else { /* target 이 중간값보다 크다면 시작을 중간값 다음으로 */
                start = mid + 1;
            }
        }

        //System.out.println("lowerBound low : " + start);
        return start;
    }

    private static int upperBound(int[] arr, int X) {
        int start = 0;
        int end = arr.length;

        while (start < end) {
            int mid = (start + end) / 2;

            if (X >= arr[mid]) { /* target 이 중간값보다 크거나 같다면, 시작을 중간값 다음으로 */
                start = mid + 1;
            } else { /* target 이 중간값보다 작다면 끝을 중간값으로 */
                end = mid;
            }
        }

        System.out.println("upperBound low : " + start);
        return start - 1;
    }
}
