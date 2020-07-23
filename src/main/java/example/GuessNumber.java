package example;

public class GuessNumber {
    private int[] answer;

    GuessNumber(int[] answer) {
        this.answer = answer;
    }

    public String guess(int[] inputNumArr) {
        int sumA = this.getSumA(inputNumArr);   //sum of A
        int sumAB = this.getSumAB(inputNumArr); // sum of (A add B)
        int sumB = sumAB - sumA;
        return String.valueOf(sumA) + "A" +
                String.valueOf(sumB) + "B";
    }

    public int getSumA(int[] inputNumArr){
        int sumA = 0;
        for (int i = 0; i < inputNumArr.length; i++) {
            if (inputNumArr[i] == answer[i]) {
                sumA++;
            }
        }
        return sumA;
    }

    public  int getSumAB(int[] inputNumArr){
        int sumAB = 0;
        for (int inputNumItem : inputNumArr) {
            for (int answerItem : answer) {
                if (answerItem == inputNumItem) {
                    sumAB++;
                    break;
                }
            }
        }
        return sumAB;
    }
}
