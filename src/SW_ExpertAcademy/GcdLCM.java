package SW_ExpertAcademy;

public class GcdLCM {
    public static void main(String[] args) {
        int num1 = 48;
        int num2 = 60;

        int gcd = getGCD(num1, num2);
        System.out.println("the greatest common denominator : " + gcd);
        System.out.println("the lowest common multiple : " + (num1 * num2) / gcd);

    }

    public static int getGCD(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        }
        return getGCD(num2, num1%num2);
    }
}
