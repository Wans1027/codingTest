import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,2,2,2,2,6,7,8};
        int a = binarySearch(arr, 5);
        System.out.println(a);
        int b = binarySearchRight(arr, 5);

        System.out.println(b);
        int i = Arrays.binarySearch(arr, 5);
        System.out.println(i);

    }


    private static int binarySearch(int[] arr, int X) {
        //이거쓰셈 //없는 숫자는 이상하게 나옴
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
    private static int binarySearchRight(int[] arr, int X) {
        //이거쓰셈
        int start = 0;
        int end = arr.length;

        while (start < end) {
            int mid = (start + end) / 2;
            if(X < arr[mid]){
                end = mid;
            } else start = mid + 1;
        }

        return start-1;
    }

    private static int binarySearch2(int[] arr, int X){
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] < X) start = mid + 1;
            else if(arr[mid] > X) end = mid - 1;
            else return mid;
        }
        return -1;
    }
}
