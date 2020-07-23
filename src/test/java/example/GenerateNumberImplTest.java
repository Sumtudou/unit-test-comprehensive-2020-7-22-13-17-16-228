package example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GenerateNumberImplTest {
    @Test
    public void should_return_4_integer_array() {
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
        if(isTestPass){
            assertEquals(1, 1);
        }else{
            assertEquals(1, 2);
        }

    }
}
