package example;

import java.util.Arrays;
import java.util.Scanner;

public class DigitalInput {

    public int[] getInputNumArr() {
        Scanner scanner = new Scanner(System.in);
        int[] inputNum = new int[4];
        String inputStr = scanner.nextLine().trim();
        if (!isInputStrLegal(inputStr)) return null;
        String[] splitStr = inputStr.split("\\s+");

        if (splitStr.length == 4) {
            for (int i = 0; i < 4; i++) {
                inputNum[i] = Integer.parseInt(splitStr[i]);
            }
            if (isInputNumLegal(inputNum)) {
                return inputNum;
            }
        }
        return null;
    }

    private boolean isInputStrLegal(String inputStr) {
        for (int i = 0; i < inputStr.length(); i++) {
            char charAtIndex = inputStr.charAt(i);
            if (!((charAtIndex >= '0' && charAtIndex <= '9') || charAtIndex == ' ')) {
                return false;
            }
        }
        return true;
    }

    public boolean isInputNumLegal(int[] inputArr) {
        if (inputArr.length != 4) {
            return false;
        }
        for (int inputItem : inputArr) {
            if (inputItem < 0 || inputItem > 9) {
                return false;
            }
        }

        int[] copyArr = Arrays.copyOfRange(inputArr,0,4);
        Arrays.sort(copyArr);
        for (int i = 0; i < copyArr.length - 1; i++) {
            if (copyArr[i] == copyArr[i + 1]) {
                return false;
            }
        }
        return true;
    }

}
