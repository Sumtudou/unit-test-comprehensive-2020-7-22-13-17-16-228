package example;

public class GameProcess {
    private static final String gameBegin = "Please enter 4 integers separated by spaces:";
    private static final String illegalInput = "Wrong Input，Input again";
    private static final String gameOver = "Game over\nThe correct answer is: ";
    private static final String SUCCESS = "4A0B";
    private static final String successOutputStr = "Congratulations, you got all the numbers right";
    private static final int inputMaxTimes = 6;

    public static void playGame(GuessNumber guessNumber, DigitalInput digitalInput) {
        System.out.println(gameBegin);
        for (int i = 0; i < inputMaxTimes; i++) {
            int[] inputNumArr = digitalInput.getInputNumArr();
            if (inputNumArr == null) {
                System.out.println(illegalInput);
                i--;
                continue;
            }

            String guessRes = guessNumber.guess(inputNumArr);
            System.out.println(guessRes);

            if(guessRes.equals(SUCCESS)){
                System.out.println(successOutputStr);
                break;
            }
        }
        System.out.println(gameOver + guessNumber.getAnswer());
    }
}
