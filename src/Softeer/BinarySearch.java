package Softeer;

public class BinarySearch {
    public static void main(String[] args) {

    }


    private static int binarySearch(int[] arr, int X) {
        int start = 0;
        int end = arr.length;

        while (start < end) {
            int mid = (start + end) / 2;
            if(X <= arr[mid]){
                end = mid;
            } else start = mid + 1;
        }

        return start;
    }
}
