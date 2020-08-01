package example;

public class Main {
    public static void main(String[] args) {
        GenerateNumber generateNumber = new GenerateNumberImpl();
        GuessNumber guessNumber = new GuessNumber(generateNumber);
        DigitalInput digitalInput = new DigitalInput();
        GameProcess.playGame(guessNumber, digitalInput);
    }
}
