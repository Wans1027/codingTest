package Softeer;
import java.util.*;
public class SecretMenu
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();
        String se = sc.nextLine();
        String sa = sc.nextLine();
        String result = secret(se, sa);
        System.out.println(result);

    }

    private static String secret(String se, String sa){
        if(se.length() > sa.length()) return "normal";

        for(int i=0; i < sa.length(); i+=2){
            try{
                if(se.equals(sa.substring(i, i+se.length()))) return "secret";
            }catch(Exception e){
                return "normal";
            }
        }
        return "normal";
    }
}
