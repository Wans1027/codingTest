package SW_ExpertAcademy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Password1234 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        List<Character> arr = new ArrayList<>();
        for (int i = 0; i < s[1].length(); i++) {
            arr.add(s[1].charAt(i));
        }
        boolean isLoop = true;
        while (isLoop) {
            for (int i = 0; i < arr.size() - 1; i++) {

                if (arr.get(i).equals(arr.get(i + 1))) {
                    arr.remove(i);
                    arr.remove(i);
                    break;
                }
                if (i == arr.size()-2) {
                    isLoop = false;
                }
            }
        }

        for (Character character : arr) {
            System.out.print(character);
        }
        System.out.println();
    }
}
