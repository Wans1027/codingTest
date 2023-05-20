package Programmers.Level2;

public class RepeatBinaryTrans {
    public static void main(String[] args) {
        /**
         * s에서 0을 제거, 제거한 0의 개수를 카운트
         * 제거한 문자열의 길이를 이진수로 변환
         * 1이 될때 까지 반복
         */
    }
    public int[] solution(String s) {
        int[] answer = new int[2];
        int zeroCnt = 0;
        int loopCnt = 0;
        while(!s.equals("1")){
            loopCnt++;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    zeroCnt++;
                }
            }
            s = s.replaceAll("0", "");
            s = Integer.toBinaryString(s.length());
        }
        answer[0] = loopCnt;
        answer[1] = zeroCnt;


        return answer;
    }
}
