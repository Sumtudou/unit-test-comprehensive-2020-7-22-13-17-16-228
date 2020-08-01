package example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GenerateNumberImplTest {
    @Test
    public void should_return_true_when_generateNumber_given_input_between_0_9() {
        //given
        GenerateNumberImpl generateNumberImpl = new GenerateNumberImpl();
        //when
        int[] answerArray = generateNumberImpl.getAnswer();
        //then
        boolean isTestPass = true;
        for (int numItem : answerArray) {
            if (numItem < 0 || numItem > 9){
                isTestPass = false;
            }
        }
        assertTrue(isTestPass);
    }

    @Test
    public void should_return_true_when_generateNumber_given_input_number_not_repeat() {
        //given
        GenerateNumberImpl generateNumberImpl = new GenerateNumberImpl();
        //when
        int[] answerArray = generateNumberImpl.getAnswer();
        //then
        boolean isTestPass = true;
        Arrays.sort(answerArray);
        for (int i = 0; i < answerArray.length - 1; i++) {
            if (answerArray[i] == answerArray[i + 1]) {
                isTestPass = false;
            }
        }
        assertTrue(isTestPass);
    }


    @Test
    public void should_return_true_when_generateNumber_given_input_between_0_9_and_not_repeat() {
        //given
        GenerateNumberImpl generateNumberImpl = new GenerateNumberImpl();
        //when
        int[] answerArray = generateNumberImpl.getAnswer();
        //then
        boolean isTestPass = true;
        for (int numItem : answerArray) {
            if (numItem < 0 || numItem > 9){
                isTestPass = false;
            }
        }
        Arrays.sort(answerArray);
        for (int i = 0; i < answerArray.length - 1; i++) {
            if (answerArray[i] == answerArray[i + 1]) {
                isTestPass = false;
            }
        }
        assertTrue(isTestPass);
    }
}
