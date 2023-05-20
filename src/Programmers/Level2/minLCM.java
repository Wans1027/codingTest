package Programmers.Level2;

public class minLCM {
    public static void main(String[] args) {
        //여러개의 수의 최소공배수 구하기

    }

    public int solution(int[] arr) {

        int a = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int b = arr[i];
            int gcm = getGcm(a, b);
            a = a * b / gcm;
        }
        return a;
    }

    private static int getGcm(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return getGcm(b, a % b);
    }
}
