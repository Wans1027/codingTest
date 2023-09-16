import java.util.*;
import java.util.stream.Collectors;

public class Basic {
    public static void main(String[] args) {
        //배열 -> 세트 -> 배열
        Integer[] arr = new Integer[]{1,2,3,3,4,4,4,5};
        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
        Integer[] newArr = set.toArray(new Integer[0]);
        System.out.println(Arrays.toString(newArr));
        //세트 -> 리스트
        List<Integer> setList = set.stream().toList();

        //배열을 리스트로
        Integer[] arr2 = {1,2,3,4,5};
        List<Integer> li = new ArrayList<>(Arrays.asList(arr2));

        //리스트를 배열로
        Integer[] arr3 = li.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr3));

        int[] a = {1,1,1,2,2,2};
        Set<Integer> s = new HashSet<>();
        Arrays.stream(a).forEach(s::add);
        List<Integer> ali = s.stream().toList();
        System.out.println(ali);

        int[] ints = Arrays.stream(a).distinct().toArray();
        System.out.println(Arrays.toString(ints));


        String numbers = "1,2,3,4,5";
        int[] nums = Arrays.stream(numbers.split(",")).mapToInt(Integer::parseInt).toArray();
        System.out.println(Arrays.toString(nums));
    }
}
