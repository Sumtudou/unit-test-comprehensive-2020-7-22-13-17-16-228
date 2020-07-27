package example;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class GenerateNumberImpl implements GenerateNumber{
    @Override
    public int[] getAnswer() {
        int[] answers = new int[4];
        Random random = new Random();
        int answerArrIndex = 0;
        while(true){
            int num = random.nextInt(10);
            if(!contains(answers,num)){
                answers[answerArrIndex++] = num;
            }
            if(answerArrIndex == 4)
                break;
        }
        return answers;
    }
    public static boolean contains(int[] arr, int target){
        for(int num:arr){
            if(num == target){
                return true;
            }
        }
        return false;
    }
}
