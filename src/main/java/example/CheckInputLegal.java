package example;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.Arrays;

public class CheckInputLegal {

    public  boolean isInputLegal(int[] inputArr) {
        if (inputArr.length != 4) {
            return false;
        }
        for (int inputItem : inputArr) {
            if (inputItem < 0 || inputItem > 9) {
                return false;
            }
        }

        Arrays.sort(inputArr);
        for (int i = 0; i < inputArr.length - 1; i++) {
            if (inputArr[i] == inputArr[i + 1]) {
                return false;
            }
        }
        return true;
    }

}
