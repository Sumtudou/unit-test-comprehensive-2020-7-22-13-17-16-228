package example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        GenerateNumber generateNumber = new GenerateNumberImpl();
        GuessNumber guessNumber = new GuessNumber(generateNumber);
        playGame(guessNumber);
    }

    public static void playGame(GuessNumber guessNumber){
        System.out.println("Please enter 4 integers separated by spaces:");
        for (int i = 0; i < 6; i++) {   //input max is 6 times
            int[] inputNumArr = getInputNumArr();
            if (inputNumArr == null) {
                System.out.println("Wrong Input，Input again");
                i--;
                continue;
            }
            String guessRes = guessNumber.guess(inputNumArr);
            //System.out.println(guessNumber.getAnswer());
            System.out.println(guessRes);
        }
        System.out.println("Game over");
        System.out.println("The correct answer is: " + guessNumber.getAnswer());
    }

    public static int[] getInputNumArr() {
        Scanner scanner = new Scanner(System.in);
        CheckInputLegal checkInputLegal = new CheckInputLegal();
        int[] inputNum = new int[4];
        String inputStr = scanner.nextLine();

        //  if contains other characters  return null
        for (int i = 0; i < inputStr.length(); i++) {
            char charAtIndex = inputStr.charAt(i);
            if ((charAtIndex >= '0' && charAtIndex <= '9') || charAtIndex == ' ') {
                continue;
            } else {
                return null;
            }
        }

        String[] splitStr = inputStr.split(" ");
        if (splitStr.length == 4) {
            for (int i = 0; i < 4; i++) {
                inputNum[i] = Integer.parseInt(splitStr[i]);
            }
            if(checkInputLegal.isInputLegal(inputNum)){
                return inputNum;
            }
        }
        return null;
    }
}
