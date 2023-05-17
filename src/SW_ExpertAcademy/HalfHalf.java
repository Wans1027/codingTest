package SW_ExpertAcademy;

import java.util.*;

public class HalfHalf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();



        HashSet<Character> lh = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            lh.add(s.charAt(i));
        }

        if (lh.size() > 2) System.out.println("No");
        else System.out.println("Yes");
    }
}
