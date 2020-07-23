package example;

public class GuessNumber {
    private int[] answer;
    GuessNumber(int[] answer) {
        this.answer = answer;
    }
    public String guess(int inputNumArr[]) {
        int sumA = 0;
        for (int i = 0; i < inputNumArr.length; i++) {
            if (inputNumArr[i] == answer[i]) {
                sumA++;
            }
        }
        if (sumA == 4) {
            return "4A0B";
        }
        return null;
    }
}
