package example;

public class GuessNumber {
    private int[] answer;

    GuessNumber(int[] answer) {
        this.answer = answer;
    }

    public String guess(int inputNumArr[]) {
        int sumA = 0;
        int sumAB = 0;

        for (int inputNumItem : inputNumArr) {
            for (int answerItem : answer) {
                if (answerItem == inputNumItem) {
                    sumAB++;
                    break;
                }
            }
        }

        for (int i = 0; i < inputNumArr.length; i++) {
            if (inputNumArr[i] == answer[i]) {
                sumA++;
            }
        }
        if (sumA == 4) {
            return "4A0B";
        }

        if(sumAB == 0){
            return "0A0B";
        }
        return null;
    }
}
