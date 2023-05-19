package SW_ExpertAcademy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Flatten1208 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<Integer> li = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            li.add(sc.nextInt());
        }
        for (int i = 0; i < n; i++) {
            Integer max = Collections.max(li);
            Integer min = Collections.min(li);
            int i1 = li.indexOf(max);
            int i2 = li.indexOf(min);
            li.set(i1,max-1);
            li.set(i2,min+1);
        }

        int result = Collections.max(li) - Collections.min(li);
        System.out.println(result);

    }
}
