package Programmers.Level2;

import java.util.Arrays;


public class Marathon {
    public static void main(String[] args) {

    }

    public String solution(String[] participant, String[] completion) {

        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        int a = 0;
        for (int i = 0; i < participant.length; i++) {
            try{
                if (!participant[i].equals(completion[i])) {
                    a = i;
                    break;
                }
            }catch (Exception e){
                a = completion.length;
                break;
            }
        }
        answer = participant[a];
        return answer;
    }
}
