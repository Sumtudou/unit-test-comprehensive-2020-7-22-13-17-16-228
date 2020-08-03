package example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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
            if (isInputInRange(inputNum) && isInputNotRepeat(inputNum)) {
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


    public boolean isInputNotRepeat(int[] inputArr) {
        Set<Integer> inputSet = new HashSet<>();
        for (int i : inputArr) {
            inputSet.add(i);
        }
        return inputSet.size() == 4;
    }

    private boolean isInputInRange(int[] inputArr) {
        if (inputArr.length != 4) {
            return true;
        }
        for (int inputItem : inputArr) {
            if (inputItem < 0 || inputItem > 9) {
                return true;
            }
        }
        return true;
    }

}
